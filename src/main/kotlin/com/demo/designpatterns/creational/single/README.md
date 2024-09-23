### Singleton
Lets you ensure that a class has only one instance, while providing a global access point to this instance.

Problem:

a. ensure that a class has just a single instance in order to control a shared resources
for example - a database or a file.

b. provide a global access point to that instance. Global variables while are handy, are also very
unsafe since any code can potentially overwrite the contents of those global variables.
Singleton pattern lets you access objects from anywhere in the program and protects it from
being overwritten.

#### Solution
- make the default constructor private to prevent other objects from using new operator with the single class.
- create a static creation method that acts as a constructor. This method calls the private constructor to create an object and saves in
  a static field.

#### Application

1. Use it when a class in your program should have only one instance available to all clients
2. Use the singleton pattern when you need stricter control over global variables


#### Pros and Cons
Pros:
- ensures that there is one instance of a class
- gain global access point to that instance
- singleton object is initialized only when it's requested for the first time
Cons:
- violates SRP because it solves two problems at a time
- requires special treatment in a multithreaded environment so that multiple threads wont
create a singleton object several times
- difficult to unit test the client code of the Singleton because many test frameworks rely
on inheritance when producing mock objects. Hard to mock a singleton since constructor is provate
and overriding static method is impossible in most programming language


### Implementation
In kotlin, Singleton can be implemented in a clean and concise way using KOTLIN's
object declaration by providing a built-in support for singleton, eliminating
the need to create private constructor or handling multi-threading issues.