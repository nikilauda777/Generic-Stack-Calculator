package Semkin_Barkov;

import assignment3_int.Calculator;
import assignment3_int.GenericStack;

import java.util.Arrays;

public class Assignment3 implements Calculator {


    public Assignment3() {
        //empty Constructor
    }


    @Override
    public double calc(String[] input, GenericStack<Double> stack) throws RuntimeException {

        try {
            for (int i = 0; i < input.length; i++) {

                if (input[i].matches("[0-9]{1,13}(\\.[0-9]*)?")) {              // all digits
                    stack.push(Double.parseDouble(input[i]));

                } else {
                    double stnext = stack.lastElement();            // last Element
                    double st = stack.lastElement();                //vorletze Element

                    stack.push(isOperant(input[i], st, stnext));                      //add to stack the sum

                }
            }


        } catch (Exception ex) {         //alle Exceptions werden behandelt
            ex.printStackTrace();
        }


        return stack.lastElement();
    }



    /*** Calculate the sum**/

    public double isOperant(String symbols, double a, double b) {

        double result = 0.0;


        if (symbols.equals("+")) {
            result = a + b;

        } else if (symbols.equals("-")) {
            result = a - b;

        } else if (symbols.equals("*")) {
            result = a * b;

        } else if (symbols.equals("/")) {
            result = a / b;

        }

        return result;
    }


    @Override
    public GenericStack<Double> getArrayStack() {

        return new ConstantArray<>();
    }

    @Override
    public GenericStack<Double> getListStack() {
        return new LinkedList<>();
    }
}
