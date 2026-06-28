class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numbers = {}
        for i in nums:
            if i in numbers:
                numbers[i] += 1
            else:
                numbers[i] = 1
        k_freq_elements = []
        for n in numbers:
            if numbers[n] >= k:
                k_freq_elements.append(n)
        return k_freq_elements