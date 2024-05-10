/* An interface is a collection of abstract methods (i.e. methods without having definition). 
A class that implements an interface inherits abstract methods of the interface. 

An interface is not a class. 

___Interfaces have the following properties:
---->An interface is implicitly (i.e. by default) abstract. We do not need to use the abstract keyword when declaring an interface. 
------->Each method in an interface is also implicitly (i.e. by default) abstract, so the abstract keyword is not needed. 
---------->Methods in an interface are implicitly (i.e. by default) public.  */

interface Message
{
  void message1();
  void message2();
}

class A implements Message
{
  void message1()
  {
  System.out.println("Good Morning in A class");
  }
  void message2()
  {
  System.out.println("Good Evening in A class");
  }

  public static void main(String args[])
  {
  A a=new A();
  a.message1();
  a.message2();
  }
}

// Output 
//Good Morning in A class
//Good Evening in A class
