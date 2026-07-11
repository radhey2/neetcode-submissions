class Solution {
    HashSet<Integer> set = new HashSet<>();

    public int longestConsecutive(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (Integer num : set) {
            count = Math.max(count, seq(set, num));
        }
        return count;
    }

    public int seq(Set<Integer> set, int num) {
        if (!set.contains(num)) {
            return 0;
        }

        return 1 + seq(set,num + 1);
    }
}
