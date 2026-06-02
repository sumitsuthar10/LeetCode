class Solution {
    public String reverseStr(String s, int k) {
        char[] sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i += 2 * k) {
            int start = i;

            int end = Math.min(i + k - 1, sChars.length - 1);
            
            while (start < end) {
                char temp = sChars[start];
                sChars[start] = sChars[end];
                sChars[end] = temp;
                start++;
                end--;
            }
        }
        return new String(sChars);
    }
}