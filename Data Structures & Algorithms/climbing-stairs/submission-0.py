class Solution:
    def climbStairs(self, n: int) -> int:
        if n < 2:
            return n
        
        climbStairs = [0,1]
        i = 2
        while i <= n:
            tmp = climbStairs[1]
            climbStairs[1] = climbStairs[0] + climbStairs[1]
            climbStairs[0] = tmp
            i+=1
        return climbStairs[0] + climbStairs[1]

        
