// Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N. Согласно свойствам линейной сложности,
// количество итераций цикла будет линейно изменяться относительно изменения размера N.

package Sem1_AlgorithmComplexity;

public class Task1_ConstantComplexity {

    public static void main(String[] args) {
        int number = 157;
        System.out.println((number + 1) * number / 2); // формула арифметической прогрессии
    }
}
