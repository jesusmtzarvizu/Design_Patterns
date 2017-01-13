
## Abstractory Factory

The Abstractory Factory pattern :
* Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
* A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
* The **new** operator considered harmful.
![Alt text](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/abstractfactory.png "Optional Title")

##Example:
![Alt text](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/abstractfactory2.png "Optional Title")

## Check list

1. Decide if "platform independence" and creation services are the current source of pain.
2. Map out a matrix of "platforms" versus "products".
3. Define a factory interface that consists of a factory method per product.
4. Define a factory derived class for each platform that encapsulates all references to the **new** operator
5. The client should retire all references to **new**, and use the factory methods to create the product objects.

## An Example in Java :
Abstract Factory  named: [BikeFactory.java](https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/BikeFactory.java)
</br>A Concrete Factory class (YamahaFactory) implementing Abstract Factory named: [YamahaFactory.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/YamahaFactory.java)
</br>Concrete Factory class (HondaFactory) implementing Abstract Factory named: [HondaFactory.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/HondaFactory.java)
</br>Abstract Product interface (Bike) named : [Bike.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/Bike.java)
</br>Concrete Product (Hunk) for Abstract Product (Bike) named: [Hunk.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/Hunk.java)
</br>Concrete Product (FZ) for Abstract Product (Bike) named: [FZ.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/FZ.java)
</br>A helper class Garage which will help this factories to work at the runtime named: named: [Garage.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/Garage.java)
</br>The main class named: [general.java]
(https://github.com/jesusmtzarvizu/Design_Patterns/blob/master/AbstractFactory/general.java)
