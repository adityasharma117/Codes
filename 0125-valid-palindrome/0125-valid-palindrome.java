class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int high = s.length() - 1;

        while (l < high) {

            while (l < high && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < high && !Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            }

            if (Character.toLowerCase(s.charAt(l)) !=
                Character.toLowerCase(s.charAt(high))) {
                return false;
            }

            l++;
            high--;
        }

        return true;
    }
}
