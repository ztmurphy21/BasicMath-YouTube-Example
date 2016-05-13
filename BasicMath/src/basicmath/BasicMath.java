
package basicmath;
import java.util.Scanner; //import for scanner object

/**
 *
 * @author Zachary Murphy
 */
public class BasicMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables that user will input
        int numberOne;
        int numberTwo;
        
        //scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //user input
        System.out.println("Enter in the first number.");
        numberOne = keyboard.nextInt();
        
        //user input
        System.out.println("Enter in the second number.");
        numberTwo = keyboard.nextInt();
        
        //processing
        int addResult = numberOne + numberTwo;
        int subResult = numberOne - numberTwo;
        int multResult = numberOne * numberTwo;
        int divideResult = numberOne / numberTwo;
        
        //output
        System.out.println("Math results of numbers entered.");
        System.out.println("Addition Result: " + addResult);
        System.out.println("Subtraction Result: "+ subResult);
        System.out.println("Multiplication Result: " + multResult);
        System.out.println("Division Result: " + divideResult);
        
        
    }
    
}
