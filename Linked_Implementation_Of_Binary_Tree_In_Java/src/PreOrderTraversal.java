public class PreOrderTraversal
{
  private TreeNode root;

  private class TreeNode{
    private TreeNode left;
    private TreeNode right;
    private int data;


    public TreeNode(int data){
      this.data = data;
      left = null;
      right = null;
    }
  }

  public void createBinaryTree(){
    TreeNode first = new TreeNode(3);
    TreeNode second = new TreeNode(7);
    TreeNode third = new TreeNode(19);
    TreeNode fourth = new TreeNode(11);
    TreeNode fifth = new TreeNode(13);
    TreeNode sixth = new TreeNode(6);
    root = first;
    first.left = second;
    first.right = third;
    second.left = fourth;
    third.left = fifth;
    third.right = sixth;

    System.out.println("first node" + first.data);
    System.out.println("second node" + second.data);
    System.out.println("third node" + third.data);
    System.out.println(second.right);
    System.out.println("fifth node" + fourth.data);
    System.out.println("sixth node" + fifth.data);
    System.out.println("sixth node" + sixth.data);

    PreOrder(root);
  }

  public TreeNode PreOrder(TreeNode root){
    if(root!= null){
      System.out.print(root.data + " ");
    PreOrder(root.left);
    PreOrder(root.right);}
    return root;
  }

  public static void main(String[] args)
  {
    PreOrderTraversal p = new PreOrderTraversal();
    p.createBinaryTree();
  }
}
