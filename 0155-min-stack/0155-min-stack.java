class MinStack {
    List<int[]> data ;
    public MinStack(){
        data = new ArrayList<>();
    }
    public void push(int val){
        if(data.isEmpty()){
            int[] top = {val , val};
            data.add(top);
        }
        else{
            int[] top = data.get(data.size()-1);
            int min = top[1];
            if(val<min){
                min = val ; 
            }
            data.add(new int[]{val,min});
        }
    }
    public void pop(){
        if(data.isEmpty()){
            return ; 
        }
        else{
            data.remove(data.size()-1);
        }
    }
    public int top(){
        int top[] = data.get(data.size()-1);
        return top[0];
    }
    public int getMin(){
        int top[] = data.get(data.size()-1);
        return top[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */