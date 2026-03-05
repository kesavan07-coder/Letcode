1class Solution {
2    public boolean checkIfPangram(String sentence) {
3       return sentence.chars().distinct().count()==26;
4    }
5}