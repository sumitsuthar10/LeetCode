class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies){
        int maxc = 0;
        for(int c : candies){
            if(c>maxc) maxc = c;
        }
        vector<bool>res;
        for(int c : candies){
            if(c+extraCandies>=maxc) res.push_back(true);
            else(res.push_back(false)) ;

        }
    return res;

    }

};