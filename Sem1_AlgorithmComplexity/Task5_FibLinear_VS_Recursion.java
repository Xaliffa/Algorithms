// 1.Пишем алгоритм поиска нужного числа последовательности Фибоначчи, но в этот раз
// откажемся от рекурсии и воспользуемся обычным алгоритмом, что даст нам
// линейную сложность, т.к. вычисление каждого из чисел последовательности будет
// происходить ровно 1 раз.
// 2.Вариантов решения может быть несколько, но нужно предложить студентам считать
// последовательность с первого числа и далее до тех пор, пока не доберемся до
// нужного номера. При этом значение предыдущих элементов нужно сохранять, чтобы
// не приходилось вычислять заново, как это происходило при рекурсивном методе.
package Sem1_AlgorithmComplexity;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Task5_FibLinear
 */
public class Task5_FibLinear_VS_Recursion {

    public static void main(String[] args) {
        // MY VERSION
        // int posNumber = 47;
        // int[]myFibArray = fibonacchi(posNumber);
        // for (int i = 0; i < posNumber; i++) {
        // System.out.println(myFibArray[i]);
        // }
        // }

        // public static int[] fibonacchi(int positionNum) {
        // int[] fibArray = new int[positionNum];
        // fibArray[0] = fibArray[1] = 1;

        // for (int i = 2; i < fibArray.length; i++) {
        // fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        // }
        // return fibArray;

        // WORKSHOP VERSION
        int posNumber = 40;
        long start = System.currentTimeMillis();
        AtomicLong cnt = new AtomicLong(0);
        System.out.println(fibLinear(posNumber, cnt));
        long time = System.currentTimeMillis() - start;
        System.out.println("If linear complexity: " + cnt + ", " + time);

        start = System.currentTimeMillis();
        cnt = new AtomicLong(0); // просто обнулили все
        System.out.println(fibonacchi(posNumber, cnt));
        time = System.currentTimeMillis() - start;
        System.out.println("If exponential complexity: " + cnt + ", " + time);
    }

    public static int fibLinear(int number, AtomicLong count) {
        if (number <= 2)
            return 1;
        int f1 = 1, f2 = 1;
        int f3 = f1 + f2;
        while (number-- > 3) {
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
            count.incrementAndGet();
        }
        return f3;
    }

    public static int fibonacchi(int num, AtomicLong count) { // 47-е число уже не поместится в int
        count.incrementAndGet();
        if (num <= 2)
            return 1;
        return fibonacchi(num - 1, count) + fibonacchi(num - 2, count);
    }

}