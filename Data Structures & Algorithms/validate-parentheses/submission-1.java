class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> openBrackets = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                openBrackets.push(s.charAt(i));
            } else {
                if (openBrackets.size() == 0) {
                    return false;
                }
                char openBracket = openBrackets.pop();
                if (openBracket == '(' && s.charAt(i) != ')' || openBracket == '[' && s.charAt(i) != ']' || openBracket == '{' && s.charAt(i) != '}') {
                    return false;
                }
            }
        }
        return openBrackets.size() == 0;
    }
}
