/* To create a package is quite easy: simply include a package command as the first statement in a Java source file.
Any classes declared within that file will belong to the specified package. 

The package statement defines a name space in which classes are stored. If you omit the package statement,
the class names are put into the default package, which has no name.

This is the general form of the package statement: 

-------------------------------------------------------->>  package pkg;  >>----------------------------------------------------

Here, pkg is the name of the package. For example, the following statement creates a package called MyPackage. package MyPackage;

*/
package MyPack; 
class Balance
{
  String name; double bal;
  Balance(String n, double b)
  {
  name = n; bal = b;
  }
  void show()
  {
    if(bal<0) System.out.print("--> ");
    System.out.println(name + ": $" + bal);
  }
}

class AccountBalance
{
  public static void main(String args[])
  {
  Balance current[] = new Balance[3];
  current[0] = new Balance("Sanjib", 123.23);
  current[1] = new Balance("Chandan", 157.02); 
  current[2] = new Balance("Palak", -12.33);

  for(int i=0; i<3; i++) current[i].show();
  }
}


/*
Call this file AccountBalance.java, and put it in a directory called MyPack. Next, compile the file.
Make sure that the resulting .class file is also in the MyPack directory. Then try executing the
AccountBalanceclass, using the following command line:
java MyPack.AccountBalance

Remember, you will need to be in the directory above MyPack when you execute this command, 
or to have your CLASSPATH environmental variable set appropriately. As explained,
AccountBalance is now part of the package MyPack. This means that it cannot be executed by itself.
That is, you cannot use this command line:

java AccountBalance

AccountBalancemust be qualified with its package name.
*/
