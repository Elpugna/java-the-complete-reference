// - 03 - Page 96
// The target of a loop can be empty.
class NoBody {
  public static void main(String[] args) {
    int i, j;
    i = 100;
    j = 200;
// find midpoint between i and j
    while(++i < --j); // no body in this loop
    //Therefore, if I remove the ; in the above line, I will get the below statement printed from 101- 149
    System.out.println("Midpoint is " + i);
  }
}