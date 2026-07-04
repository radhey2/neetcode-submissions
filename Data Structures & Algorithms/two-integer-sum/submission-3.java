class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            res = target - nums[i];
            if (map.containsKey(res)) {
                return new int[] {map.get(res), i};
            }
            map.put(nums[i],i);
        }

        return ans;
    }
}
