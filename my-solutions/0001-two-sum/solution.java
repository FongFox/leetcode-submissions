class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hashmap (key is value of array element, value is index of element in array)
        HashMap<Integer, Integer> temp = new HashMap<>();

        int n = nums.length;
        for(int i=0; i<n; i++) {
            int numNeedToFind = target - nums[i];
            if(temp.containsKey(numNeedToFind)) {
                return new int[] {i, temp.get(numNeedToFind)};
            }
            temp.put(nums[i], i);
        }

        return null;
    }
}
