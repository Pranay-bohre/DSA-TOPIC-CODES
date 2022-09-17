public class BinaryTree
{
  private TreeNode root;

  private class TreeNode{
    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(int data){
      this.data = data;
          }
  }

  public void createBinaryTree(){
    TreeNode first = new TreeNode(1);
    TreeNode second = new TreeNode(3);
    TreeNode third = new TreeNode(3);
        root = first;
    first.left = second;
    first.right = third;
    second.left = null;
    second.right = null;
    third.left = null;
    third.right = null;

    System.out.println("first node" + first.data);
    System.out.println("second node" + second.data);
    System.out.println("third node" + third.data);
  }

  public static void main(String[] args)
  {
    BinaryTree b = new BinaryTree();
    b.createBinaryTree();
  }
}
