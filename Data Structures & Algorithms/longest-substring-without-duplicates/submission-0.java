class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n<=1) return n;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        int l=0;
        int r=1;
        map.put(s.charAt(l), l);
        while(l<r && r<n) {
            Character ch = s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l) {
                l = map.get(ch); l++;
            }
            if(s.substring(l,r+1).length() > max)
                max = s.substring(l,r+1).length();
            map.put(ch, r);
            r++;
        }
        return max;
    }
}
