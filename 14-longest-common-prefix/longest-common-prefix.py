class Solution(object):
    def longestCommonPrefix(self, strs):
        x = ""
        for i in range(len(strs[0])):
            if all(i < len(s) and s[i] == strs[0][i] for s in strs):
                x += strs[0][i]
            else:
                return x
        return x