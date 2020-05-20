public class Main {
    public static void main(String[] args) {

        System.out.println(calculateSumOfNumbersFrom1To100(0, 100));
        System.out.println(displaySmallestNumber());
        System.out.println(displayMaxDigitFromANumber(93847));
        System.out.println(isPalindrome(24542));
        printPrimesBelowNumber(24);
    }

    public static int calculateSumOfNumbersFrom1To100(int sum, int lastNumber) {

        for (int i = 1; i <= lastNumber; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int displaySmallestNumber() {

        int numbers[] = {20, 6, 15, 80, 38, 12};
        int smallestNumber = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }

    public static int displayMaxDigitFromANumber(int digit) {
        int maxDigit = 9;
        while (digit != 0) {
            int i = digit % 10;

            maxDigit = Math.max(i, maxDigit);
            digit = digit / 10;
        }
        return maxDigit;
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int givenNumber = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return givenNumber == reverse;
    }

    private static void printPrimesBelowNumber(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}







