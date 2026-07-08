class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        List<Integer> values = map.entrySet()
                                   .stream()
                                   .sorted((a, b) -> b.getValue() - a.getValue())
                                   .limit(k)
                                   .map(Map.Entry::getKey)
                                   .toList();
        return values.stream().mapToInt(Integer::intValue).toArray();
    }
}
