public class multiplecatchblocks {
    public static void main(String args[] ) {
       
 try {
            int[] numbers = {5,6,7};
            int result = numbers[7] / 0; 
        } 
catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: ");
        } 
catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: ");
        } 
catch (Exception e) {
            System.out.println("General Exception caught: ");
        }
        System.out.println("Program continues after exception handling.");
    }
}
