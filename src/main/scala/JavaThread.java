/*
 Thread in java:
 There are two types of threads in an application – user thread and daemon thread. When we start an application,
 main is the first user thread created and we can create multiple user threads as well as daemon threads.
 When all the user threads are executed, JVM terminates the program.
 We can set different priorities to different Threads but it doesn’t guarantee that
 higher priority thread will execute first than lower priority thread.
 Thread scheduler is the part of Operating System implementation and when a Thread is started,
 it’s execution is controlled by Thread Scheduler and JVM doesn’t have any control on it’s execution.

 */

public class JavaThread {

     public static void main(String[] args) throws InterruptedException {
/*1. Java Thread sleep:
is used to pause the execution of current thread.
The argument value for milliseconds can’t be negative, else it throws IllegalArgumentException.
There is another overloaded method sleep(long millis, int nanos) that can be used to pause the execution of current
thread for specified milliseconds and nanoseconds. The allowed nano second value is between 0 and 999999.
If you will run the below program, you will notice that the thread sleep time it prints is slightly greater than 2000.
This is caused by how thread sleep works and operating system specific implementation of thread scheduler.
*/
 //       threadSleep();
        threadJoin();

/*2. public final void join(): This java thread join method puts the current thread on wait until the thread on which it’s called is dead. If the thread is interrupted, it throws InterruptedException.

public final synchronized void join(long millis): This java thread join method is used to wait for the thread on which it’s called to be dead or wait for specified milliseconds. Since thread execution depends on OS implementation, it doesn’t guarantee that the current thread will wait only for given time.

public final synchronized void join(long millis, int nanos): This java thread join method is used to wait for thread to die for given milliseconds plus nanoseconds.

Here is a simple example showing usage of Thread join methods. The goal of the program is to make sure main is the last thread to finish and third thread starts only when first one is dead.
 */
    }

     public static void threadSleep()throws InterruptedException {
         long start = System.currentTimeMillis();
         Thread.sleep(2000);
         System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
     }

     public static void threadJoin(){
         Thread t1 = new Thread(new MyRunnable(), "t1");
         Thread t2 = new Thread(new MyRunnable(), "t2");
         Thread t3 = new Thread(new MyRunnable(), "t3");

         t1.start();

         //start second thread after waiting for 2 seconds or if it's dead
         try {
             t1.join(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         t2.start();

         //start third thread only when first thread is dead
         try {
             t1.join();
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         t3.start();

         //let all threads finish execution before finishing main thread
         try {
             t1.join();
             t2.join();
             t3.join();
         } catch (InterruptedException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }

         System.out.println("All threads are dead, exiting main thread");
     }


}

class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }

}
