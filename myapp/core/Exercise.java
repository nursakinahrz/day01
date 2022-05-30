package myapp.core;

import java.io.Console;

public class Exercise {

    public static void main(String[] args) {
        Console cons = System.console();

        //Read the inputs from the users
        //operand0

        String opnd0 = cons.readLine("operand0").trim();

        String opnd1 = cons.readLine("operand1").trim();

        String operator = cons.readLine("Operator; one of add, sub, div, mul: ").trim();

        Integer val0 = Integer.parseInt(opnd0);
        Integer val1 = Integer.parseInt(opnd1);
        Float result = 0f; //float

        //perform calculation
        switch (operator) {
            case "add":
            result = (float)(val0 + val1);
            break;

            case "sub":
            result = (float)(val0 - val1);
            break;

            case "mul":
            result = (float)(val0 * val1);
            break;

            case "div":
            result = (float)(val0 / val1);
            break;

            default:

            System.out.printf("Results: %d %s %d = %.3f", val0, operator, val1, result);
        }
        



        










    }
}