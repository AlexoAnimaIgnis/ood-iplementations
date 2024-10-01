# Builder Design Pattern

Builder is a creational design pattern that lets you construct complex objects step by step.
The pattern allows you to produce different types and representations of an object using the same construction code.

### Problem Context

Addresses monstrous constructor with lots of parameters. Imagine if there is a complex object that requires
laborious step by step initialization of many fields and nested objects. 

Example: In building a simple house, you need to construct four walls and a floor, install a door, fit a pair of windows
and build a roof. But if you want a bigger, brighter house, you can extend the base House class and create a set of subclasses
to cover combinations of the parameters.

In short, you might make a program that is too complex by creating a lost of subclasses corresponding to every possible 
configuration of an object.

### Another Approach
Create a giant constructor right in the base class House with all possible parameters that control the house object.
While it avoids creating subclasses. In most cases, some parameters will be unused, making the constructor calls pretty
ugly.

### Solution

Builder Pattern suggests that you extract the object construction code out of its own class and move it to separate
objects called BUILDERS. It lets you construct complex objects step by step. The Builder doesn't allow other objects
to access the product while it's being built.

This pattern recognizes object construction into a set of steps - that to create an object, you execute series of
steps on a builder object. You don't need to call all the steps involved, you need to call those steps necessary for
producing a particular configuration of an object.


#### Structure
1. Builder interface declares product construction steps that are common to all types of builder.
2. Concrete builders provide different implementations of the construction steps. These may produce products
that don't follow the common interface.
3. Products are resulting objects. The products constructed by different builders don't have to belong to the same class
hierarchy or interface.
4. Director class defines the order in which to call construction steps
5. Client must associate one of the builder objects with the director.

#### Application