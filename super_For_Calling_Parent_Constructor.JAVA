// use super keyword for calling constructo

class Vehicle
{
  Vehicle()
  {
    System.out.println(" Inside Vehicle ... ");
  }
}

class SuperBike extends Vehicle
{
  SuperBike()
  {
    super();  // Invokes Parent class Constructo
    System.out.println(" Inside SuperBike .... ");
  }
}

class Demo
{
  public static void main(String[] args)
  {
    SuperBike bmw = new SuperBike();
  }
}


/*
OUTPUT :-
Inside Vehicle ...
Inside SuperBike ....
*/
