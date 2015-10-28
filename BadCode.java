public class BadCode {

  // Print the average and the sum of an array of integers
  private int PRINTsumandAVERAGE(int x[]) {
    int sum;
    int average;

    for (int i = 0; i < x.length; i++) {
      average += x[i];
    }

    sum = average / x.length;

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    return 0;
  }

  public static void main(String argv[]) {
    // Some testing data
    int array[] = {1, 2, 3};

    BadCode bc = new BadCode();
    bc.PRINTsumandAVERAGE(array);
  }
}
