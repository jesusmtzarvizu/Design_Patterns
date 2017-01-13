// Concrete Factory (YamahaFactory) implementing Abstract Factory
public class YamahaFactory implements BikeFactory {

    @Override
    public Bike createBike() {
        return new FZ();
    }

}
