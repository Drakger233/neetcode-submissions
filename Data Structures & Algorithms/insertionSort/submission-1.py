# Definition for a pair.
# class Pair:
#     def __init__(self, key: int, value: str):
#         self.key = key
#         self.value = value
class Solution:
    def insertionSort(self, pairs: List[Pair]) -> List[List[Pair]]:
        res = []
        for i in range(len(pairs)):
            length = i - 1
            while (length>=0 and pairs[length+1].key < pairs[length].key):
                tmp = pairs[length+1]
                pairs[length+1] = pairs[length] 
                pairs[length] = tmp
                length -= 1
            res.append(pairs[:])        
        return res