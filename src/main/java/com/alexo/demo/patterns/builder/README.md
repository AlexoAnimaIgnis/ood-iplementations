# Observer

the observer design pattern is used to notify objects of state changes and these objects

are basically interested in changes to another object.

So the way it works is an object called an observer can register to another object as an interested

party.

And if changes take place to that object the observer wants to know about it and there can be multiple

observers register to the same object.

And they would all get notifications of changes the object observers register themselves with is called

the subject and the subject is the one that notifies its list of registered observers so the subject

object maintains a list of the interested observers and it calls the observer objects methods to notify

them when there are changes.