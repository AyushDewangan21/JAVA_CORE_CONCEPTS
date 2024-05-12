// super keyword is used in java to access the parent class data memebers 
// 

class Animal
{
  public void animalSound()
  {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal 
{
  public void animalSound() 
  {
    super.animalSound(); // Call the superclass method
    System.out.println("The dog says: bow wow");
  }
}

public class Main
{
  public static void main(String args[])
  {
    Animal myDog = new Dog(); // Create a Dog object
    myDog.animalSound(); // Call the method on the Dog object
  }
}

/*
OUTPUT :-
The animal makes a sound
The dog says: bow wow
*/
