#Facade

* Provide a unified interface to a set of interfaces in a subsystem. 
* Facade defines a higher-level interface that makes the subsystem easier to use.

When to use it?
When a segment of the client community needs a simplified interface to the overall functionality of a complex subsystem

![Alt text](singleton.png "Optional Title")

## Check list

1. Identify a simpler, unified interface for the subsystem or component.
2. Design a 'wrapper' class that encapsulates the subsystem.
3. The client uses (is coupled to) the Facade only.
4. Consider whether additional Facades would add value.

## An Example in Java :
The Facade class is named [Circle.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/Singleton/Circle.java)
</br>The main class is named [SingletonPattern.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/Singleton/SingletonPattern.java)
