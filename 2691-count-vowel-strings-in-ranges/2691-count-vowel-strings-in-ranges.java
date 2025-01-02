class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] Prefixsum = new int[words.length];
        int sum = 0 ; 
        int[] ans = new int[queries.length];
        String vowel = "aeiou";
        for(int i = 0 ; i<words.length; i++){
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length()-1);
            if(vowel.indexOf(first)!=-1 && vowel.indexOf(last)!=-1){
                sum = sum +1 ; 
                 
            }
            Prefixsum[i] = sum ;
        }
        for(int j = 0 ; j<queries.length; j++){

            int[] currentQuery = queries[j];
            ans[j] =
                Prefixsum[currentQuery[1]] -
                (currentQuery[0] == 0 ? 0 : Prefixsum[currentQuery[0] - 1]);
        }
        return ans ;
    }
}