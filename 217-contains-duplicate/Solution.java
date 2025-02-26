class Solution {
    public boolean containsDuplicate(int[] nums) {
          Set<Integer> existNums = new HashSet<>();

        for (int num : nums) {
            if (existNums.contains(num)) {
                return true;
            } else {
                existNums.add(num);
            }
        }

        return false;
    }
}