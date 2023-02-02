package models;

import java.util.ArrayList;

import interfaces.IStack;

public class Stack<T> implements IStack<T> {
    private ArrayList<T> numbers = new ArrayList<T>();
    int position=-1;
    @Override
    public void push(T item) {
        // TODO Auto-generated method stub
        numbers.add(item);
        position++;
    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub
        T a = numbers.get(position);
        numbers.remove(position);
        position--;
        return a;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return numbers.get(position);
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    

}
