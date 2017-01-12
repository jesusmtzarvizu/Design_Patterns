//The client does not know anything about the concrete animal classes and using using
//FactoryPattern class will create animal objects.

public class FactoryPattern{

	public static void main(String[] args){
	      //before using Factory Pattern, we can do the following (hard copling within the classes ):
	
        //Dog dog=new Dog();
        //dog.eat();

        //Cat cat=new Cat();
        //cat.eat();

        //Using Factory Pattern
        String animalType=args[0];

        AnimalFactory.animalFactory=new AnimalFactory();

        Animal animal=animalFactory.createAnimal(animalType);
        animal.eat();
	
	  }
}
