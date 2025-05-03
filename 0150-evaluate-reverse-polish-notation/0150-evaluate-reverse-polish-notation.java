class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (token.matches("-?\\d+")) {
                stack.push(token);
            } else {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(operate(b, a, token)));
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private int operate(int a, int b, String operate) {
        if (operate.equals("+")) return a + b;
        if (operate.equals("-")) return a - b;
        if (operate.equals("*")) return a * b;
        if (operate.equals("/")) return a / b;
        return 0;
    }
}