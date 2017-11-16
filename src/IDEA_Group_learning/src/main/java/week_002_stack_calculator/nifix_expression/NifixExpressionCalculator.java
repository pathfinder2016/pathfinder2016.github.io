package week_002_stack_calculator.nifix_expression;

import data_structure.Stack;
import exception.StackEmptyException;
import week_002_stack_calculator.Calculator;
import week_002_stack_calculator.Operator;

import java.util.HashMap;

public class NifixExpressionCalculator {

    private HashMap<String, Integer> operations;
    private Stack<String> operationStack = new Stack(30);
    private Stack<Integer> numberStack = new Stack(30);

    public NifixExpressionCalculator() {

    }

    public int calculate(String expression) throws StackEmptyException {
        initOperations();

        String[] expressionList = expression.split(" ");
        for(int i=0; i<expressionList.length; i++){
            String str = expressionList[i];

            if(!operations.containsKey(str)){
                numberStack.push(Integer.valueOf(str));
            }else{
                if(operationStack.isEmpty()){
                    operationStack.push(str);
                }else{ //判断优先级问题
                    String topOp = operationStack.getTop();
                    if(operations.get(str).compareTo(operations.get(topOp)) >= 1){
                        operationStack.push(str);
                    }else{
                        if(!operationStack.getTop().equals("(")){
                            topOp = operationStack.pop();

                            int numB = numberStack.pop();
                            int numA = numberStack.pop();
                            int result = Calculator.calculate(numA, topOp, numB);
                            numberStack.push(result);
                            if(str.equals(")")){
                                operationStack.pop();
                            }else{
                                operationStack.push(str);
                            }

                        }else{
                            operationStack.push(str);
                        }
                    }

                }
            }

        }

        while (!operationStack.isEmpty()){
            String topOp = operationStack.pop();
            int numA = numberStack.pop();
            int numB = numberStack.pop();
            int result = Calculator.calculate(numA, topOp, numB);
            numberStack.push(result);
        }

        return numberStack.getTop();
    }

    private void initOperations() {
        operations = Operator.getOperators();
        operations.putAll(Operator.getBrackets());
    }


}