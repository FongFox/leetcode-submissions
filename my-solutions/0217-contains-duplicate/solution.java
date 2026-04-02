class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> tempNums = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if(tempNums.contains(nums[i])) {
                return true;
            }
            
            tempNums.add(nums[i]);
        }

        return false;
    }
}
