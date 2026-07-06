class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;

        int i = 0;
        int left = 1;
        int right = n - 1;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        while (i < n - 2) {
            if (nums[i] > 0)
                break;
            // [-4, -1, -1, 0, 1, 2]
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                left = i + 1;
                right = n - 1;
                continue;
            }
            int sum = nums[left] + nums[right] + nums[i];
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                List<Integer> l = new ArrayList<Integer>();
                l.add(nums[i]);
                l.add(nums[left]);
                l.add(nums[right]);

                list.add(l);
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
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
