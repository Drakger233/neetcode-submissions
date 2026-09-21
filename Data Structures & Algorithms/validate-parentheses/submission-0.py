class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        brakcets = {")":"(", "]" : "[", "}" : "{" }

        for c in s:
            if c in brakcets:
                if stack and stack[-1] == brakcets[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        return not stack