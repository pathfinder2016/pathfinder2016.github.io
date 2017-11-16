package week_002_stack_calculator;

import data_structure.Stack;
import exception.StackEmptyException;

import java.util.ArrayList;
import java.util.List;

public class PostfixExpressionCalculator {
    private String[] expression;
    private Stack<Integer> stack;
    private List<String> operators;

    public PostfixExpressionCalculator(String expression) {
        this.expression = expression.split(" ");
        stack = new Stack<Integer>(expression.length());
    }

    public int calculator() throws StackEmptyException {
        init();
        int result = 0;
        for (int i = 0; i < expression.length; i++) {
            if(!operators.contains(expression[i])){
                stack.push(Integer.valueOf((expression[i])));
            }else{
                int a = stack.pop();
                int b = stack.pop();
                result = Calculator.calculate(a, expression[i], b);
                stack.push(result);
            }
        }
        return result;
    }

    private void init() {
        operators = new ArrayList<String>();
        operators.add(Operator.ADD);
        operators.add(Operator.SUBSTRACT);
        operators.add(Operator.MULTIPLY);
        operators.add(Operator.DIVIDE);
    }


}
