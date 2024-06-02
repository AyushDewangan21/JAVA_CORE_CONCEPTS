class Helper
{
   static int Multiply(int a, int b)
   {
        return a * b;
   }

   static int Multiply(int a, int b, int c)
   {
       return a * b * c;
   }
}
 
// Main Class

class Demo
{
   public static void main(String[] args)
   {
       System.out.println(Helper.Multiply(2, 4));

       System.out.println(Helper.Multiply(2, 7, 3));
    }
}

/*
OUTPUT :

8
42
*/
