class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> idx = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            idx.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            if(idx.containsKey(target-nums[i]) && idx.get(target-nums[i]) != i)
                return new int [] {i, idx.get(target-nums[i])};
        }
        return new int[]{};
    }
}
