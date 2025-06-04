function permute(nums: number[]): number[][] {
    const result: number[][] = [];
    permuteR(nums, 0, result);
    return result;
}

function permuteR(nums: number[], ind: number, result: number[][]): void {
    if (ind === nums.length) {
        result.push([...nums]); // copy of current permutation
    } else {
        for (let i = ind; i < nums.length; i++) {
            [nums[ind], nums[i]] = [nums[i], nums[ind]];
            permuteR(nums, ind + 1, result);
            [nums[ind], nums[i]] = [nums[i], nums[ind]]; // backtrack
        }
    }
}