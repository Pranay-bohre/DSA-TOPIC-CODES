public class DoublyLinkedList
{
  Node head;

  public void insert(int data)
  {
    Node node = new Node();
    node.data = data;
    node.next = null;
    node.prev = null;

    if (head == null)
    {
      head = node;
    } else
    {
      Node n = head;
      while (n.next != null)
      {
        n = n.next;
      }
      n.next = node;
      node.prev = n;

    }
  }

  public void show(){
    Node node = head;
    while(node.next!=null){
      System.out.println(node.data);
      node = node.next;
    }
    System.out.println(node.data);
    System.out.println(node.prev.prev.data);
  }
}
