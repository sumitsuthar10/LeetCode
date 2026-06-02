class Solution {
    public boolean checkRecord(String s) {
        char[] sChars = s.toCharArray();
        int countAbsent = 0;
        int countLate = 0;

        for(int i = 0;i<sChars.length;i++){
            if(sChars[i]=='A'){
                countAbsent++;
                countLate = 0;   
            } else if(sChars[i]=='L'){
                countLate++;
                if(countLate >=3){
                    return false;
                }
            }else{
                    countLate = 0;
                }
        } 
        return countAbsent < 2;
    }
}