// Написать алгоритм поиска простых чисел (делятся только на себя и на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
// вложенный for, что явно говорит о квадратичной сложности, на этом стоит акцентировать внимание

package Sem1_AlgorithmComplexity;

import java.util.ArrayList;
import java.util.List;

public class Task2_QuadraticComplexity {
    public static void main(String[] args) {
        int myNumber = 1000;
        List<Integer> primeNums = findPrimeNums(myNumber);
        System.out.println("Prime nums from 1 to " + myNumber + " are: " + primeNums);
    }

    public static List<Integer> findPrimeNums(int maxNum) {
        List<Integer> result = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i <= maxNum; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                counter++;
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                result.add(i);
        }
        System.out.println("Number of iterations is: " + counter);
        ;
        return result;
    }
}
