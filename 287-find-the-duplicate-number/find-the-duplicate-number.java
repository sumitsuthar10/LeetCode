class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        int duplicate = -1;

        for(int num:nums){
            if(set.contains(num)){
                duplicate = num;
            }
            set.add(num);
        }

        return duplicate;
    }
}