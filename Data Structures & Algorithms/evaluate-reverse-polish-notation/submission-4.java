class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int b = stack.pop(); // top element
                int a = stack.pop(); // next element
                stack.push(a + b);
            } else if (tokens[i].equals("-")) {
                int b = stack.pop(); // top element
                int a = stack.pop(); // next element
                stack.push(a - b);

            } else if (tokens[i].equals("*")) {
                int b = stack.pop(); // top element
                int a = stack.pop(); // next element
                stack.push(a * b);
            } else if (tokens[i].equals("/")) {
                int b = stack.pop(); // top element
                int a = stack.pop(); // next element
                if (b != 0) {
                    stack.push(a / b);
                }

            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }

        return stack.pop();
    }
}
