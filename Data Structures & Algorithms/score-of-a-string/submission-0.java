class Solution {
    public int scoreOfString(String s) {
        int i=0, j=1, sum=0;
        while(j<s.length()){
            sum+= Math.abs(s.charAt(j)-s.charAt(i));
            i++;j++;
        }
        return sum;
    }
}