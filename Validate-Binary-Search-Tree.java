1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public boolean isValidBST(TreeNode root) {
18        return naatha (root,Long.MIN_VALUE,Long.MAX_VALUE);
19        }
20        boolean naatha(TreeNode root,long a,long b){
21            if(root == null) return true;
22            if(!(root.val>a && root.val<b)) return false;
23            return naatha (root.left,a,root.val)&& naatha(root.right,root.val,b);
24        }
25    }
26