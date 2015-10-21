/**
 * Run the prime sieve code
 * Created by chealey on 10/21/2015.
 */
public class runPrimeSieve {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        PrimeSieve sieve = new PrimeSieve(number);
        int result = sieve.returnNumOfPrimes();
        System.out.println("The number of primes <= " + number + " is " + result);
    }
}
