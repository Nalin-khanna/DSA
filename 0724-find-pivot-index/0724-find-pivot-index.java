class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length; 
        int[] prefixsum = new int[n];
        int sum = 0 ;
       
        for(int i = 0 ; i<nums.length ; i++){
            sum = sum + nums[i];
            prefixsum[i] = sum ; 
        }
        for(int j = 0; j<nums.length; j++){
            if(j==0){
                if((prefixsum[nums.length-1]-prefixsum[0])==0){
                    return 0;
                }
            }
            else if(prefixsum[j-1]==prefixsum[n-1]-prefixsum[j]){
                return j;
            }
        }
        return -1;
    }
}