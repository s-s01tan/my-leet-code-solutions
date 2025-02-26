class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = { 0, 0 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;
                    }
                }
            }

            if (result[0] != result[1]) {
                break;
            }
        }

        return result;
    }
}