public class trycatch{
    public static void main(String[] args) {
        try {
            int dividend = 20;
            int divisor = 0;
            int result = dividend / divisor; 
            System.out.println("Result: " + result);
        } 
	catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: ");
        }

        System.out.println("Program continues after the exception handling.");
    }
}

