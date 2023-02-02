package models;

import interfaces.ICalculator;

public class Calculator implements ICalculator {



    /**
     * add two numbers
     * @param a, b
     */
    @Override
    public float add(float a, float b) {
        float result= a+b;
        return result;
    }

    /**
     * substract two numbers
     * @param a,b
     */
    @Override
    public float subtraction(float a, float b) {
        float result = a-b; 
        return result;
    }

    /**
     * multiply two numbers
     * @param a,b
     */
    @Override
    public float multiplication(float a, float b) {
        float result = a*b;
        return result;
    }

    /**
     * divide two numbers
     * @param a,b
     */
    @Override
    public float division(float a, float b) {
        // TODO Auto-generated method stub
        try{
            float result = a/b;
            return result;
        }catch(Exception e){
            return 0;
        }
        
    }

    @Override
    public void getNextImput() {
        // TODO Auto-generated method stub
        
    }
    
}
