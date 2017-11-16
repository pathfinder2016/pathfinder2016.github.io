package week_002_stack_calculator;

public class Calculator {
    public static int calculate(int a, String operator, int b){
        if(operator.equals(Operator.ADD)){
            return a+b;
        }
        if(operator.equals(Operator.SUBSTRACT)){
            return a-b;
        }
        if(operator.equals(Operator.MULTIPLY)){
            return a*b;
        }
        if(operator.equals(Operator.DIVIDE)){
            return a/b;
        }
        return 0;
    }
}