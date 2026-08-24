class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int pointOne = 0;
        int pointTwo = s.length() - 1;
        while (pointOne < pointTwo) {
            while (!Character.isLetterOrDigit(s.charAt(pointOne))) {
                pointOne++;
            }
            while (!Character.isLetterOrDigit(s.charAt(pointTwo))) {
                pointTwo--;
            }
            if (s.charAt(pointOne) != s.charAt(pointTwo)) {
                return false;
            }
            pointOne++;
            pointTwo--;
        }
        return true;
    }
}
