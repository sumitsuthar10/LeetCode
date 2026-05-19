class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int org=x,remainder;
        long long y = 0;
        while(x!=0){
            remainder = x%10;
            y = y*10+remainder;
            x/=10;
        }
        return org==y;
    }
};