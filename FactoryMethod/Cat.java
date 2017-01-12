//Step 3 : create an object of Animal (Cat) 
//implementing Animal interface.
//Provide concrete implementation to the 
//two methods eat() and sleep() respective to Cat
 
public class Cat implements Animal
{
 
 @Override
 public void eat() {
  System.out.println("Cat : eat()");
 
 }
 
 @Override
 public void sleep() {
 
  System.out.println("Cat : sleep()");
 
 }
 
}
