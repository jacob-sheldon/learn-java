# JPA

**J**ava **P**ersistence **A**PI is a collection of classes and methods to persistently store the vast amounts of data into a database which is provided by the Oracle Corporation.

 It shows how to define a PLAIN OLD JAVA OBJECT (POJO) as an entity and how to manage entities with relations.

**JPA serves as a layer of abstraction that hides the low-level JDBC calls from the developer, making database coding considerably easier**

## Architecture

![JPA Class Level Architecture](jpa_class_level_architecture.png)

| Units                    | Description                                                  |
| ------------------------ | ------------------------------------------------------------ |
| **EntityManagerFactory** | This is a factory class of EntityManager. It creates and manages multiple EntityManager instances. |
| **EntityManager**        | It is an Interface, it manages the persistence operations on objects. It works like factory for Query instance. |
| **Entity**               | Entities are the persistence objects, stores as records in the database. |
| **EntityTransaction**    | It has one-to-one relationship with EntityManager. For each EntityManager, operations are maintained by EntityTransaction class. |
| **Persistence**          | This class contain static methods to obtain EntityManagerFactory instance. |
| **Query**                | This interface is implemented by each JPA vendor to obtain relational objects that meet the criteria. |

![JPA Class Relationships](jpa_class_relationships.png)

## ORM Component

**Object Relational Mapping**

The main feature of ORM is mapping or binding an object to its data in the database.

**ORM Architecture**

![Object Relational Mapping](object_relational_mapping.png)

**Annotations**

`@Entity` `@Table` `@Basic` `@Id` `@Column` `@ManyToMany` etc

**Java Bean Standard**

**Bean Conventions**

## Entity Manager

**CRUD**

## JPQL

JPQL is Java Persistence Query Language defined in JPA specification. It is used to create queries against entities to store in a relational database. JPQL is developed based on SQL syntax. But it won’t affect the database directly.

## Eager and Lazy Loading

The main concept of JPA is to make a duplicate copy of the database in cache memory.

**Eager fetch  **   **Lazy fetch**

## Advanced Mapping

**Inheritance Strategies**

SINGLE_TABLE, JOINED_TABLE, and TABLE_PER_CONCRETE_CLASS.

## Entity Relationship

@ManyToOne

@OneToMany

@OneToOne

@ManyToMany

## Criteria API

The Criteria API is a predefined API used to define queries for entities.

It is the alternative way of defining a JPQL query.

*The major advantage of the criteria API is that errors can be detected earlier during compile time.*

```java
EntityManager em = ...;
CriteriaBuilder cb = em.getCriteriaBuilder();

CriteriaQuery<Entity class> cq = cb.createQuery(Entity.class);
Root<Entity> from = cq.from(Entity.class);

cq.select(Entity);
TypedQuery<Entity> q = em.createQuery(cq);
List<Entity> allitems = q.getResultList();
```

