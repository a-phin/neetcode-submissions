class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_chars = {}
        for i in range(len(s)):
            if s[i] in s_chars:
                s_chars[s[i]] += 1
            else:
                s_chars[s[i]] = 1
        t_chars = {}
        for i in range(len(t)):
            if t[i] in t_chars:
                t_chars[t[i]] += 1
            else:
                t_chars[t[i]] = 1
        return s_chars == t_chars