class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i;
        for(String s : strs) {
            if(s.length() == 0)
                return "";
            for(i=0; i<Math.min(s.length(), prefix.length()); i++) {
                if(s.charAt(i) != prefix.charAt(i))
                    break;
            }
            prefix = prefix.substring(0, i);
        }
        return prefix;
    }
}