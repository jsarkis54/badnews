public class BadCode {

  // Print the average and the sum of an array of integers
  private int PRINTsumandAVERAGE(int x[]) {
    int sum;
    int average;

    for (int i = 0; i < x.length; i++) {
      average += x[i];
    }
    // isn't this for loop giving us the sum instead of the average?

    sum = average / x.length;
    // Isn't this the average instead of the sum? Are these a case of mislabeling variables? 
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);

    return 0;
  }

  public static void main(String argv[]) {
    // Some testing data
    int array[] = {1, 2, 3};

    BadCode bc = new BadCode();
    bc.PRINTsumandAVERAGE(array);
    // can we call the class that main method is already in? just use PRINTsumandAVERAGE(array)
  }
}
