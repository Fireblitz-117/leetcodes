class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int firstPointer = 0;
        int secondPointer = 0;
        int counter = 0;
        int[] newArray = new int[nums1.length + nums2.length];
        while (firstPointer < nums1.length && secondPointer < nums2.length) {
            if (nums1[firstPointer] <= nums2[secondPointer]) {
                newArray[counter] = nums1[firstPointer];
                firstPointer++;
            } else {
                newArray[counter] = nums2[secondPointer];
                secondPointer++;
            }
            counter++;
        }
        while (firstPointer < nums1.length) {
            newArray[counter] = nums1[firstPointer];
            counter++;
            firstPointer++;
        }
        while (secondPointer < nums2.length) {
            newArray[counter] = nums2[secondPointer];
            counter++;
            secondPointer++;
        }
        if (newArray.length % 2 == 0) {
            return (newArray[newArray.length/2 - 1] + newArray[newArray.length/2] ) / 2.0;
        } else {
            return newArray[(newArray.length) / 2];
        }
    }
}