class Solution {
public:
    int singleNumber(vector<int>& nums) {
        map <int,int>mp;
        for(int x : nums){
            mp[x]++;
        }
        for(auto y : mp){
            if(y.second == 1) return y.first;
        }
        return -1;
    }
};