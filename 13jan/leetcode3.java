//   Leaf-Similar Trees

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        helper(root1,list1);
        helper(root2,list2);
        if(list1.size() != list2.size()) return false;
        for (int i = 0;i < list1.size();i++){
            if(!list1.get(i).equals(list2.get(i))) return false;
        }
        return true;
    }
    private void helper(TreeNode node,List<Integer> list){
        if(node != null){
            helper(node.right,list);
            if(node.right == null && node.left == null) list.add(node.val);
            helper(node.left,list);
        }
    }
}