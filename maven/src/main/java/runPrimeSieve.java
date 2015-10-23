/**
 * Run the prime sieve code
 * Created by chealey on 10/21/2015.
 * Not my code, this is borrowed from
 * http://introcs.cs.princeton.edu/java/14array/PrimeSieve.java.html
 */
public class runPrimeSieve {
    public static void main(String[] args) {
        //int number = Integer.parseInt(args[0]);
        int number;
        for (int i = 1; i <= 9; i++) {
            number = (int) Math.pow(10, i);
            int result = returnNumOfPrimes(number);
            System.out.println("There are " + result + " primes less than 10^" + i + " = " + (double) result / number);
        }

    }

    private static int returnNumOfPrimes(int number) {
        return countOfPrimesLessThan(number);
    }

    private static int countOfPrimesLessThan(int n) {
        boolean[] isPrime = new boolean[n + 1];
        //isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // mark non-primes <= n using Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {

            // if i is prime, then mark multiples of i as nonprime
            // suffices to consider mutiples i, i+1, ..., n/i
            if (isPrime[i]) {
                for (int j = i; i * j <= n; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        // count primes
        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }
        return primes;
    }
}
