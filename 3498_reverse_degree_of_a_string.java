class Solution {
    public int reverseDegree(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int reversedValue = 'z' - s.charAt(i) + 1;
            sum += reversedValue * (i + 1);
        }

        return sum;
    }
}
