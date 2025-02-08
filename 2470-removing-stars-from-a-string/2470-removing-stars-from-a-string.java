class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c != '*'){
                str.append(c);
            }
            else{
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}

