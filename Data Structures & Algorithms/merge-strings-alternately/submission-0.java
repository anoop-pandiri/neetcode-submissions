class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        int i = 0;
        for(i=0; i<Math.min(m,n); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(m>n)
            sb.append(word1.substring(i,m));
        else
            sb.append(word2.substring(i,n));
        return sb.toString();
    }
}