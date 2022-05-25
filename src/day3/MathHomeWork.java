package day3;

public class MathHomeWork {

    public static void main(String[] args) {
        // Declaration of values

        int a = 10;
        int b = 20;
        double c = 200.52;
        int d = 2;
        int e = 4;
        double f = 10.01;
        int randomNumber = (int) (Math.random() * 100);

        // Math functons

        Math.max(a, b); // provides Maximum value
        Math.min(a, b); // provides Minimum value
        Math.sqrt(b); // calculates square root
        Math.abs(c); // provides the absolute value in positive
        Math.random(); // provides random value
        Math.pow(d, e); // provides d to the power of e
        Math.round(c); // provides the rounded value of c
        Math.nextUp(c); // Provided the floating point number adjacent to c in the direction of positive infinity
        Math.floor(f); // Provides largest integer value which is less tha or equal to the argument
        Math.ceil(f); // Provides the smallest integer value that is more than or equal to the argument

        // printouts

        System.out.println("The Maximum value between two numbers is " + Math.max(a, b));
        System.out.println("The minimum numbers between two numbers is " + Math.min(a, b));
        System.out.println("The Square Root of " + b + " is " + (float) Math.sqrt(b));
        System.out.println("The absolute value of " + c + " is " + (int) Math.abs(c));
        System.out.println("The Random number between 1 and 100 as calculated is " + randomNumber);
        System.out.println(d + " to the power " + e + " is " + (int) Math.pow(d, e));
        System.out.println("The rounded value of " + c + " is " + Math.round(c));
        System.out.println("The number that is higher than " + f + " is " + Math.nextUp(f));
        System.out.println("The number immediately smaller than " + f + " is " + Math.floor(f));
        System.out.println("The number that is immediately greater than " + f + " is " + Math.ceil(f));


    }

}
