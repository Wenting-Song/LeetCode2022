class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        height(root, res);
        return res; 
    }
    private int height(TreeNode node, List<List<Integer>> res){
        if(node == null) return -1;
        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
        if(res.size()==level) res.add(new ArrayList<>());
        res.get(level).add(node.val);
        node = null; // remove visited nodes
        return level;
        
    }
}
