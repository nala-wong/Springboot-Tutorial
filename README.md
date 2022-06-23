# Springboot-Tutorial

## Core Spring
### Overview
- Spring container is an object factory
- Inversion of control: Create and manage objects
- Dependency inject: Inject object's dependencies

### Configuration
- XML configuration
- Annotations
- Source code

### Development Process
- Configure Beans
```
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
	<context::component-scan base-package="com.luv2code.springdemo">

    <bean id="myCoach" class="myClass">
    </bean>

</beans>
```
- Create spring container
    - ApplicationContext
    - ClassPathXmlApplicationContext

- Retrieve bean from spring container
```
ClassPathXmlApplicationContext context =
new ClassPathXmlApplicationContext("applicationContext.xml");
Coach theCoach = context.getBean("myCoach", Coach.class);
```

### Dependency Injection
- Constructor injection
    - Define dependency interface and class
    - Create constructor in your class for injection
    - Configure dependency injection in Spring config
    ```
    <bean id="myCoach"
    class="com.luv2code.springdemo.BaseballCoach">
    <constructor-arg ref="myFortuneService" />
    </bean>
    ```
- Setter injection
    - Create setter method in your class for injections
    - Configure the dependency injection in Spring config

### Inject value from properties file
- Create properties file
```
sport.properties
foo.email=123@email.com
```
- Load properties file in Spring config
```
<context:property-placeholder location="classpath:sport.properties"/>
```
- Reference values from property file
```
<bean id="myCoach" class="myClass">
    <property name="emailAddress" value="${foo.email}" />
</bean>
```


### Bean
#### Intro
- Scope: Singleton by default, others include prototype, request (web apps), session (web apps), global-session (web apps)
#### Lifecycle
- Init and destory method
```
<bean id="myCoach"
class="com.luv2code.springdemo.TrackCoach"
init-method="doMyStartupStuff"
destroy-method="doMyCleanupStuff">
```

### Annotation
