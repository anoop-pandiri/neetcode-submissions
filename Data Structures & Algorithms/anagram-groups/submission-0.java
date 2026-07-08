class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> hm = new HashMap<>();
        for(int i=0; i<strs.length; i++) {
            int[] carr = new int[26];
			char[] s = strs[i].toCharArray();
			for(int j=0;j<s.length;j++){
				carr[s[j] - 'a']++;
			}
			if(!hm.containsKey(Arrays.toString(carr))){
				hm.put(Arrays.toString(carr), new ArrayList<String>());
			}
			hm.get(Arrays.toString(carr)).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
