package week_002_stack_calculator;

import exception.StackEmptyException;

public class PostfixExpressionCalculator {
    private String[] expression;
    private Stack<Integer> stack;

    public PostfixExpressionCalculator(String expression) {
        this.expression = expression.split(" ");
        stack = new Stack<Integer>(expression.length());
    }

    public int calculator() throws StackEmptyException {
        for (int i = 0; i < expression.length; i++) {
            if(Integer.valueOf(expression[i]) instanceof Integer){
                stack.push(Integer.valueOf((expression[i])));
            }else{
                int a = stack.pop();
                int b = stack.pop();

            }
        }
        return 0;
    }

    public int calculator(int a, String operator, int b){
        if(operator.equals("+")){
            return a+b;
        }
        if(operator.equals("-")){
            return a-b;
        }
        if(operator.equals("*")){
            return a*b;
        }
        return a/b;
    }
}
