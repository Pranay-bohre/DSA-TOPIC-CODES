public class RunnerClass
{
  public static void main(String[] args){
    LinkedList list = new LinkedList();
    list.insert(5);
    list.insert(15);
    list.insert(25);
    list.insert(30);
    list.insert(35);
    list.insert(52);
    list.insertNexttoData(23, 52);
    list.insertNexttoData(14, 5);
    list.show();
    System.out.println();
    System.out.println("--------------------------------");
    list.delete(5);
    list.delete(25);
    list.show();

    System.out.println();
    System.out.println("--------------------------------");
    list.delete(35);
    list.show();

    System.out.println();
    System.out.println("--------------------------------");

    DoublyLinkedList Doublylist = new DoublyLinkedList();
    Doublylist.insert(14);
    Doublylist.insert(41);
    Doublylist.insert(23);
    Doublylist.insert(17);

    Doublylist.show();
  }
}
