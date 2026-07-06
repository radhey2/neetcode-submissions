class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.charAt(0) == ']' || s.charAt(0) == '}' || s.charAt(0) == ')') {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch == ')' && stack.isEmpty()) || (ch == '}' && stack.isEmpty())
                || (ch == ']' && stack.isEmpty())) {
                return false;
            } else if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.size() == 0;
    }
}
