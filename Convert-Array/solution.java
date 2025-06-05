class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(num));
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < maxFreq; i++) {
            res.add(new ArrayList<>());
        }

        Map<Integer, Integer> position = new HashMap<>();

        for (int num : nums) {
            int row = position.getOrDefault(num, 0);
            res.get(row).add(num);
            position.put(num, row + 1);
        }

        return res;
    }
}