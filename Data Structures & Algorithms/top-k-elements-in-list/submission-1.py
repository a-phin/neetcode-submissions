class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        numbers = {}
        for i in nums:
            if i in numbers:
                numbers[i] += 1
            else:
                numbers[i] = 1
        k_freq_elements = []
        for i in range(k):
            k_freq_elements.append(max(numbers, key=numbers.get))
            numbers.pop(max(numbers, key=numbers.get))
        return k_freq_elements