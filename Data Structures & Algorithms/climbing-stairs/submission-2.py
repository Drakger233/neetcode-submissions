class Solution:
    def climbStairs(self, n: int) -> int:
        if n <= 3:
            return n
        
        dp1 = 2
        dp2 = 3
        
        for i in range(4,n+1):
            temp = dp1 + dp2
            dp1 = dp2
            dp2 = temp
        return temp

        