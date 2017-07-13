# Composite Design Pattern

###Intent
 
- Compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual 
objects and compositions of objects uniformly.
- Recursive composition
- "Directories contain entries, each of which could be a directory."
- 1-to-many "has a" up the "is a" hierarchy


###Discussion

1) Define an abstract base class (Component) that specifies the behavior that needs to be exercised uniformly across all 
primitive and composite objects.

2) Each Composite object "couples" itself only to the abstract type Component as it manages its "children".

Use this pattern whenever you have "composites that contain components, each of which could be a composite".


###Check list

Ensure that your problem is about representing "whole-part" hierarchical relationships.

Consider the heuristic, "Containers that contain containees, each of which could be a container." For example, 
"Assemblies that contain components, each of which could be an assembly." Divide your domain concepts into container 
classes, and containee classes.

All container and containee classes declare an "is a" relationship to the interface.

All container classes declare a one-to-many "has a" relationship to the interface.

##Notes

At the heart of this pattern is the ability for a client to perform operations on an object without needing to know 
that there are many objects inside.

Being able to treat a heterogeneous collection of objects atomically (or transparently) requires that the "child 
management" interface be defined at the root of the Composite class hierarchy (the abstract Component class).
 
My Component classes do not know that Composites exist. They provide no help for navigating Composites, nor any help for
altering the contents of a Composite. This is because I would like the base class (and all its derivatives) to be 
reusable in contexts that do not require Composites. When given a base class pointer, if I absolutely need to know 
whether or not it is a Composite, I will use  dynamic_cast to figure this out. In those cases where dynamic_cast is too 
expensive, I will use a Visitor.

Composite doesn't force you to treat all Components as Composites. It merely tells you to put all operations that you 
want to treat "uniformly" in the Component class. If add, remove, and similar operations cannot, or must not, be treated
 uniformly, then do not put them in the Component base class. 