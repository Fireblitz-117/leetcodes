class Solution {
    public int matrixSum(int[][] nums) {
        int rows = nums.length;
        int cols = nums[0].length;
        int sum = 0;
        for (int[] row:nums) {
            Arrays.sort(row);
        }
        for (int i = 0; i < cols; i++) {
            int colMax = 0;
            for (int j = 0; j < rows; j++) {
                if (nums[j][i] > colMax) {
                    colMax = nums[j][i];
                }
            }
            sum += colMax;
        }
        return sum;
    }
}