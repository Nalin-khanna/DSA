import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> globallist = new ArrayList<>();
        fn(candidates , new ArrayList<>() , 0 , 0 , target , globallist);
        return globallist ; 
    }
    private void fn(int[] candidates , List<Integer> list , int index , int sum , int target ,List<List<Integer>> globallist){
        if(sum > target || index == candidates.length){
            return ; 
        }
        if(sum == target){
            globallist.add(new ArrayList<>(list));
            return ;
        }
        list.add(candidates[index]);
        fn(candidates , list , index , sum+candidates[index],target , globallist);
        list.remove(list.size()-1);
        fn(candidates , list , index + 1 , sum , target , globallist);
    }
}
