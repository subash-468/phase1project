public class throwand {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 48) {
      throw new ArithmeticException("Access denied - You must be at least 40 years old.");
    }
    else {
      System.out.println("Access granted - You are old enough!");
    }
  }

  public static void main(String[] args) {
    checkage(35); 
  }
}

