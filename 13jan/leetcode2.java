//    Average of Levels in Binary Tree

class Solution {
    List<Double> sum = new ArrayList();
    List<Double> count = new ArrayList();
    public List<Double> averageOfLevels(TreeNode root) {
        helper(root, 0);
        List<Double> ret = new ArrayList();
        for(int i = 0; i < sum.size(); i ++){
            ret.add(sum.get(i) / count.get(i));
        }
        return ret;
    }
    public void helper(TreeNode node, int l){
        if(node == null) return;
        if(l < sum.size()){
            count.set(l, count.get(l)+1);
            sum.set(l, sum.get(l)+node.val); 
        }else{
            count.add(1.0);
            sum.add(node.val*1.0); 
        }
        helper(node.left, l+1);
        helper(node.right, l+1);
    }
}