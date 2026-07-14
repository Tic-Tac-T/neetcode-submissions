class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> seen = new HashMap<>();

        for(int i = 0; i< nums.length;i++){
            int c = target-nums[i];

            if(seen.containsKey(c)){
                return new int[]{seen.get(c),i};
            }
            seen.put(nums[i],i);
        }
        return new int[] {};
    }
}
