// "1. PrintKthLevel nodes only for a binary tree.
// 2. Print right nodes only using iterative code.
// 3. Level order traversal  in both (Recursive + Iterative)


import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
class node {
    Node data;
    node left;
    node right;
}
public class binaryTree2 {
	static node newNode(int data)
	{
	    node temp = new node();
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	    return temp;
	}
	static void nodesAtKthLevel(node root,
	                        int k){
	    if (root == null)
	        return;
	    Queue<node> que = new LinkedList<node>();
	    que.add(root);
	    HashSet<Integer> s = new HashSet<Integer>();
	    int level = 0;
	    int flag = 0;
	    while (!que.isEmpty()) {
	        int size = que.size();
	        while (size-- > 0) {
	            node ptr = que.peek();
	            que.remove();
	            if (level == k) {
	                flag = 1;
	                s.add(ptr.data);
	            }
	            else {
	                if (ptr.left!=null)
	                    que.add(ptr.left);
	                if (ptr.right!=null)
	                    que.add(ptr.right);
	            }
	        }
	        level++;
	        if (flag == 1)
	            break;
	    }
	    for (int it : s) {
	        System.out.print(it+ " ");
	    }
	    System.out.println();
	}
	public static void printRightView(Node root)
    {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        int size=0;;
        Node curr = null;
        while (!queue.isEmpty())
             size = queue.size();
            int i = 0;
            while (i++ <size)
            {
                curr = queue.poll();
                if (i == size) {
                    System.out.print(curr.key + " ");
                }
 
                if (curr.left != null) {
                    queue.add(curr.left);
                }
 
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
	 public static boolean printLevel(node root, int level)
	    {
	        if (root == null) {
	            return false;
	        }
	        if (level == 1)
	        {
	            System.out.print(root.data + " ");
	            return true;
	        }
	 
	        boolean left = printLevel(root.left, level - 1);
	        boolean right = printLevel(root.right, level - 1);
	 
	        return left || right;
	    }
	    public static void levelOrderTraversal(node root)
	    {
	        int level = 1;
	        while (printLevel(root, level)) {
	            level++;
	            }
	        }
	    public boolean pathSum (node root, int targetSum){
	    	Stack<Node> nodestack = new Stack<>();
	    	Stack<Integer> sumstack = new Stack<>();
	    	nodestack.push(root.data);
	    	sumstack.push(targetSum - root.data); 
	    	Node temp = root;
	    	int currentsum;
	    	
	    	while(!nodestack.isEmpty()){ 
	    		temp = nodestack.pop();
	    		currentsum = sumstack.pop();
	    		if ( (temp.left == null) && (temp.right == null) && (currentsum == 0) ) return true;
	    		
	    		if (temp.left != null){
	    			nodestack.add(temp.left);
	    			sumstack.add(currentsum - temp.left);
	    			}
	    		if (temp.right != null){
	    			nodestack.add(temp.left);
	    			sumstack.add(currentsum - temp.right);
	    			}
	    		}
	    		return false;
	    	}
	    
	public static void main(String[] args)
	{
	    node root = new node();
	    root = newNode(59);
	    root.left = newNode(19);
	    root.right = newNode(29);
	    root.left.left = newNode(78);
	    root.left.right = newNode(11);
	    root.right.left = newNode(35);
	    int level = 1;
	    nodesAtKthLevel(root, level);
	  
	}
}