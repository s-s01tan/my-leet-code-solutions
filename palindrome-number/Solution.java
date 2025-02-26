class Solution {
    public boolean isPalindrome(int x) {
        boolean isPolyndrome = true;
        String stringNumber = Integer.toString(x);

        char[] stringNumberCharacters = stringNumber.toCharArray();

        for (int i = 0; i < stringNumberCharacters.length; i++) {
            if (stringNumberCharacters[i] != stringNumberCharacters[stringNumberCharacters.length - i - 1]) {
                isPolyndrome = false;
            }
        }

        return isPolyndrome;
    }
}