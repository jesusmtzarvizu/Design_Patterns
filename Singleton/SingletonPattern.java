public class SingletonPattern{

	public static void main(String [] args){
	
	//The following method is not allowed because the method is private
	//Circle circle=new Circle();

	//The following methods have the same instance
	Circle circle=Circle.getInstance();
	Circle circle2=Circle.getInstance();

	}
}
