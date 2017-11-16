package week_002_stack_calculator;

import java.util.HashMap;

public class Operator {

    public final static String ADD = "+";
    public final static String SUBSTRACT = "-";
    public final static String MULTIPLY = "*";
    public final static String DIVIDE = "/";
    public final static String LEFT_PARENTHESIS = "(";
    public final static String RIGHT_PARENTHESIS = ")";

    public static HashMap<String, Integer> getOperators(){
        HashMap<String, Integer> operators = new HashMap<>();
        operators.put(Operator.ADD, 2);
        operators.put(Operator.SUBSTRACT, 2);
        operators.put(Operator.MULTIPLY, 3);
        operators.put(Operator.DIVIDE, 3);
        return operators;
    }

    public static HashMap<String, Integer> getBrackets(){
        HashMap<String, Integer> operators = new HashMap<>();
        operators.put(Operator.LEFT_PARENTHESIS, 4);
        operators.put(Operator.RIGHT_PARENTHESIS, 1);
        return operators;
    }
}