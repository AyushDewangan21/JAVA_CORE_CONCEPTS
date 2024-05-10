/*  
If you declare any variable as static, it is known as a static variable.
o	The static variable can be used to refer to the common property of all objects (which is not unique for each object), 
  for example, the company name of employees, college name of students, etc.
o	The static variable gets memory only once in the class area at the time of class loading.

Advantages of static variable
It makes your program memory efficient (i.e., it saves memory).
Understanding the problem without static variable

*/

// CODE -------------------------------------------------------------------------->

class Student{  
	  int rollno;                   //instance variable  
    String name;  
    static String college ="SSIPMT"; //static variable  
    
    //constructor  
    Student(int r, String n)
    {  
    rollno = r;  
    name = n;  
    }  

    //method to display the values  
	  void display ()
    {
    System.out.println(rollno+" "+name+" "+college);}  
  	} 

	  //Test class to show the values of objects  
  	public class TestStaticVariable1{  
    public static void main(String args[]){ 
    Student s1 = new Student(111,"Karan");  
    Student s2 = new Student(222,"Aryan");  
    //we can change the college of all objects by the single line of code  
    //Student.college="ssipmt";  
    s1.display();  
    s2.display();  
	  }  
}  

// OUTPUT --------------------------------------------------------------------------->

111 Karan SSIPMT
222 Aryan SSIPMT
