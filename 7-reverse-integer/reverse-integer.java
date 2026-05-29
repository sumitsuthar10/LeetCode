class Solution {
    public int reverse(int x) {
        long rev=0;
        int digit;
        while(x!=0){
            digit = x%10;
            rev = rev * 10 + digit;
            x/=10;
        }
        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){
            return 0;
        }


        return (int)rev;
    }
}