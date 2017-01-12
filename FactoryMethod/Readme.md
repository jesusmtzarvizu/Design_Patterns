#Factory Method

The Factory Method pattern Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

![Alt text](singleton.png "Optional Title")

## Check list

1. If you have an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic creation capability by defining a **static** factory method in the base class.
2. Design the arguments to the factory method. What qualities or characteristics are necessary and sufficient to identify the correct derived class to instantiate?.
3. Consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.
4. Consider making all constructors **private** or **protected**.

## An Example in Java :
The Singleton class is named [Circle.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/Singleton/Circle.java)
</br>The main class is named [SingletonPattern.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/Singleton/SingletonPattern.java)
