// - 06 - Page 262
class Synch {
  public static void main(String[] args) {
    Callme target = new Callme();
    /*
    It is the same to have different instances here, because the method "Callme.call()" being called by the different
    Threads will be the same.
     */
    Caller ob1 = new Caller(target, "Hello");
    Caller ob2 = new Caller(target, "Synchronized");
    Caller ob3 = new Caller(target, "World");
    // Start the threads.
    ob1.t.start();
    ob2.t.start();
    ob3.t.start();
    // wait for threads to end
    try {
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    } catch(InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
// This program is not synchronized.
class Callme {
  synchronized void call(String msg) {
    System.out.print("[" + msg);
    /*
    Also the execution of the finally code (in the case of using it inside the "call" method) is accessed at different
    points in time. Here The sleep() invocation make Threads to hand over the control to other threads and the finally
    clause is enqueued and postponed for later.

    Here we are using sllep() to make the switch more evident, but in other conditions we can not know when the
    context switch will occurr.
     */
    try {
      Thread.sleep(1000);
    } catch(InterruptedException e) {
      System.out.println("Interrupted");
    }
    System.out.println("]");
  }
}
class Caller implements Runnable {
  String msg;
  Callme target;
  Thread t;
  public Caller(Callme targ, String s) {
    target = targ;
    msg = s;
    t = new Thread(this);
  }
  public void run() {
    target.call(msg);
  }
}
