class Solution {
    public void swap(int index1, int index2, int[] numsss) {
        int temp = numsss[index1];
        numsss[index1] = numsss[index2];
        numsss[index2] = temp;
    }
    
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(i, nums[i] - 1, nums);
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }
}