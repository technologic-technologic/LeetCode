class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteR(nums, ans, 0);
        return ans;
    }

    private void permuteR(int[] nums, List<List<Integer>> aux, int ind) {
        if (ind == nums.length) {
            // Convert array to list and add copy
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            aux.add(temp);
        } else {
            for (int i = ind; i < nums.length; i++) {
                swap(nums, ind, i);
                permuteR(nums, aux, ind + 1);
                swap(nums, ind, i); // backtrack
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}