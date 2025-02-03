class Solution {
    List<Integer> getElementsOnlyInFirstList(int[] nums1 , int[] nums2){
        Set<Integer> onlyinnums1 = new HashSet<>();
        Set<Integer> nums2set = new HashSet<>();
        for(int i = 0 ; i<nums2.length; i++){
            nums2set.add(nums2[i]);
        }
        for(int j = 0 ; j<nums1.length ; j++){
            if(!nums2set.contains(nums1[j])){
                onlyinnums1.add(nums1[j]);
            }
        }
        return new ArrayList<> (onlyinnums1) ;
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1 , nums2) , getElementsOnlyInFirstList(nums2 , nums1));
    }
}