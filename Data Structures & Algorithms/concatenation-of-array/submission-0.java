class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[(nums.length)*2];
        int n = arr.length;
        for(int i=0; i<n/2; i++){
            arr[i] = nums[i];
            arr[(i+n/2)] = nums[i];
        }
        return arr;
    }
}