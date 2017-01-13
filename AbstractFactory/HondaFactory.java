//Concrete Factory (HondaFactory) implementing Abstract Factory
public class HondaFactory implements BikeFactory {

    @Override
    public Bike createBike() {
        return new Hunk();
    }

}
