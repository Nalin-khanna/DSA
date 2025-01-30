class Solution {
    List<Integer> getElementsOnlyInFirstList(int[] nums1 , int[] nums2 ){
        Set onlyin1 = new HashSet<>();
        Set innums2 = new HashSet<>();
        for(int num : nums2){
            innums2.add(num);
        }
        for(int i : nums1){
            if(!innums2.contains(i)){
                onlyin1.add(i);
            }
        }
        return new ArrayList<>(onlyin1);
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getElementsOnlyInFirstList(nums1 , nums2) , getElementsOnlyInFirstList(nums2 , nums1));
    }
}