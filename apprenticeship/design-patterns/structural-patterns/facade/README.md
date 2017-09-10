# Facade Design Pattern

###Intent
 
 - Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 - Wrap a complicated subsystem with a simpler interface.
 
###Problem

A segment of the client community needs a simplified interface to the overall functionality of a complex subsystem.


###Discussion

Facade discusses encapsulating a complex subsystem within a single interface object. This reduces the learning curve necessary to successfully leverage the subsystem. It also promotes decoupling the subsystem from its potentially many clients. On the other hand, if the Facade is the only access point for the subsystem, it will limit the features and flexibility that "power users" may need.

The Facade object should be a fairly simple advocate or facilitator. It should not become an all-knowing oracle or "god" object.


###Check list

1- Identify a simpler, unified interface for the subsystem or component.

2- Design a 'wrapper' class that encapsulates the subsystem.

3- The facade/wrapper captures the complexity and collaborations of the component, and delegates to the appropriate methods.

4- The client uses (is coupled to) the Facade only.

5- Consider whether additional Facades would add value.


##Notes

- Facade defines a new interface, whereas Adapter uses an old interface. Remember that Adapter makes two existing interfaces work together as opposed to defining an entirely new one.
- Whereas Flyweight shows how to make lots of little objects, Facade shows how to make a single object represent an entire subsystem.
- Mediator is similar to Facade in that it abstracts functionality of existing classes. Mediator abstracts/centralizes arbitrary communications between colleague objects. It routinely "adds value", and it is known/referenced by the colleague objects. In contrast, Facade defines a simpler interface to a subsystem, it doesn't add new functionality, and it is not known by the subsystem classes.
- Abstract Factory can be used as an alternative to Facade to hide platform-specific classes.
- Facade objects are often Singletons because only one Facade object is required.
- Adapter and Facade are both wrappers; but they are different kinds of wrappers. The intent of Facade is to produce a simpler interface, and the intent of Adapter is to design to an existing interface. While Facade routinely wraps multiple objects and Adapter wraps a single object; Facade could front-end a single complex object and Adapter could wrap several legacy objects.

