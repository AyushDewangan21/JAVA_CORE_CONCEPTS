/*
  o	Is used to initialize the static data member.
  o	It is executed before the main method at the time of classloading.
Example of static block
*/

class A2
{  
 static
 {  
  System.out.println("static block is invoked");
 }  
 public static void main(String args[])
 {  
 System.out.println("Hello main");  
 }  
}  

/*
Output:
static block is invoked
Hello main
*/
