class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< arr.length ; i++){
            set.add(arr[i]);
        }
        Set<Integer> occurs = new HashSet<>();
        for(int j : set){
            int count = 0 ; 
            for(int k =0 ; k<arr.length ; k++){
                if(j == arr[k]){
                    count++; 
                }
            }
            occurs.add(count);
        }
        if(set.size() == occurs.size()){
            return true;
        }
        else{
            return false ;
        }
    }
}