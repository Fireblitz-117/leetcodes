class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int max = 0;
        int current;
        while (i < j) {
            current = ((j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
            if (max < current) {
                max = current;
            }
        }
        return max;
    }
}