// - 08 - page 106
// Use for-each style for on a two-dimensional array.
class ForEach3 {
  public static void main(String[] args) {
    int sum = 0;
    int[][] nums = new int[3][5];
    // give nums some values
    for(int i = 0; i < 3; i++)
      for(int j = 0; j < 5; j++)
        nums[i][j] = (i+1)*(j+1);
    /*   i -> rows | j-> columns
        nums[0] -> [1] [2] [3]  [4]  [5]
        nums[1] -> [2] [4] [6]  [8] [10]
        nums[2] -> [3] [6] [9] [12] [15]
     */
    // use for-each for to display and sum the values
    for(int[] x : nums) {
      for(int y : x) {
        System.out.println("Value is: " + y);
        sum += y;
      }
    }
    System.out.println("Summation: " + sum);
  }
}