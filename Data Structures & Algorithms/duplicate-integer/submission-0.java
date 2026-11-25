class Solution {
    public boolean hasDuplicate(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            if (checkDup(nums, i)) {
                return true;
            }
        }

        return false;
    }

    public boolean checkDup(int[] nums, int i) {
        for (int j = 0; j < nums.length; j++) {
            if (j != i) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }
}
