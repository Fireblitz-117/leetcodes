class Solution {
    public boolean isPalindrome(int x) {
        String strNumber = String.valueOf(x);
        char[] arrays = strNumber.toCharArray();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] != arrays[arrays.length - 1 - i]) {
                return false;
            }
        }
        return true;
        
    }
}