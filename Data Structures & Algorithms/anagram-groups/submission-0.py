class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        for s in strs:
            s_chars = sorted(s.lower())
            sorted_s = "".join(sorted(s_chars))
            if sorted_s not in anagrams:
                anagrams[sorted_s] = []
                anagrams[sorted_s].append(s)
            else:
                anagrams[sorted_s].append(s)
        anagram_groups = []
        for anagram in anagrams.values():
            anagram_groups.append(anagram)
        return anagram_groups