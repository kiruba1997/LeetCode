/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = false;
        if(root==null){
            return result;
        }
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> level = new ArrayList<>();
            int n = q.size();
            for(int i=0;i<n;i++){
                TreeNode cur = q.poll();
                level.add(cur.val);
                if(cur.left!=null) q.add(cur.left);
                if(cur.right!=null) q.add(cur.right);
            }
            if(flag) Collections.reverse(level);
            result.add(level);
            flag = !flag;
        }
        return result;

    }
}