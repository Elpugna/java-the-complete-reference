// - 08 - Page 79
// Unsigned shifting a byte value.
class ByteUShift {
  static public void main(String[] args) {
    char[] hex = {
        '0', '1', '2', '3', '4', '5', '6', '7',
        '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    };
    // 0xF1 in Hex <=> 1111 0001 in binary <=> 241 in decimal for an int
    // But as we know, the byte takes the 10001 as significative  bits
    // because the byte goes from -128(1000 0000) to 127(0111 1111)
    // so it is 241 - 256 = -15
    // b = - 15 in decimal
    byte b = (byte) 0xf1;
    //c = 1111 1111 (255 in dec for an int) <=>  255 - 256 <=> -1 in decimal for a byte
    byte c = (byte) (b >> 4);
    // d = 1111 1111
    //Why this is not 0000 1111? Because b value is converted to an Int before the shift, and then it is again
    // reconverted to  byte tipe. So as b equals -15 it will shift ones from the left.
    //It would be different if b was a positive number (that is filled to the left with zeros).
    byte d = (byte) (b >>> 4);
    // e = (1111 0001 & 1111 1111 ) =>    //here -15 and -1 are converted to int so it eliminates all the left ones.
    // e =               1111 0001 () >> 4 //here it can pull zeros
    // e =               0000 1111
    // e = 15
    byte e = (byte) ((b & 0xff) >> 4);
    System.out.println(e);
    System.out.println(" b = 0x"
        + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    System.out.println(" b >> 4 = 0x"
        + hex[(c >> 4) & 0x0f] + hex[c & 0x0f]);
    System.out.println(" b >>> 4 = 0x"
        + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
    System.out.println("(b & 0xff) >> 4 = 0x"
        + hex[(e >> 4) & 0x0f] + hex[e & 0x0f]);
  }
}