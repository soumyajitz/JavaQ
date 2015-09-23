class Node2<T extends Comparable<T>>{
	public T value;
	public Node2<T> left;
	public Node2<T> right;
	public Node2(T value){
		this.value = value;
	}
}
class BST1<T extends Comparable<T>>{
	public Node2<T> root;
	
	@SuppressWarnings("rawtypes")
	public BST1 insert(T value){
		Node2<T> Node2 = new Node2<T>(value);
		if(root == null){
			root = Node2;
			return this;
		}
		insertNode(root,Node2);
		return this;
	}
	private void insertNode(Node2<T> root, Node2<T> Node2) {
		if (root.value.compareTo(Node2.value)>0)
		{
			if(root.left == null)
			{
				root.left = Node2;
				return;
			}
			else
			{
				insertNode(root.left,Node2);
			}
		}
		else
		{
			if(root.right == null)
			{
				root.right = Node2;
				return;
			}
			else
			{
				insertNode(root.right,Node2);
			}
		}
	}//end of insert method
//	public String findMax(){
//		Node2 max = null;
//		if(root==null){
//			System.out.prStringln("Nothing in Tree");
//		}
//		else
//		{
//			max = root;
//			while(max.right != null){
//				max = max.right;
//			}
//		}
//		return max.value;
//	}//end of findMax()

	private void inorder(Node2<T> n){
		if(n!=null){
			inorder(n.left);
			System.out.print(n.value+" ");
			inorder(n.right);
		}
		else
		{
			return;
		}
	}//end of inorder
	
	public void inorderString(){
		inorder(root);
	}
}//end of BST1 class

public class BSTImplGen {
	public static void main(String[] args) {
		BST1<String> b = new BST1<String>();
		b.insert("Z");
		b.insert("X");
		b.insert("Y");
		b.insert("A");
		b.insert("B");
		b.insert("C");
		b.insert("D");
		//System.out.prStringln(b.findMax());
		b.insert("E");
		b.insert("F");
		b.insert("G");
		b.insert("I");
		b.insert("H");
		System.out.println("Inorder: ");
		b.inorderString();
	}
}