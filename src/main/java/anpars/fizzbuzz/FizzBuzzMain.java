package anpars.fizzbuzz;

/**
 *  FizzBuzzMain
 */
public class FizzBuzzMain {
    static final String BUZZ = "buzz";
    static final String FIZZ_BUZZ = "fizzbuzz";
    static final String FIZZ = "fizz";
    static final String YOU_FAILED_TO_FIND_A_MULTIPLE_OF_3_OR_5 = "You failed to find a multiple of 3 or 5!";


    public static void main(String[] args) {
        String result = doFizzBuzz(args[0]);
        System.out.println(result);
    }

    static String doFizzBuzz(String arg) {
        int firstNumber = Integer.parseInt(arg);
        boolean isModulo3 = isaModulo(firstNumber, 3);
        boolean isModulo5 = isaModulo(firstNumber, 5);

        if (isModulo3 && isModulo5) {
            return FIZZ_BUZZ;
        } else if (isModulo5) {
            return BUZZ;
        } else if (isModulo3) {
            return FIZZ;
        } else {
            return YOU_FAILED_TO_FIND_A_MULTIPLE_OF_3_OR_5;
        }
    }

    private static boolean isaModulo(int number, int modulo) {
        return number % modulo == 0;
    }

}
