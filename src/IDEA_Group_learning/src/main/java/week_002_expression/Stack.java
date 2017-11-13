package week_002_expression;

public class Stack {
    private int[] data;
    private int size;
    private int top = 0;

    public Stack(int size){
        this.size = size;
        this.data = new int[size];
    }

    public void push(int num){
        if(top < size){
            this.data[top++] = num;
        }
    }

    public int pop(){
        if(top > 0){
            return this.data[--top];
        }else{
            return -1;
        }
    }

    public int getTop(){
        if(top > 0){
            return this.data[top - 1];
        }else{
            return -1;
        }
    }

    public boolean isEmpty(){
        return top == 0;
    }
}
