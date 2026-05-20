class Solution {
public:
    string countAndSay(int n) {
        if(n == 1) {
            return "1";
        }
        string s1 = "1";
        for(int i = 2; i <= n; i++) {
            string temp = "";
            int count = 1;
            for(int j = 0; j < s1.size(); j++) {
                if(j + 1 < s1.size() && s1[j] == s1[j + 1]) {
                    count++;
                }
                else {
                    temp = temp + to_string(count) + s1[j];
                    count = 1;
                }
            }
            s1 = temp;
        }
        return s1;
    }
};