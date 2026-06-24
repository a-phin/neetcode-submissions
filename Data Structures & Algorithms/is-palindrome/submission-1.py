class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        str_chars = []
        for c in s:
            if c.isalnum():
                str_chars.append(c)
        for i in range(len(str_chars)):
            if str_chars[i] != str_chars[len(str_chars) - 1 - i]:
                return False
        return True
        