class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minLength = getIterationCount(strs);
        String output = "";

        for (int i = 0; i < minLength; i++) {
            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != current) {
                    return output;
                }
            }

            output += current;
        }

        return output;
    }

    public int getIterationCount(String[] strs) {
        int min = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
            }
        }

        return min;
    }
}
