# OBSERVER PATTERN

Design pattern that lets you define a subscription mechanism to notify
multiple objects about any events that happen to the object they're observing

### Problem context:

Imagine there is a Customer that is interested in a particular brand of product
from a store. Customer needs to be updated by the store when the a
particular product is already available.

### Solution

The object that has some interesting STATE is called 'subject,' but
since it's also going to notify other objects about the changes of its state, we'll
call it PUBLISHER. Objects that want to be notified the changes to the
publisher's state are called SUBSCRIBERS.

This pattern suggest that you add a subscription mechanism to the publisher 
class so that subscribers can be notified from a stream of events coming
from that publisher. This mechanism consists of
1. array for storing the subscribers
2. public methods allowing addition of subscribers to and removing them from the list

When there is an important change with the publisher's state, it goes over
to the list of subscribers and calls the specific notification method on their objects.

#### IMPORTANT NOTE:

Subscribers need to implement the same interface, and the publisher communicates
with them only through that interface.

#### Structure

1. PUBLISHER - issues events to other objects. It contains a subscription
infrastructure that lets new subscriber join and current subscribers leave the list.
2. When a new event happens, publisher goes over the subscription list and calls
the notification method and declared in the subscriber interface.
3. Subscriber interface declares notification interface.
4. Concrete subscribers perform some actions in response to notifications issued by the publisher.
5. client creates publisher and subscriber objects separately and then registers subscribers for publisher updates
