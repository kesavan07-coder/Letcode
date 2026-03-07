1class Solution {
2    public int countDigits(int num) {
3        int temp =num;
4        int k7=0;
5        while(num>0){
6        int dig = num %10;
7        if(dig !=0 && temp % dig==0){
8            k7++;
9        }
10        
11        num/=10;
12    }
13        return k7;
14    }
15}