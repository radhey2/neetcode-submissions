class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<String> list = new ArrayList<>();

        int n = strs.length;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (char ch : strs[i].toCharArray()) {
                freq[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int j : freq) {
                sb.append("#");
                sb.append(j);
            }
            String key = new String(sb);
            if (!map.containsKey(key)) {
                List<String> list2 = new ArrayList<>();
                list2.add(strs[i]);
                map.put(key, list2);
            } else {
                map.get(key).add(strs[i]);

            }
        }

        return new ArrayList<>(map.values());
    }
}
