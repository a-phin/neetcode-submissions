class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                int numOne = nums.pop();
                int numTwo = nums.pop();
                int result = 0;
                switch (tokens[i]) {
                    case "+":
                        result = numOne + numTwo;
                        nums.push(result);
                        break;
                    case "-":
                        result = numTwo - numOne;
                        nums.push(result);
                        break;
                    case "*":
                        result = numOne * numTwo;
                        nums.push(result);
                        break;
                    case "/":
                        result = numTwo / numOne;
                        nums.push(result);
                        break;
                    default:
                        break;
                }
            } else {
                nums.push(Integer.parseInt(tokens[i]));
            }
        }
        return nums.peek();
    }
}
