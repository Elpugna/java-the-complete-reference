// - 01 - Page 138
// Demonstrate method overloading.
class OverloadDemo {
  void test() {
    System.out.println("No parameters");
  }
  // Overload test for one integer parameter.
  void test(int a) {
    System.out.println("a: " + a);
  }
  // Overload test for two integer parameters.
  void test(int a, int b) {
    System.out.println("a and b: " + a + " " + b);
  }
  // Overload test for a double parameter
  /*
    If I only have this method (and not the one defined in the line 8, I can still use test() with an Integer, because
    Java autoconverts it. This is possible because there is no lost information when converting from int to double
   */
  double test(double a) {
    System.out.println("double a: " + a);
    return a*a;
  }
  /*
  If having only this and I try to use an int or a higher value the file does not compile and I get the warning
      error: incompatible types: possible lossy conversion from int to short

   short testS(short a) {
     System.out.println("Short a: " + a);
     return a
   }

   */

}
class Overload {
  public static void main(String[] args) {
    OverloadDemo ob = new OverloadDemo();
    double result;
    // call all versions of test()
    ob.test();
    ob.test(10);
    ob.test(10, 20);
    result = ob.test(123.25);
    System.out.println("Result of ob.test(123.25): " + result);
  }
}