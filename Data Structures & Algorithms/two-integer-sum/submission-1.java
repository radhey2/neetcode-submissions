class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int ans[] = new int[2];
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = target - nums[i];
            int idx = hasEle(nums,res);
            if(idx != -1){
                ans[0] = idx;
                ans[1] = i;
            }
        }

        return ans;
    }

    public static int hasEle(int[] nums,int num) {
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == num){
                return i;
            }
        }
        return -1;
    }
}
