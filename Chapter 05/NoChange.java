// - 07 - Page 105
// The for-each loop is essentially read-only.
class NoChange {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    for(int x: nums) {
      System.out.print(x + " ");
      x = x * 10; // no effect on nums
      //It does change the variable value inside the loop block though
      //System.out.println(x) will print ten times x.
    }
    System.out.println();
    for(int x : nums)
      System.out.print(x + " ");
    System.out.println();
  }
}