class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 1) + 1);
        }
        return map.keySet().stream().sorted((a,b)->map.get(b).compareTo(map.get(a))).limit(k).mapToInt(num->num).toArray();
    }
}
