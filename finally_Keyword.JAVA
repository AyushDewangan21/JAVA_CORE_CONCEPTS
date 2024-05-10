/* finally creates a block of code that will be executed after a try/catch block has completed andbefore the code following the try/catch block. 
The finally block will execute whether or not an exception is thrown. 
If an exception is thrown, the finally block will execute even if no catch statement matches the exception.   */

class Demo
{
  public static void main(String args[])
  {
    int x, y; 
    try // try block
    {
     x = 0;
     y= 1/ x;
     System.out.println("This will not be printed.");
    }

    catch (ArithmeticException e)  // catch Block
    {
    System.out.println("Division by zero.");
    }

    finally  // finally block
    {
      System.out.println("End of Try/Catch Block");
    }
}
}

/*
Output:

Division by zero.
End of Try/Catch Block
*/
