public class SimpleExceptionDemo {
    public static void main(String[] args){
        /*
        The method must call safeDivide() at least three times:

        Once with two valid positive integers.
        Once with a denominator of zero.
        Once with another valid set of values, such as a negative numerator. */

        safeDivide(10, 10);
        safeDivide(10, 0);
        safeDivide(9, -3);
    }
    public static void safeDivide(int numerator, int denominator){
        /*Place the division operation inside a try block.
        Divide numerator by denominator.
        Print the result when the division is successful.
        Catch an ArithmeticException when the denominator is zero.
        Print a clear error message when division by zero occurs.
        Use a finally block to print:
        Division operation is complete.

        The message in the finally block must appear whether the division succeeds or fails. */
        try {
            System.out.println("Attempting to divide " + numerator + " by " + denominator);
            int sum = numerator/denominator;
            System.out.println("Result: " + sum);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0.");
        } finally {
            System.out.println("Division operation is complete.");
        }
    }
}
