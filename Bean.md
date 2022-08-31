# Bean

## Java EE Bean

### Java EE Session Bean

```xml
<dependency>
    <groupId>javax</groupId>
    <artifactId>javaee-api</artifactId>
    <version>7.0</version>
    <scope>provided</scope>
</dependency>
```

- Stateless Session Beans
    It does not have any associated client state, but it may preserve its instance state.
- Stateful Session Beans

#### Stateless Beans

- Stateless session beans maintain no state with the client. For this reason, they can be used to create a pool of objects which interact with multiple clients
- Since stateless beans don't have any state per client, they are better performance wise
- They can handle multiple requests from multiple clients in parallel and
- Can be used for retrieving objects from databases

#### Stateful Beans

- Stateful session beans can maintain state with multiple clients, and the task is not shared among clients
- The state lasts for the duration of the session. After the session is destroyed, the state is not retained
- The container can serialize and store the state as a stale state for future use. This is done to save application server resources and to support bean failures and is passivation
- Can be used to solve producer-consumer type problems

### Java EE Message Driven Beans

**An MDB is a component invoked by the container every time a message arrives on the messaging system.** As a result, this event triggers the code inside this bean.

## Spring Bean

*In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed by a Spring IoC container.*

```java
@Component
public class Company {
    // this body is the same as before
}

@Configuration
@ComponentScan(basePackageClasses = Company.class)
public class Config {
    @Bean
    public Address getAddress() {
        return new Address("High Street", 1000);
    }
}
```

```java
ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
```



## Reference

https://www.baeldung.com/ejb-message-driven-beans

https://www.baeldung.com/spring-bean