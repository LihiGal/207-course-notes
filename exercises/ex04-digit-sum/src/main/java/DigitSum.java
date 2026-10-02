/**
 * Exercise (Chapter 1: Introduction to Java) — while loops and integer
 * arithmetic.
 *
 * Complete {@link #digitSum(int)} below using a while loop.
 *
 * Relevant reading: 1.8.3. while Loops (and 1.2. Variables and Types).
 */
public class DigitSum {

    public static void main(String[] args) {
        // Should print 15 (1 + 2 + 3 + 4 + 5) once digitSum is implemented.
        System.out.println("digitSum(12345) = " + digitSum(12345));
    }

    /**
     * Returns the sum of the decimal digits of {@code n}. Negative numbers are
     * treated by their absolute value, so {@code digitSum(-123) == 6}.
     *
     * @param n any int
     * @return the sum of its decimal digits
     */
    public static int digitSum(int n) {
        int length = String.valueOf(n).length();
        //make a string of value n, count the length and assign to an int
        int decimal = 0;
        //this will be the return value of te sum of each decimal
        int sumDecimals = 0;
        //this is gonna be the individual digits added
        if (n < 0){
            n = -n;
        }
        int[] isolateDecimals = new int[length];
        isolateDecimals[0] = 1;
        for (int i=1; i < length; i++){
            isolateDecimals[i] = isolateDecimals[i-1] * 10;
        }

        //checks for negatives and makes them positive for the sake of calculation
        int i = length-1;
        while (n!=0 | i>0){
            decimal = n / isolateDecimals[i];
            sumDecimals += decimal;
            n = n - (decimal*isolateDecimals[i]);
            i--;
        }return sumDecimals;

    }

}