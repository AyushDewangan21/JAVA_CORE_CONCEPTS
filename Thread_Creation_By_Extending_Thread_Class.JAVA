/* The second way to create a thread is to create a new class that extends Thread, and then to create an instance of that class.

The extending class must override the run ( ) method, which is the entry point for the new thread. It must also call start ( ) to begin execution of the new thread.

Program 6.2   Creating Thread by Extending Thread class.

Solution:
*/

class NewThread extends Thread

{

NewThread()

{

super("Demo Thread"); System.out.println("Child thread: " + this); start();

}

public void run()

{

try

{

for(int i = 5; i > 0; i--)

{

System.out.println("Child Thread: " + i); Thread.sleep(500);
65


}

}

catch (InterruptedException e)

{

System.out.println("Child interrupted.");

}

System.out.println("Exiting child thread.");

}

}

class ExtendThread

{

public static void main(String args[])

{

new NewThread(); try

{

for(int i = 5; i > 0; i--)

{

System.out.println("Main Thread: " + i); Thread.sleep(1000);

}

}

catch (InterruptedException e)

{

System.out.println("Main thread interrupted.");

}

System.out.println("Main thread exiting.");

}

}

/*
Output:

Child thread: Thread[Demo Thread,5,main] Main Thread: 5

Child Thread: 5

Child Thread: 4

Main Thread: 4

Child Thread: 3

Child Thread: 2

Main Thread: 3

Child Thread: 1 Exiting child thread.
66


Main Thread: 2

Main Thread: 1

Main thread exiting
*/
