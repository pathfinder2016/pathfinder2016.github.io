package week_002_stack_calculator;

import data_structure.Stack;
import exception.StackEmptyException;

public class MatchBracket {

    private Stack stack;

    public MatchBracket(Stack stack) {
        this.stack = stack;
    }

    public boolean isMatchBracket(String expression) throws StackEmptyException {
        char[] buf = expression.toCharArray();
        int result = 0;
        for(int i=0; i<buf.length; i++){
            String data = String.valueOf(buf[i]);
            if("(".equals(data) || "[".equals(data) || "{".equals(data) ){ //all the left parentthesis need push to stack.
                stack.push(data);
            }else if(")".equals(data)){
                if(stack.getTop().equals("(")){
                    stack.pop();
                }else{
                    System.out.println("Unmatch ( ");
                    return false;
                }
            }else if("]".equals(data)){
                if(stack.getTop().equals("[")){
                    stack.pop();
                }else{
                    System.out.println("Unmatch [ ");
                    return false;
                }
            }else if("}".equals(data)){
                if(stack.getTop().equals("{")){
                    stack.pop();
                }else{
                    System.out.println("Unmatch {");
                    return false;
                }
            }
        }
        return true;
    }
}
