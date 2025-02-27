import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> globallist = new ArrayList<>(); // Global list to store combinations
        backtrack(candidates, target, 0, new ArrayList<>(), 0, globallist);
        return globallist;
    }

    private void backtrack(int[] candidates, int target, int idx, List<Integer> list, int sum, List<List<Integer>> globallist) {
        if (sum == target) {
            globallist.add(new ArrayList<>(list)); // Store a new copy of the list
            return;
        }
        if (sum > target || idx == candidates.length) {
            return;
        }

        // Include current element
        list.add(candidates[idx]);
        backtrack(candidates, target, idx, list, sum + candidates[idx], globallist); // Same idx (can reuse elements)
        list.remove(list.size() - 1); // Remove last element after recursion

        // Exclude current element and move to the next
        backtrack(candidates, target, idx + 1, list, sum, globallist);
    }
}
