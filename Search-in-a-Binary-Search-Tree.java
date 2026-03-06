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
17    public TreeNode searchBST(TreeNode root, int k7) {
18        if (root==null)
19        return null;
20        if(root.val ==k7)
21         return root;
22        if(k7>root.val){
23            return searchBST(root.right,k7);
24        }
25        if(k7< root.val){
26            return searchBST(root.left,k7);
27        }
28        return null;
29    }
30}