In this project we will use Java based configuration


Java based config - refer javaBasedConfig method
If we want to use java based configuration we can use
AnnotationConfigApplicationContext object
We need to create a java file to maintain the configuration
refer AppConfig.java
We need to use @Configuration annotation if we want to mark the class as a configuration class
We need to mark the methods with @Bean annotation to let spring inject the object
Here too by default the prototype is Singleton

Bean Name - refer beanNameExample method
By default, the bean name will be the method name itself, if not specified

If we want to a name we can use @Bean(name = "my_laptop")
We can also use multiple names @Bean(name = {"my_laptop","custom_laptop"})


Scope Annotation - refer scopeAnnotation method
By default a @Bean scope is singleton, if we want to make it as prototype
we need to use additional annotation called @Scope
usage: @Scope(value = "prototype")


Autowire - refer autowireExample method
we can autowire within a bean definition to refer another bean
Ex:
@Bean
public Alien alien() {
Alien obj = new Alien();
obj.setAge(25);
obj.setCom(desk()); // autowiring desk() bean
return obj;
}

@Bean
public Desktop desk() {
return new Desktop();
}

But in the above example we are tightly coupling Desktop, to avoid we can use Computer ref :

public Alien alien(Computer com) {
Alien obj = new Alien();
obj.setAge(25);
obj.setCom(com);
return obj;
}

@Bean
public Desktop desk() {
return new Desktop();
}




Primary and Qualifier - refer primaryBeanExample method
When there are 2 matching beans, it will throw an error as seen in the XML configuration too
to fix this problem we can use qualifier annotation:

@Bean
public Alien alien(@Qualifier("lap") Computer com) {
Alien obj = new Alien();
obj.setAge(25);
obj.setCom(com);
return obj;
}

@Bean
public Desktop desk() {
return new Desktop();
}

@Bean
public Laptop lap() {
return new Laptop();
}

Alternatively we can also use @Primary annotation:

@Bean
public Alien alien(Computer com) {
Alien obj = new Alien();
obj.setAge(25);
obj.setCom(com);
return obj;
}

@Bean
@Primary
public Desktop desk() {
return new Desktop();
}

@Bean
public Laptop lap() {
return new Laptop();
}



Component Stereotype annotation - to simplify the config
refer componentStereoTypeExample method
We can annotate all the classes that we need with @Component annotation and spring will take care
We also need to use @ComponentScan annotation and specify the package path so spring can look
for components in that package to be injected
However we are not able to find the values of age and com as it's not set
How do we solve this:
1. Field Injection
2. Constructor Injection
3. Setter Injection

To set com we can use @Autowired annotation:
This is called field Injection
@Autowired
private Computer com;

Setter injection - Using @Autowired on a setter method
It is recommended to use Autowired annotation on the setter method

Constructor injection - using @Autowired on top of a constructor

Note that if ComponentScan finds 2 components that match the Computer instance, it will 
give an error
To fix this we can use @Qualifier annotation:
@Autowired
@Qualifier("desktop") //By default the qualifier name is the class name in all lower case
private Computer com;

if we want a different name, we can name the @Component differently:
@Component("desk")
public class Desktop implements Computer {

If we don't want to use a Qualifier, we can use primary @Primary annotation after the @Component
Ex:

@Component("desk")
@Primary
public class Desktop implements Computer {

Note: When we use @Primary and also use @Qualifier, qualifier always takes the precedence



Scope and Value Annotation:
We can use @Scope annotation on the bean component, and define either "prototype" or "singleton"
By default scope is Singleton:

Ex:
@Component("desk")
@Primary
@Scope("prototype")
public class Desktop implements Computer {

@Value annotation can be used to inject the value to a property
Ex:
@Value("21")
private int age;