class Solution {
    public int maxScore(String s) {
        int zeros = 0 ;
        int ones = 0 ; 
        int ans = 0; 
        for(int i = 0 ; i<s.length();i++){
            if(s.charAt(i)== '1'){
                ones = ones + 1;
            }
        }
        for(int j = 0 ; j<s.length()-1; j++){
            if(s.charAt(j) == '0'){
                zeros = zeros + 1;
            }
            else if (s.charAt(j)== '1'){
                ones = ones -1 ; 
            }

            if (ans < (zeros + ones)){
            ans = zeros + ones ; 
        }
        }
        
        return ans;
    }
}