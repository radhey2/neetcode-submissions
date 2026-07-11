class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; // 4

        int arr[] = new int[n];
        int arr2[] = new int[n];
        int p1 = 1;
        int p2 = 1;
        arr[0] = p1;
        for (int i = 1; i < n; i++) {
            p1 = p1 * nums[i - 1];
            arr[i] = p1;
        }

        arr2[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            p2 = p2 * nums[i + 1];
            arr2[i] = p2;
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int p3 = arr[i] * arr2[i];
            result[i] = p3;
        }

        return result;
    }
}