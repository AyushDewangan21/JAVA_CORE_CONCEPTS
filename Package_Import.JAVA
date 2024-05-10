/* Given that packages exist and are a good mechanism for compartmentalizing diverse classes from each other,
it is easy to see why all of the built-in Java classes are stored in packages. 

In a Java source file, import statements occur immediately following the package statement (if it exists) and before any class definitions.
This is the general form of the import statement: import pkg1 [.pkg2].(classname|*);        */

package MyPack; 
public class Balance
{
  String name; double bal;
  public Balance(String n, double b)
  {
    name = n; bal = b;
  }
  public void show()
  {
  if(bal<0) System.out.print("--> ");
  System.out.println(name + ": $" + bal);
  }
}

/* As we can see, the Balance class is now public. Also, its constructor and its show( ) method are public, too. 
This means that they can be accessed by any type of code outside the MyPack package. For example, 
here TestBalance imports MyPack and is then able to make use of the Balance class: */


import MyPack.*;
class TestBalance
{
  public static void main(String args[])
  {
  Balance test = new Balance("J. J. Jaspers", 99.88);
  test.show(); // you may also call show();
  }
}
