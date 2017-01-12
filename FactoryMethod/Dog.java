// Step 2 : create an object of Animal (Dog) 
// implementing Animal interface.
// Provide concrete implementation to the 
// two methods eat() and sleep() respective to Dog()
 
public class Dog implements Animal{
 
 
 @Override
 public void eat() {
 
  System.out.println("Dog : eat()");
 }
 
 @Override
 public void sleep() {
 
  System.out.println("Dog : sleep()");
 }
 
}
