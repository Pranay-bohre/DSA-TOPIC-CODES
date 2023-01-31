
public class LinkedList
{
  Node head;

  public void insert(int data){
    Node node = new Node(); //object of Node class, data and next available
    node.data = data;
    node.next = null;

    if(head == null){
      head = node;
    }
    else
    {
      Node n = head;
      while(n.next!=null){
        n = n.next;
      }
      n.next = node;
    }
  }

  public void show(){
    Node node = head;
    while(node!=null){
      System.out.println(node.data);
      node = node.next;
    }
//    System.out.print(node.data);
  }

  public void insertNexttoData(int data,int nodedata)
  {
    Node setnode = new Node();
    setnode.data = data;
    setnode.next = null;

    if (head == null)
    {
      head = setnode;
    } else
    {
      Node n = head;
      while (n.data != nodedata)
      {
        n = n.next;
      }
      Node tempNode = n.next;
      n.next = setnode;
      setnode.next = tempNode;
    }
  }

  public void delete(int data)
  {
    Node n = head;
    if (n.data == data)
    {
      head = n.next;
    } else
    {
      Node prevNode = new Node();
      while (n.data != data)
      {
        prevNode = n;
        n = n.next;
      }
      prevNode.next = n.next;
    }
  }
}
