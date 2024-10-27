# Adapter 

A structural design pattern that allows objects with incompatible interfaces to collaborate.

### Problem Context

If you have a pre-existing application and you decide to improve the app
by integrating a smart 3rd-party analytics library. Current application
works with XML but the new analytics library only works with data in JSON format.

Problem:
1. Can change the library to work with XML but will break existing code
2. Worse case is you have not access to library source code.


### Solution

Create an adapter, which converts the interface of one object so that another 
object can understand it. An adapter wraps one of the objects to hide the complexity of conversion happening
behind the scenes.

To solve the incompatible formats, craete XML-to-JSON adapters for every class of the analytics library that
your code works with directly. Then, adjust code to communicate with the library only via these adapters.
When adapters receive the call, it translates the incoming XML data into a JSON structure and passes the call
to the appropriate methods of a wrapped analytics object.

### Analogy

Power plug adapter that can fit American-style socket and European-style plug.

### Structure

Implementation uses object composition principle

1. client is a class that contains existing business logic
2. client interface describes a protocol that other classes must follow to be able to collaborate with
the client code.
3. service is a useful class (3rd party) which the client cannot use directly because of incompatibility
4. adapter class that works with both the client and the service. It implements the client interface WHILE wrapping
the service object. The adapter receives calls from the client via the adapter interface and translate
into calls to the wrapped service object in a format it can understand.
5. client code doesnt get coupled to the concrete adapter class 

### Application

- Use adapter class when you want to use some existing class with interface
not compatible with the rest of the code. 
- Use a pattern when you want to reuse several existing subclasses that lack
common functionality that cant be added to superclass

#### Notes:
- Adapter changes the interface of an existing object while Decorator
enhances an object without changing the interface.
