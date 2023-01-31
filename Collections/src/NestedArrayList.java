import java.io.*;
import java.util.*;
// import java.util.Scanner;

public class NestedArrayList {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int input;
    for(int i = 0; i<n; i++){
      int d = scan.nextInt();
      ArrayList<Integer> line = new ArrayList<>(d);
      System.out.println("Inside first loop");
      for(int j = 0; j<d; j++){
        System.out.println("Inside second loop");
        input = scan.nextInt();
        line.add(input);
      }
      System.out.println("Exited second loop");
      arr.add(line);
    }
    int q = scan.nextInt();
    for(int i = 0 ; i < q; i++){
      System.out.println("Inside third loop");
      int x, y;
      x = scan.nextInt();
      y = scan.nextInt();
      try{
        System.out.println(arr.get(x-1).get(y-1));}
      catch(Exception e) {
        System.out.println("ERROR !");
      }
    }
    scan.close();
  }
}
