class MinStack {
    static Stack<Integer> source;
    static Stack<Integer> minStack;

    public MinStack() {
        source = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        source.push(val);
        if(minStack.isEmpty() || val<= minStack.peek()){
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(source.isEmpty()){
            return;
        }
        int ele = source.pop();
        if(ele == minStack.peek()){
            minStack.pop();
        }

    }
    
    public int top() {
        if(!source.isEmpty()){
            return source.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
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