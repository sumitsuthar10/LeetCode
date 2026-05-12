class Solution {
public:
    vector<int> separateDigits(vector<int>& nums) {
        int n = nums.size();
        vector <int> result;
        for(int num : nums){
            string s = to_string(num);
            for(char ch : s){
                result.push_back(ch - '0');
            }
        }
    
        return result;
    }
};