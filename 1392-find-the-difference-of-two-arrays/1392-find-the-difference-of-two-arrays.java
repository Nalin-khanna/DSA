class Solution {
    List<Integer> getElementsOnlyInFirstList(int[] nums1 , int[] nums2 ){
        Set onlyin1 = new HashSet<>();
        for(int i : nums1){
            boolean ifexists = false;
            for (int j : nums2){
                if(j == i){
                    ifexists = true ;
                    break ; 
                }
            }
            if(!ifexists){
                onlyin1.add(i);
            }
        }
        return new ArrayList<>(onlyin1);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1 , nums2) , getElementsOnlyInFirstList(nums2 , nums1));
    }
}