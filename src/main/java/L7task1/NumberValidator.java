package L7task1;

public class NumberValidator {
    public static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public class DigitSumCalculator {

        public static int calculateDigitSum(int number) {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

    }
}