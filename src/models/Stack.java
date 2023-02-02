package models;

import java.util.ArrayList;

import interfaces.IStack;

public class Stack<T> implements IStack<T> {
    private ArrayList<T> numbers = new ArrayList<T>();
    int position=-1;

    
    /**
     * set number in arraylist
     * @param item
     */
    @Override
    public void push(T item) {
        // TODO Auto-generated method stub
        numbers.add(item);
        position++;
    }

    /**
     * get and remove the last item of arraylist
     */
    @Override
    public T pop() {
        // TODO Auto-generated method stub
        T a = numbers.get(position);
        numbers.remove(position);
        position--;
        return a;
    }


    /**
     * get the last item in arraylist
     */
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
