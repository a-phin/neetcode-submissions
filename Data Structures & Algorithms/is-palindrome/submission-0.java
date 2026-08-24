class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int pointOne = 0;
        int pointTwo = s.length() - 1;
        while (pointOne < pointTwo) {
            while (pointOne < s.length() - 1 && !Character.isLetterOrDigit(s.charAt(pointOne))) {
                pointOne++;
            }
            while (pointTwo > 0 && !Character.isLetterOrDigit(s.charAt(pointTwo))) {
                pointTwo--;
            }
            if (Character.isLetterOrDigit(s.charAt(pointOne)) && Character.isLetterOrDigit(s.charAt(pointTwo)) && s.charAt(pointOne) != s.charAt(pointTwo)) {
                return false;
            }
            pointOne++;
            pointTwo--;
        }
        return true;
    }
}
