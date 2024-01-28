// - 10 - Page 271
// An example of deadlock.
class Deadlock implements Runnable {
  A a = new A();
  B b = new B();
  Thread t;
  Deadlock() {
    System.out.println(Thread.currentThread());
    Thread.currentThread().setName("MainThread");
    t = new Thread(this, "RacingThread");
  }
  void deadlockStart() {
    t.start();
    a.foo(b); // get lock on a in this thread.
    System.out.println("Back in main thread");
  }
  public void run() {
    b.bar(a); // get lock on b in other thread.
    System.out.println("Back in other thread");
  }
  public static void main(String[] args) {
    Deadlock dl = new Deadlock();
    dl.deadlockStart();
    /*
    This will:
    - start the thread "racingThread", meaning executing b method "bar" that must wait 1 sec to call the A method "last"
    - when the thread is waiting,, the "main" thread executes a method "foo" that must wait 1 sec to call the B method "last"
    - after the second, the second we see "racingThread" trying to call the a.last() but it cant because it is locked by the main thread.
    - then  we see the same happening with the main thread.
     */
  }
}
class A {
  synchronized void foo(B b) {
    String name = Thread.currentThread().getName();
    System.out.println(name + " entered A.foo");
    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("A Interrupted");
    }
    System.out.println(name + " trying to call B.last()");
    b.last();
  }
  synchronized void last() {
    System.out.println("Inside A.last");
  }
}
class B {
  synchronized void bar(A a) {
    String name = Thread.currentThread().getName();
    System.out.println(name + " entered B.bar");
    try {
      Thread.sleep(1000);
    } catch(Exception e) {
      System.out.println("B Interrupted");
    }
    System.out.println(name + " trying to call A.last()");
    a.last();
  }
  synchronized void last() {
    System.out.println("Inside B.last");
  }
}
