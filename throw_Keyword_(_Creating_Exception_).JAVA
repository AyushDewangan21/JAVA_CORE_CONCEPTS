// To throw an exception explicitly, using the throw statement. 

class ThrowDemo
{
  public static void main(String args[])
  {
    int x=2, y=0; 
    // try Block
    try
    {
      if(y==0)
      throw newArithmeticException();  //Throw an exception
    }
    // catch block
    catch(ArithmeticException e)
    {
      System.out.println("Exception Occurred: Division by 0 " + e);
    }
  }
}
