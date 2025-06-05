class Solution:
    def findMatrix(self, nums: list[int]) -> list[list[int]]:
        aux = {}
        mayor = 0
        for i in nums:
            if i in aux:
                aux[i] +=1
            else:
                aux[i]=1
        
        for i in aux.values():
            if i>mayor:
                mayor = i
        
        res = [[] for i in range(mayor)]
        for i in nums:
            idx = 0
            while True:
                if i not in res[idx]:
                    res[idx].append(i)
                    break
                else:
                    idx+=1
        return res

x = Solution()
print(x.findMatrix([1,3,4,1,2,3,1]))        
