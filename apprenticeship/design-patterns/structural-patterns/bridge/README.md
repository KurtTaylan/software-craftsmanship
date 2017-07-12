# Bridge Design Pattern

###Intent
 
Decouple an abstraction from its implementation so that the two can vary independently. 

Use the Bridge pattern when:

you want run-time binding of the implementation,
you have a proliferation of classes resulting from a coupled interface and numerous implementations,
you want to share an implementation among multiple objects,
you need to map orthogonal class hierarchies.
Consequences include:

decoupling the object's interface,
improved extensibility (you can extend (i.e. subclass) the abstraction and implementation hierarchies independently),
hiding details from clients.

###Structure

The Client doesn't want to deal with platform-dependent details. The Bridge pattern encapsulates this complexity behind an abstraction "wrapper".

###Check list

Decide if two orthogonal dimensions exist in the domain. These independent concepts could be: abstraction/platform, or domain/infrastructure, or front-end/back-end, or interface/implementation.
Design the separation of concerns: what does the client want, and what do the platforms provide.
Design a platform-oriented interface that is minimal, necessary, and sufficient. Its goal is to decouple the abstraction from the platform.
Define a derived class of that interface for each platform.
Create the abstraction base class that "has a" platform object and delegates the platform-oriented functionality to it.
Define specializations of the abstraction class if desired.