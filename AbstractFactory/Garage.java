//A helper class Garage which will help this factories to work at the runtime.

public class Garage {

    public Garage(BikeFactory bikeFactory) {

        Bike bike = bikeFactory.createBike();
        bike.drive();

    }

}
