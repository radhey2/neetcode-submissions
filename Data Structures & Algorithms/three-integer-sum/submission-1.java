class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        int i = 0;
        int left = 1;
        int right = n - 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        while (i < n - 1) {
            // [-4, -1, -1, 0, 1, 2]
            int sum = nums[left] + nums[right] + nums[i];
            if (sum == 0) {
                List<Integer> l = new ArrayList<Integer>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);
                if (!list.contains(l)) {
                    list.add(l);
                }
                left++;
                right--;
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
            if (left >= right) {
                i++;
                left = i + 1;
                right = n - 1;
            }
        }
        return list;
    }
}
