/*
The keyword final has three uses:

  1  ----->  First, it can be used to create constant variable whose value cannot be changed. 

  2  ------> To Prevent method Overriding 

•	While method overriding is one of Java’s most powerful features, there will be times when you will want to prevent it from occurring. 

•	To disallow a method from being overridden, specify final as a modifier at the start of its declaration. Methods declared as final cannot be overridden. 

*/

class A
{ 
  final void meth() 
  { 
  System.out.println("This is a final method."); 
  } 
} 

class B extends A 
{ 
  void meth() 
  { 
  System.out.println("Illegal!"); 
  } 
} 

/*
Because meth ( ) is declared as final, it cannot be overridden in B. If you attempt to do so, a compile-time error will result.

3   ------>  To Prevent Inheritance

Sometimes we want to prevent a class from being inherited. To do this, precede the class declaration with the keyword final.
Declaring a class as final implicitly declares all of its methods as final, too.

final class A
{
  ...
}

// The following class is illegal. class B extends A

{
//	ERROR! Can't subclass A 
//	... 
}

As the comments imply, it is illegal for B to inherit A since A is declared as final.
*/
