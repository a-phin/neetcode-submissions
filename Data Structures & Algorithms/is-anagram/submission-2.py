class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """
        1. Understand
        Input: s, t (lowercase english letters)
        Output: boolean value - true if the two strings are anagrams, false otherwise
        Core Logic: two strings contain the same characters; each character appears the same number of times; order does not matter
        Edge Cases:
        - s and t both contain one character - return true if same character, return false otherwise
        - s and t are of length 5 * 10^4
        Constraints:
        - s.length = t.length - if s.length /= t.length, return false

        2. Match
        - two pointers?
        - hash table?
        - map with key-value pairs

        3. Plan
        (1) Check if the length of s /= length of t - return false if length of s /= length of t
        (2) Initialize two empty maps (for s and t) which takes characters as keys, and its counts as values
        (3) Iterate through the characters of s and store the characters in the map
        (4) If the character does not exist in the map of s, add the character as a key, with a value of 1. Otherwise, increment the value by 1
        (5) Repeat with the characters of t (steps 3/4)
        (?) Return if the maps are equal to each other
        """
        if len(s) != len(t):
            return False
        
        s_chars = {}
        for ch in s:
            if ch not in s_chars:
                s_chars[ch] = 1
            else:
                s_chars[ch] = s_chars[ch] + 1
        
        t_chars = {}
        for ch in t:
            if ch not in t_chars:
                t_chars[ch] = 1
            else:
                t_chars[ch] = t_chars[ch] + 1
        
        return s_chars == t_chars