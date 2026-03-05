1class Solution {
2    public int minOperations(String s) {
3        int count =0;
4        int n= s.length();
5        for(int i=0;i<n;i++){
6            count+=(s.charAt(i)^i)&1;
7
8        }
9        return Math.min(count,n-count);
10    }
11}