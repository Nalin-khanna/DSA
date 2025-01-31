class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }
            else{
                map.computeIfPresent(arr[i], (key, oldValue) -> oldValue + 1);
            }
        }
        Set<Integer> s = new HashSet<>();
        for (int x : map.values()){
            s.add(x);
        }

        return s.size() == map.size();

    }
}