class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> counts = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int key : counts.keySet()) {
            if (counts.get(key) > nums.length / 3) {
                result.add(key);
            }
        }
        return result;
    }
}