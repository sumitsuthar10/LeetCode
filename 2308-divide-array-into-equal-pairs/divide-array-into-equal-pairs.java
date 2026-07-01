class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2==1){
            return false;
        }

        int[] counts = new int[501];

        for(int num:nums){
            counts[num]++;
        }

        for(int count:counts){
            if(count%2!=0){
                return false;
            }
        }

        return true;


    }
}