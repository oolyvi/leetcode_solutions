class Solution {
    public boolean isPalindrome(int x) {
        int temp = Math.abs(x);
        List<Integer> digits = new LinkedList<>();
        List<Integer> reverse = new LinkedList<>();

        if (temp == 0) {
            digits.add(0);
        }

        while (temp > 0) {
            digits.add(0, temp % 10);
            temp /= 10;
        }

        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.println("index of digits: " + digits.get(i));
            reverse.add(digits.get(i));
        }

        System.out.println("digits: " + digits);
        System.out.println("reverse: " + reverse);

        Boolean areEqual = (digits.equals(reverse) && x >= 0) ? true : false;

        return areEqual;
    }
}
