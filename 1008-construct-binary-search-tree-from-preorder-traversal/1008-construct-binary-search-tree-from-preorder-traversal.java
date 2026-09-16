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
    public void buildbst(TreeNode root, int val){
        TreeNode temp = root;
        TreeNode p = null;
        TreeNode newnode = new TreeNode(val,null,null);

        while(temp!=null){
            p = temp;
            if(temp.val>val) temp = temp.left;
            else temp = temp.right;
        }
        if(p.val>val) p.left = newnode;
        else p.right = newnode;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0],null,null);
        for(int i=1;i<preorder.length;i++){
            buildbst(root,preorder[i]);
        }
        return root;

    }
}