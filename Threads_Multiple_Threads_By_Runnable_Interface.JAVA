// Multiple Thread Creation by implementing Runnable interface

class NewThread implements Runnable
{
   String name;
   Thread t;
   NewThread(String threadname)
   {
      name = threadname;
      t = new Thread(this, name);
      System.out.println("New thread: " + t);
      t.start();   // Start the thread
   }

   public void run()
   {
      try
      {
          for(int i = 5; i > 0; i--) 
          { 
               System.out.println(name + ": " + i);
               Thread.sleep(1000);
          }
      }

      catch (InterruptedException e)
      {
            System.out.println(name + "Interrupted");
      }

      System.out.println(name + " exiting.");
   }
}

class MultiThreadDemo
67


{

public static void main(String args[])

{

new NewThread("One"); new NewThread("Two"); new NewThread("Three"); try

{

Thread.sleep(10000);

}

catch (InterruptedException e)

{

System.out.println("Main thread Interrupted");

}

System.out.println("Main thread exiting.");

}

}

Output

New thread: Thread[One,5,main] New thread: Thread[Two,5,main] New thread: Thread[Three,5,main] One: 5

Two: 5

Three: 5

One: 4

Two: 4

Three: 4

One: 3

Three: 3

Two: 3

One: 2

Three: 2

Two: 2

One: 1

Three: 1

Two: 1

One exiting. Two exiting. Three exiting.

Main thread exiting.
