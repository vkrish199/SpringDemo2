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