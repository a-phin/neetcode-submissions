class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        boolean valid = false;
        Stack<Character> brackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                brackets.push(s.charAt(i));
            } else {
                char openBracket = brackets.pop();
                if ((s.charAt(i) == ')' && openBracket == '(') || (s.charAt(i) == ']' && openBracket == '[') || (s.charAt(i) == '}' && openBracket == '{')) {
                    valid = true;
                }
            }
        }
        return valid;
    }
}
