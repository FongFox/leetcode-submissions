class Solution {
    // Brutal force
    // public int[] twoSum(int[] nums, int target) {
    //     int n = nums.length;
    //     for(int i=0; i<n; i++) {
    //         int numFind = target - nums[i];
    //         for(int j=i+1; j<n; j++) {
    //             if(numFind == nums[j]) {
    //                 return new int[] {i,j};
    //             }
    //         }
    //     }

    //     return null;
    // }

    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> tempHashMap = new HashMap<Integer, Integer>();
       
       int n = nums.length;
       for(int i=0; i<n; i++) {
            int numFinding = target - nums[i];
            if(tempHashMap.containsKey(numFinding)) {
                return new int[] {i, tempHashMap.get(numFinding)};
            }
            tempHashMap.put(nums[i], i);
       }

       return null;
    }
}
