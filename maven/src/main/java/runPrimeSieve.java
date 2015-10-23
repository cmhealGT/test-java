/**
 * Run the prime sieve code
 * Created by chealey on 10/21/2015.
 */
public class runPrimeSieve {
    public static void main(String[] args) {
        //int number = Integer.parseInt(args[0]);
        int number = 100;
        PrimeSieve sieve = new PrimeSieve(number);
        int result = sieve.returnNumOfPrimes(number);
        System.out.println("The number of primes less than " + number + " is " + result);
        number = 800;
        result = sieve.returnNumOfPrimes(800);
        System.out.println("The number of primes less than " + number + " is " + result);
    }
}
