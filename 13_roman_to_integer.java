class Solution {
    public int romanToInt(String s) {
        int number = 0;

        s = replacing(s);

        for (int i = 0; i < s.length(); i++) {
            number += getRomanValue(s, i);
            System.out.println(s.charAt(i));
        }

        System.out.println("string: " + s);

        return number;
    }

    public int getRomanValue(String s, int i) {
        switch (s.charAt(i)) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public String replacing(String s) {
        if (s.contains("IV")) {
            s = s.replaceAll("IV", "IIII");
        }
        if (s.contains("IX")) {
            s = s.replaceAll("IX", "VIIII");
        }
        if (s.contains("XL")) {
            s = s.replaceAll("XL", "XXXX");
        }
        if (s.contains("XC")) {
            s = s.replaceAll("XC", "LXXXX");
        }
        if (s.contains("CD")) {
            s = s.replaceAll("CD", "CCCC");
        }
        if (s.contains("CM")) {
            s = s.replaceAll("CM", "DCCCC");
        }

        return s;
    }
}
