// HYBRID INHERITANCE by Using Multilevel and Hierarchical Inheritance

/* In the following figure, GrandFather is a super class.
The Father class inherits the properties of the GrandFather class.
Since Father and GrandFather represents single inheritance. 
Further, the Father class is inherited by the Son and Daughter class. 
Thus, the Father becomes the parent class for Son and Daughter. 
These classes represent the hierarchical inheritance. Combinedly, 
it denotes the hybrid inheritance. */

class GrandFather    
{    
  public void showG()    
  {   
    System.out.println("He is grandfather.");    
  }    
}    

//inherits GrandFather properties    
class Father extends GrandFather    
{    
  public void showF()    
  {    
    System.out.println("He is father.");    
  }    
}  

//inherits Father properties    
class Son extends Father    
{    
  public void showS()    
  {    
    System.out.println("He is son.");    
  }    
}  

//inherits Father properties    
public class Daughter extends Father    
{    
  public void showD()    
  {    
    System.out.println("She is daughter.");    
  }    


public static void main(String args[])    
{    
     
  Son obj = new Son();  
  obj.showS();  // Accessing Son class method  
  obj.showF();  // Accessing Father class method  
  obj.showG();  // Accessing GrandFather class method  

  Daughter obj2 = new Daughter();  
  obj2.showD();  // Accessing Daughter class method  
  obj2.showF();  // Accessing Father class method  
  obj2.showG();  // Accessing GrandFather class method  
  }    
}  


/*
OUTPUT:

He is son.
He is father.
He is grandfather.
She is daughter.
He is father.
He is grandfather.
*/
