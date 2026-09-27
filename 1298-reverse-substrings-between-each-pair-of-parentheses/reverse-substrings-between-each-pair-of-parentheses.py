class Solution(object):
    def reverseParentheses(self, s):
        stack = []
        cur = ""
        for ch in s:
            if ch=='(':
                stack.append(cur)
                cur = ""
            elif ch==')':
                cur = cur[::-1]
                cur = stack.pop() + cur
            else:
                cur+=ch
        return cur

