public class Circle{

	//In order to make a class Singleton
	//we have to follow to rules:

	//Steps to make a class Singleton:

	//Step 1: Create a class which you want to make Singleton
	//Step 2: Create a private default contructor of the class.

	private Circle(){
	
	}

	//Step 3: Create a private static variable of the class created in step 1.
	//and this variable should be private and static and it should refer to
        //the instance of class created in step 1.
	
	private static Circle circleInstance = new Circle();

	//Step 4: Create an accessor method which could always return us
	//back with an instance of a class created in step 3.

	public static Circle getInstance(){
		return circleInstance;
	}

	//step 5: There should not be any method or constructor which can create
	//instance of this class. like the follow method:

	//public Circle getCircle(){
	//	return new Circle();
	//}

}
