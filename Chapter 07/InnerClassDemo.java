// - 06 - Page 159
// Define an inner class within a for loop.
class Outer {
  int outer_x = 100;
  void test() {
    for(int i=0; i<10; i++) {
      class Inner {
        void display() {
          System.out.println("display: outer_x = " + outer_x);
          //The following line of code throws an error:
          // local variables referenced from an inner class must be final or effectively final (Pretty obvious)
          //System.out.println("display: outer_x = " + i);
        }
      }
      Inner inner = new Inner();
      inner.display();
    }
  }
}
class InnerClassDemo {
  public static void main(String[] args) {
    Outer outer = new Outer();
    outer.test();
  }
}