// Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно свойствам линейной сложности,
// количество итераций цикла будет линейно изменяться относительно изменения размера N.

package Sem1_AlgorithmComplexity;

public class Task1_LinearComplexity_2 {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int number = 157;
        int sum = 0;
        for (int i = 1; i <= number; i++, sum += i)
            ;
        long end = System.nanoTime();
        System.out.println(sum - number + " " + (end - start)); //почему-то дублирует последний элемент, поэтому -number
    }
}
