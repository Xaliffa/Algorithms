// Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно свойствам линейной сложности,
// количество итераций цикла будет линейно изменяться относительно изменения размера N.

package Sem1_AlgorithmComplexity;

/**
 * Task1_LinearComlexity
 */
public class Task1_LinearComlexity {

    public static void main(String[] args) {
        int myNumber = 157;
        System.out.println("Sum of nums from 1 to " + myNumber + " is: " + sumOfNums(myNumber));
        
    }

    public static int sumOfNums(int maxNum){
        int counter = 0;
        int sum = 0;
        for (int i = 1; i <=maxNum ; i++) {
            sum += i;
            counter ++;
        }
        System.out.println("Number of iterations is: " + counter);
        return sum;

    }
}