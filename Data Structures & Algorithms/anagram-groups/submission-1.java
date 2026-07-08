class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char[] ch1 = strs[i].toCharArray();

            Arrays.sort(ch1);
            String s1 = new String(ch1);

            if (!hashMap.containsKey((s1))) {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(s1, list);
            } else {
                hashMap.get(s1).add(strs[i]);
            }
        }

        List<List<String>> ans = new ArrayList<>(hashMap.values());

        return ans;
    }
}
