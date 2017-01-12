//Create a class which will act as a factory for 
// creating concrete objects of Animal 

public class AnimalFactory {

    public Animal createAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if ("dog".equalsIgnoreCase(animalType)) {
            return Dog();
        } else if ("cat".equalsIgnoreCase(animalType)) {
            return Cat();
        }

        return null;

    }
}
