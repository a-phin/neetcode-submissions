class MinStack {

    Stack<Integer> stackOne;
    Stack<Integer> stackTwo;

    public MinStack() {
        stackOne = new Stack<Integer>();
        stackTwo = new Stack<Integer>();
    }
    
    public void push(int val) {
        stackOne.push(val);
        if (stackTwo.empty() || val < stackTwo.peek()) {
            stackTwo.push(val);
        }
    }
    
    public void pop() {
        stackOne.pop();
        if (!stackTwo.empty()) {
            stackTwo.pop();
        }
    }
    
    public int top() {
        return stackOne.peek();
    }
    
    public int getMin() {
        return stackTwo.peek();
    }
}
