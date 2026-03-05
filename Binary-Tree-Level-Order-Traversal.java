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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> li = new ArrayList<>();
19        Queue<TreeNode> q = new LinkedList<>();
20        if (root == null)
21            return li;
22        q.add(root);
23        while (!q.isEmpty()) {
24            List<Integer> li2 = new ArrayList<>();
25            int size = q.size();
26            for (int i = 0; i < size; i++) {
27                TreeNode c = q.poll();
28                li2.add(c.val);
29                if (c.left != null) {
30                    q.add(c.left);
31                }
32                if (c.right != null) {
33                    q.add(c.right);
34                }
35            }
36            li.add(li2);
37        }
38        return li;
39    }
40}