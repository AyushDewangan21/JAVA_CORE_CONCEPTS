class Bike
{  
  void run()
  {
  System.out.println("running");
  }  
}  

class Splendor extends Bike{  
  void run(){
  System.out.println("running safely with 60km");
  }  
  
  public static void main(String args[])
  { 
    Bike b = new Splendor();
    b.run();  
  }  
}  


/*
OUTPUT:
running safely with 60km
*/

// The function "run()" in super class has been 
// overriden by function "run" in child class . 
