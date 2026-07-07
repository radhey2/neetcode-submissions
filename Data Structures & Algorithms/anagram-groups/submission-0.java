class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupAnagrams = new ArrayList<List<String>>();
        int n = strs.length;
        for (int i = 0; i < strs.length; i++) {
            List<String> group = new ArrayList<>();

            boolean alreadyGrouped = false;

            for (List<String> group1 : groupAnagrams) {
                if (group1.contains(strs[i])) {
                    alreadyGrouped = true;
                    break;
                }
            }
            if (!alreadyGrouped) {
                group.add(strs[i]);
            } else {
                continue;
            }

            for (int j = n - 1; j > i; j--) {
                if (strs[i].length() != strs[j].length()) {
                    continue;
                } else {
                    char[] arr = strs[i].toCharArray();
                    char[] arr2 = strs[j].toCharArray();

                    Arrays.sort(arr);
                    Arrays.sort(arr2);

                    String s1 = new String(arr);
                    String s2 = new String(arr2);

                    if (s1.equals(s2)) {
                        group.add(strs[j]);
                    }
                }
            }
            groupAnagrams.add(group);
        }

        return groupAnagrams;
    }
}
