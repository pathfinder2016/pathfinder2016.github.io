package data_structure;

import exception.StackEmptyException;

import java.util.ArrayList;

public class Stack<T> {

    private int size;
    private ArrayList<T> data;
    private int top; //point;

    public Stack(int size) {
        this.size = size;
        data = new ArrayList<T>(size);
    }

    public T getTop() throws StackEmptyException {
        if (top <= 0) {
            throw new StackEmptyException("Empty stack");

        }
        return data.get(top - 1);
    }

    public void push(T value) {
        if (top < size) {
            data.add(top++, value);
        }
    }

    public T pop() throws StackEmptyException {
        if (top <= 0) {
            throw new StackEmptyException("Empty stack");

        }
        return data.get(--top);
    }

    public boolean isEmpty() {
        return top == 0;
    }


}
