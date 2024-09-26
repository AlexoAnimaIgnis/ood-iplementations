# Factory Method

Factory method is a creational design pattern that provides an interface for creating objects
in the superclass, but allows subclasses to alter the type of the objects that will be created.
It is used to create objects without exposing the logic of object creation.

### Problem Scope

Context: logistic management application, in which logistic is handled only by truck.
What would happen if you get a request to incorporate sea logistic or air logistic in your app?

1. logic is tightly coupled to the TRUCK. Adding a SHIP or PLANE would require making change to the code base

### Solution 

Factory method suggests that you can replace direct object construction calls with 
calls to a factory method. Objects returned by factory method are referred to as products.

Limitation or constraints of this pattern is that:
- subclasses may return different types of products ONLY if these products have a common 
base or interface.
- factory method in the superclass/base class should have its return type declared as this
interface.

### Structure
- Product declares the interface that is common to all objects that can be produced by
the creator and subclasses.
- Concrete ProductA and ConcreteProductB, for example, can be a different implementation of 
the Product Interface
- Creator class declares the factory method i.e., createProduct() that returns the new product objects
Note: The return type should match the Product interface. Despite the name, product creation
is not the primary responsibility of the creator.
- Concrete creators override the base factory methods. These are responsible
for creating different types of products

### Application

1. Use this when you dont know beforehand the exact types of dependencies
2. Use when you want to provide users of library or framework with a way to extend its internal components
3. Use when you want to save system resource by reusing existing objects instead of rebuilding them each time