import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    // message(5);

    // System.out.println();
    // System.out.println("1. Fibonacci Series Element Sarch");
    // System.out.println("Enter n to print nth value in the series");

    // Fibonacci fibonacci = new Fibonacci();

    // System.out.println("nth value in the series is" + fibonacci.fibonacci(sc.nextInt()));

    // System.out.println();

    // System.out.println("2. Welcome to Binary Search!");
    
    // BinarySearch search = new BinarySearch();

    // System.out.print("Enter size of array");
    // int size = (sc.nextInt());
    // int array[] = new int[size];
    // System.out.print("Enter elementsf of array");
    // for(int i = 0; i < size; i++){
    //   array[i] = sc.nextInt();
    // }
    // System.out.print("Enter target to find in the array");
    // int target =sc.nextInt();
    // search.binarysearch(target, array);

    // isSorted isSorted = new isSorted();
    // isSorted.isSorted(array);

    // LinearSearch lSearch = new LinearSearch();
    // lSearch.LS(array, target);

    // TrianglePattern pattern = new TrianglePattern();
    // pattern.Print(0);
      int array[] = {11,25,12,22,64};
    BubbleSort bSort = new BubbleSort();
    bSort.Sort(array);

    System.out.println();

    SelectionSort sSort = new SelectionSort();
    sSort.Sort(array);
  }

  static void message(int a){
    if(a==0)
      return ;
    message(a-1);
    System.out.println("Welcome to Recursion " + (a));
  }
}
