Dependency Needed:

spring core
spring context

spring aop
aspectj runtime
aspectj weaver 

Steps:

1. Make a class: to make this class aspect use @Aspect 
    On method use @Before or any other annotation to make it advice.

2. In xml file do below configuration:
    include aop schema: 
    xmlns:aop="http://www.springframework.org/schema/aop"

    and Schemalocation:
    http://www.springframework.org/schema/aop 
    http://www.springframework.org/schema/aop/spring-aop.xsd

    <aop:aspectj-autoproxy />   //used to enable @Aspect and @Before    