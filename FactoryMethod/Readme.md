#Factory Method

The Factory Method pattern Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

The client is totally decoupled from the implementation details of derived classes. Polymorphic creation is now possible

![Alt text](factorymethod.png.png "Optional Title")

## Check list

1. If you have an inheritance hierarchy that exercises polymorphism, consider adding a polymorphic creation capability by defining a **static** factory method in the base class.
2. Design the arguments to the factory method. What qualities or characteristics are necessary and sufficient to identify the correct derived class to instantiate?.
3. Consider designing an internal "object pool" that will allow objects to be reused instead of created from scratch.
4. Consider making all constructors **private** or **protected**.

## An Example in Java :
The Factory Method class is named [AnimalFactory.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/Singleton/Circle.java)
</br>The main class is named [FactoryPattern.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/FactoryMethod/FactoryPattern.java)
</br>An interface named [Animal.java] (https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/FactoryMethod/Animal.java.java)
</br>A concrete class named [Dog.java] (https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/FactoryMethod/Dog.java)
</br>A concrete class named [Cat.java] (https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/FactoryMethod/Cat.java)
