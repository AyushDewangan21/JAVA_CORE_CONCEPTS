/*

LIFE CYCLE OF THREAD  ----------------------------------------------------------------------------------------------->>
A thread goes through various stages in its life cycle. For example, a thread is born, started, runs, and then dies.
Following diagram shows complete life cycle of a thread.

New: A new thread begins its life cycle in the new state. It remains in this state until theprogram starts the thread.
It is also referred to as a born thread. 

Runnable: After a newly born thread is started, the thread becomes runnable. A thread in thisstate is considered 
to be executing its task. 

Waiting: Sometimes a thread transitions to the waiting state while the thread waits for anotherthread to perform a task. 
A thread transitions back to the runnable state only when another thread signals the waiting thread to continue executing. 

Timed waiting: A runnable thread can enter the timed waiting state for a specified interval oftime. A thread in this state 
transitions back to the runnable state when that time interval expires or when the event it is waiting for occurs. 

Terminated: A runnable thread enters the terminated state when it completes its task orotherwise terminates. 



MULTI-THREADING ---------------------------------------------------------------------------------------------------->>

A multithreaded program contains two or more parts that can run concurrently. Each part of such a program is called a thread,
and each thread defines a separate path of execution. Thus, multithreading is a specialized form of multitasking. 

There are two distinct types of multitasking: process-based and thread-based. 

A process-based multitasking is the feature that allows our computer to run two or more programs concurrently. For example,
process-based multitasking enables us to run the Java compiler at the same time that we are using a music player. 

In a thread-based multitasking environment, the thread is the smallest unit of dispatchable code. This means that a single 
program can perform two or more tasks simultaneously. 

Multitasking threads require less overhead than multitasking processes. 

Multithreading enables us to write very efficient programs that make maximum use of the CPU, because idle time can be kept to a minimum. 


THREAD PRIORITY ---------------------------------------------------------------------------------------------------->>

Java assigns to each thread a priority that determines how that thread should be treated with respect to the others. 

Thread priorities are integers that specify the relative priority of one thread to another. 

Java priorities are in the range between MIN_PRIORITY (a constant of 1) and MAX_PRIORITY (a constant of 10). By default, 
every thread is given priority NORM_PRIORITY (a constant of 5). 

Threads with higher priority are more important to a program and should be allocated processor time before lower-priority 
threads. However, thread priorities cannot guarantee the order in which threads execute and very much platform dependentant. 

A thread’s priority is used to decide when to switch from one running thread to the next. This is called a context switch. 

The rules that determine when a context switch takes place are simple:

A thread can voluntarily relinquish control. This is done by explicitly yielding, sleeping, orblocking on pending I/O.
In this scenario, all other threads are examined, and the highest-priority thread that is ready to run is given the CPU. 

A thread can be preempted by a higher-priority thread. In this case, a lower-prioritythread that does not yield the processor
is simply preempted—no matter what it is doing— by a higher-priority thread. Basically, as soon as a higher-priority thread 
wants to run, it does. This is called preemptive multitasking. 

*/
