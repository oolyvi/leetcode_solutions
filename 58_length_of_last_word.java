class Solution {
    public int lengthOfLastWord(String s) {

        String regex = "[,\\.\\s]";
        String[] array = s.split(regex);
        String lastString = array[array.length - 1];
        
        return lastString.length();
    }
}
