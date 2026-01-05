class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] array = s.split(" ");
        String word = array[array.length - 1];
        return word.length();       
    }
}