// - 09 - Page 82
// Demonstrate the boolean logical operators.
class BoolLogic {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false;
    //OR (Disjunction)
    boolean c = a | b;
    //AND (Conjunction)
    boolean d = a & b;
    //XOR
    boolean e = a ^ b;
    boolean f = (!a & b) | (a & !b);
    //NOT
    boolean g = !a;
    System.out.println(" a = " + a);
    System.out.println(" b = " + b);
    System.out.println(" a|b = " + c);
    System.out.println(" a&b = " + d);
    System.out.println(" a^b = " + e);
    System.out.println("!a&b|a&!b = " + f);
    System.out.println(" !a = " + g);
  }
}