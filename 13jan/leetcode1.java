// Path Sum


class Solution {
	public boolean hasPathSum(TreeNode root, int targetSum) {
		 //return recursion(root, targetSum); 
		return iterative(root, targetSum);
	}
	public boolean recursion(TreeNode root, int targetSum){
		if (root==null) return false;
		if (root.left==null && root.right==null) return (targetSum-root.val) == 0;
		return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
	}
	public boolean iterative(TreeNode root, int targetSum){
		if(root==null) return false; 
		Stack<TreeNode> stack1=new Stack<TreeNode>();
		Stack<Integer> stack2=new Stack<Integer>();

		stack1.push(root);
		stack2.push(targetSum-root.val);

		while(!stack1.isEmpty()){
			TreeNode cur = stack1.pop();
			int reminder = stack2.pop();
			if(cur.left==null && cur.right==null && reminder==0)
				return true;

			if(cur.right!=null){
				stack1.push(cur.right);
				stack2.push(reminder-cur.right.val);
			}
			if(cur.left!=null){
				stack1.push(cur.left);
				stack2.push(reminder-cur.left.val);
			}
		}
		return false;
	}
}