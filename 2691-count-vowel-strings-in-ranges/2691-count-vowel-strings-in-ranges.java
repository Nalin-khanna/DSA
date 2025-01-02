class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        String vowels = "aeiou";
        int[] ans = new int[queries.length];
        int[] temp = new int [words.length];
        for (int k =0 ; k<words.length; k++){
            char first = words[k].charAt(0);
            char last = words[k].charAt(words[k].length() -1);
            if(vowels.indexOf(first)!=-1 && vowels.indexOf(last)!=-1){
                temp[k] = 1;
            }
            else{
                temp[k] = 0 ; 
            }
        }
        for(int i = 0 ; i<queries.length;i++){
            int count = 0 ; 
            
            for(int j = queries[i][0]; j<=queries[i][1];j++){
                count = count + temp[j];
            }
            ans[i] = count ; 
        }
        return ans ; 
    }
}