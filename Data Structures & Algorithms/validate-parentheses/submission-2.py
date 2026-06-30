class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for c in s:
            if c == '(' or c == '{' or c == '[':
                stack.append(c)
            elif len(stack) > 0:
                open_bracket = stack.pop()
                if (c == ')' and open_bracket != '(') or (c == '}' and open_bracket != '{') or (c == ']' and open_bracket != '['):
                    return False
            else:
                return False
        return True