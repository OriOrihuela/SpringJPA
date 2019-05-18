# SpringJPA

## In this unit we will deal with the situation that arises when a transaction with the DB that throws an exception ends up leaving the DB in an incorrect state.
### Concepts to be treated:
#### - Service and Rollback
#### - Persistence Context
Regarding the PersistenceContext, an object that we create or obtain from the EntityManager can be:

- managed
- detached
- new
- removed.

The PersistenceContext is a cache.
#### - Managed object
What are the consequences of an object being in a managed state in Spring?

- Two objects with the same `persistence identity` cannot exist in the same `PersistenceContext`. **Answer the question**: why does the 
`merge` method require working with the same reference that returns?
- The execution of a method (`find, merge, persist, remove`) of the `EntityManager` does not correspond to the execution of an instruction 
of the BBDD (`select, update, insert, delete`).

#### - Entity
What requirements must a Java class fulfill in order to become a BBDD entity?
 - They must have a **default constructor** (without parameters!)
 - **Not final**
 - By default, the properties are persistent (and not transient)
 - ***Field access vs property access***
 
 #### - JPA
 ![jpa](https://i2.wp.com/www.thejerd.com/http://images.thejerd.com/2014/01/Completely-Different.png?resize=570%2C321)
 
 *And now for something completely different*: ***JPA***.
 
What place do the different treated technologies: Spring, JPA, Hibernate and others like JEE and EJBs?
 
 #### - Many to One
Let's see if we have learned something in the database classes.
- `@ManyToOne`
- `@JoinColumn(name="")`

#### - Transactions: rollback and commit
You have to understand the `checked` and `unchecked` exceptions explained in "*Handling Exceptions and Debugging*" from the book 
**Beginning Java Programming**.

### Exercise:
It is important that you look at:

- The `schema.sql` file in `src/main/resources` What kind of code is there and what does it produce?
- The `application.properties` file in `src/main/resources` How does Spring act when reading these properties?
- The `insert.sql` file in `src/main/resources` What language is this, when is it executed and what does it produce?

What does the following annotation of the class that contains the test cases?
~~~
@Sql (statements = {
"delete from t_matricules",
"delete from t_alumnes",
"delete from t_cursos",
"insert into t_alumnes (alu_nom, alu_edat) values ('joan', 15)",
"insert into t_alumnes (alu_nom, alu_edat) values ('aina', 18)",
"insert into t_cursos (cur_nom, cur_edatminima) values ('spring', 16)",
"insert into t_cursos (cur_nom, cur_edatminima) values ('surf', 13)",
"insert into t_matricules (mat_id, mat_alumne, mat_curs) values (1, 'joan', 'surf')",
})
~~~
