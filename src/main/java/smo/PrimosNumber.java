package smo;

import java.util.Arrays;
import java.util.LinkedList;

public class PrimosNumber {

    public static boolean isPrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

    public static int sieveOfSundaram(int n) {
        sieveOfSundaramArray(n).forEach(p-> System.out.print(p + " "));
        return -1;
    }

    public static int getPrimoOnPositionInRangeZeroToMil(int n) {
        LinkedList<Integer> primos = sieveOfSundaramArray(1000);
        if (primos.size() > n && n < 0){
            return -1;
        }
        return primos.get(n);
    }

    public static LinkedList<Integer> sieveOfSundaramArray(int n) {

        LinkedList retorno = new LinkedList();

        // In general Sieve of Sundaram, produces
        // primes smaller than (2*x + 2) for a number
        // given number x. Since we want primes
        // smaller than n, we reduce n to half
        int nNew = (n - 1) / 2;

        // This array is used to separate numbers of the
        // form i+j+2ij from others where 1 <= i <= j
        boolean marked[] = new boolean[nNew + 1];

        // Initialize all elements as not marked
        Arrays.fill(marked, false);

        // Main logic of Sundaram. Mark all numbers of the
        // form i + j + 2ij as true where 1 <= i <= j
        for (int i = 1; i <= nNew; i++) {
            for (int j = i; (i + j + 2 * i * j) <= nNew; j++) {
                marked[i + j + 2 * i * j] = true;
            }
        }

        // Since 2 is a prime number
        if (n > 2) {
            retorno.add(2);
        }

        // Print other primes. Remaining primes are of
        // the form 2*i + 1 such that marked[i] is false.
        for (int i = 1; i <= nNew; i++) {
            if (marked[i] == false) {
                retorno.add(2 * i + 1);
            }
        }
        return retorno;
    }

}
