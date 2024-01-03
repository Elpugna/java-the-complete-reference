// - 06 - Page 76
// Left shifting a byte value.
class ByteShift {
  public static void main(String[] args) {
    byte a = 64, b;
    int i;
    i = a << 2;
    b = (byte) (a << 2);
    System.out.println("Original value of a: " + a);
    System.out.println("i and b: " + i + " " + b);

    int c = 3; // 0011 in binary
    // 9 is 1001 in binary
    int another = 9 << c; // 0100 1000 <=> 72 (All the significative bits have been moved 3 positions)

    int anotherOne = c << 9; // anotherOne = 1536 <=> 0110 0000 0000 in binary (the ones has been moved 9 positions)
    System.out.println("another = " + another);
    System.out.println("anotherOne = " + anotherOne);
  }
}