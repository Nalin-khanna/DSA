class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0 ; 
        int max = 0 ; 
        int[] prefixsum = new int[gain.length+1];
        prefixsum[0] = 0 ; 
        for(int i = 0 ; i < gain.length ; i++){
            alt = alt + gain[i];
            prefixsum[i+1] = alt ; 
            if(prefixsum[i+1] > max){
                max = prefixsum[i+1] ; 
            }
        }
        return max ; 
    }
}