class Solution {
    public int maxScore(String s) {
        int count = 0 ;
        for(int i =1 ; i<s.length();i++){
            String ls = s.substring(0,i);
            String rs = s.substring(i);
            int lcount = 0 ;
            int rcount = 0 ;
            for(int j =0 ; j<ls.length();j++){
                if(ls.charAt(j) == '0'){
                    lcount = lcount +1;
                }
            }
            for(int k =0 ; k<rs.length();k++){
                if(rs.charAt(k) == '1'){
                    rcount = rcount +1;
                }
            }
            if (count <= lcount+rcount){
                count = lcount+rcount;
            }
        }
        return count ;
    }
}