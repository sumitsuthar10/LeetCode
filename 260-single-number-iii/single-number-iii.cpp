class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        map<int,int>mp;
        for(int x:nums){
            mp[x]++;
        }
        vector <int> temp;
        for(auto y : mp){
            if(y.second==1) temp.push_back(y.first);
        }
        return temp;
    }
};