class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]:
        ans = []
        self.permute_r(nums,ans,0)
        return ans

    def permute_r(self, nums: list[int], aux: list[int], ind: int) -> None:
        if (ind == len(nums)):
            aux.append(nums[:])
        else:
            for i in range(ind, len(nums)):
                nums[ind], nums[i] = nums[i], nums[ind]
                self.permute_r(nums, aux, ind+1)
                nums[ind], nums[i] = nums[i], nums[ind]
                

X = Solution()
print(X.permute([1,2,3]))
