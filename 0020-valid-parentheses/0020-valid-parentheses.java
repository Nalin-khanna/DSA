class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        if(s.length() == 1 ){
            return false ;
        }
        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)=='('|| s.charAt(i)=='['|| s.charAt(i)=='{'){
                stck.push(s.charAt(i));
            }
            else{
                if (stck.isEmpty()) {
                    return false;
                }
                if(stck.peek()=='('&&s.charAt(i)==')'){
                    stck.pop();
                }
                else if(stck.peek()=='['&&s.charAt(i)==']'){
                    stck.pop();
                }
                else if(stck.peek()=='{'&&s.charAt(i)=='}'){
                    stck.pop();
                }
                else {
                    return false; 
                }
            }
        }
        return stck.isEmpty() ;
    }
}