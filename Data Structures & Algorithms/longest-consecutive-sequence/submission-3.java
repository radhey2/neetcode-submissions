class Solution {
    HashSet<Integer> set = new HashSet<>();

    public int longestConsecutive(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int count = 0;
        int currentCount = 1;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i : map.keySet()) {
            if (map.containsKey(i + 1)) {
                currentCount++;
            } else {
                count = Math.max(currentCount, count);
                currentCount = 1;
            }
        }
        return count;
    }
}
