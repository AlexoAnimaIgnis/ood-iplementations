## Decorator

is a structural design pattern that lets you attach new behaviors to objects by placing these 
objects inside special wrapper objects that contain the behavior


### Problem Scope | Context

Imagine working on a legacy application that allows other applications to notify
users about important events. However, the initial version of this class had only
few fields, a constructor and a single send method. At some point, you realize that
the users of application expect more types of notifications such as SMS, Facebook
and slack notification.

The initial response is to extend the NOTIFIER class and put additional methods into
the new subclasses. With this, the client needs to instantiate the desired notifcation
type and use it.

#### Why not use several notification types at the same time?

Inheritance and subclasses would bloat the application code immensely as well as the client code.

Issues with inheritance:
- inheritance is STATIC
- most of the programming language doesnt support multiple inheritance.

#### Solution

To solve this problem, we can leverage the Aggregation or Composition as alternatives.
These approaches work the same way: one object has a reference to another and delegates
it some work.

The decorator or wrapper is an object that can be linked with the target object.
This wrapper class contains the same set of methods as the target and delegates to it 
all requests it receives.