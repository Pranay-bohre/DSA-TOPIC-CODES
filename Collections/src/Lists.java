import java.util.*;

public class Lists
{

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    List<Integer> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    for(int i = 0 ; i< N ; i++){
      list.add(scan.nextInt());
      System.out.println("loop ran times : " + i);
    }
    int Q = scan.nextInt();
    for(int i =1 ; i<=Q; i++){
      String query = scan.next().toLowerCase();
      if(query.equals("insert")){
        list.add(scan.nextInt(), scan.nextInt());
      }
      else if(query.equals("delete")){
        list.remove(scan.nextInt());
      }
    }
    for(int i = 0 ; i< N ; i++){
      System.out.print(list.get(i)+ " ");
    }

  }
}
