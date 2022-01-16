

// "Implement binary Tree class and insert few numbers into it and perform the following :
// 1. Inorder , pre-order and post order traversal using recursion. 
// 2. Finding height of a tree. 
// 3. Get the count of nodes in a Binary tree.
// 4. Print only the leaf nodes in a binary Tree.
// 5. Sum all the nodes values and print the final sum on the screen."





import java.util.Queue;
import java.util.LinkedList;
class node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}
public class BinaryTree1{
	static int levelSoFar=0;
	public static void preorder(Node root) {
		if(root==null) return;
		System.out.print(root.key+",");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.key+",");
		inorder(root.right);
		
	}
    
	public static void postOrder(Node root) {
		if(root==null) return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key+",");
		
	}
		
	static int getHeight(Node node)
    {
        if (node == null)
            return -1;
        else
        {
            int lheight = getHeight(node.left);
            int rheight = getHeight(node.right);
            if (lheight >= rheight)
                return (lheight + 1);
             else
                return (rheight + 1);
        }
    }

	static void print_leafNodes(Node root){
		if(root == null) return;

		if(root.left == null && root.right==null){
			System.out.println("LeafNode:"+ root.key);
		}
		print_leafNodes(root.left);
		print_leafNodes(root.right);
	}
	static int get_count(Node root){
	    if(root==null){
	        return 0;
	    }
		int leftCount = get_count(root.left);
		int rightCount = get_count(root.right);
	    return 1+ leftCount + rightCount;
	}
	static void leftView(Node root, int currlevel) {
		if(root == null) return ;
		
		if(currlevel >= levelSoFar) { 
			System.out.println(root.key);
			levelSoFar++; 
		}
		
		leftView(root.left,currlevel+1);
		leftView(root.right,currlevel+1);
	}
	static void PrintKthLevel(Node root, int k) {
		if(root==null) return;
		
		if(k==0) {
			System.out.print(root.key+" ");
		}
		PrintKthLevel(root.left, k-1);
		PrintKthLevel(root.right, k-1);
	}
	static void levelTraversal(Node root) {
		int h = getHeight(root);
		
		for(int i=0;i<=h;i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}
	static void LevelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()){
			int k = q.size();
			while(k>0){
				Node front = q.poll();
				if(front.left!=null){
					q.add(front.left);
				}
				if(front.right!=null){
					q.add(front.right);
				}
				System.out.print(front.key+",");
				k--;
			}
			System.out.println();
		}
	}
	static void LeftViewOfTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while(!q.isEmpty()){
			int k = q.size();
			for(int i=0;i<k;i++){
				Node front = q.poll();
				if(i==0){
					System.out.print(front.key+",");
				}
				
				if(front.left!=null){
					q.add(front.left);
				}
				if(front.right!=null){
					q.add(front.right);
				}
			}
			System.out.println();
		}
	}
	static int sum(Node root) 
	{ 
	    if (root == null) 
	        return 0; 
	    return (root.key + sum(root.left) + 
	                       sum(root.right)); 
	} 
    public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		LeftViewOfTree(root);
		leftView(root,0);
	preorder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inorder(root);
		System.out.println(get_count(root));
	}
}