public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 10:");
        for (int i = 2; i <= 10; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false; // If divisible, not prime
        }
        return true;
    }
}
