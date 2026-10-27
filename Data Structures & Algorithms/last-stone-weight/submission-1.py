class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        while len(stones)>1:
            stones.sort()
            x=stones[-1]
            y=stones[-2]
            z=x-y
            stones.pop()
            stones.pop()
            stones.append(z)
        return stones[0]