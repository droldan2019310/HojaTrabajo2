import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import models.Calculator;
import models.Stack;

public class App {

    private Stack stack = new Stack<Float>();
    private Calculator calculator = new Calculator();
    public static void main(String[] args) throws Exception {
        App app = new App();
        app.readFile();
    }


    public void readFile(){
        File file = new File("src/assets/file.txt");
        // Note:  Double backquote is to avoid compiler
        // interpret words
        // like \test as \t (ie. as a escape sequence)
 
        // Creating an object of BufferedReader class
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(file));
            // Declaring a string variable
            String st;
            // Condition holds true till
            // there is character in a string
            
            String data = br.readLine();
            String[] splited = data.split("\\s+");


            for (String string : splited) {
                char character = string.charAt(0);
                validateCharacter(character);
            }
            System.out.println("TU RESULTADO ES: "+stack.peek());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println(e);
            System.out.println("ARCHIVO NO ENCONTRADO");
        }
    }


    public void validateCharacter(char character){
        if(Character.isDigit(character)){
            String numString = Character.toString(character);;
            float number = Float.parseFloat(numString);
            stack.push(number);
        }else{
            menuOperations(character);
        }
    }

    public void menuOperations(char operator){
        float a,b,result=0;
        switch(operator){
            case '+':
                a  = (float) stack.pop();
                b  = (float) stack.pop();
                result = calculator.add(a,b);
            break;
            case '-':
                a  = (float) stack.pop();
                b  = (float) stack.pop();
                result = calculator.subtraction(a,b);
            break;
            case '/':
                a  = (float) stack.pop();
                b  = (float) stack.pop();
                result = calculator.division(a,b);
            break;
            case '*':
                a  = (float) stack.pop();
                b  = (float) stack.pop();
                result = calculator.multiplication(a,b);
            break;
            default:
            System.out.println("OPERADOR INVALIDO");
        }
        stack.push(result);
    }


}
