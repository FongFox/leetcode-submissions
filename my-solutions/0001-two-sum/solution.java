class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int numAvailable = target - nums[i];
            if(hashMap.containsKey(numAvailable)) {
                return new int[]{i, hashMap.get(numAvailable)};
            }
            hashMap.put(nums[i], i);
        }

        return new int[2];
    }
}
