
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        while (true) {
            if (p.val < ancestor.val && q.val < ancestor.val) {
                ancestor = ancestor.left;
            } else if (p.val > ancestor.val && q.val > ancestor.val) {
                ancestor = ancestor.right;
            } else {
                break;
            }
        }
        return ancestor;
    }
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.right.right = new TreeNode(9);
        root.right.left = new TreeNode(5);
        
        TreeNode p = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        
        Solution solution = new Solution();
        
        TreeNode lca = solution.lowestCommonAncestor(root, p, q);
        
        System.out.println("Lowest Common Ancestor: " + lca.val);
    }
}
