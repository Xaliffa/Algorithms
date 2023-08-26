// 1. Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
// 2. Считаем, что 1 и 2 значения последовательности равны 1.
// 3. Искать будем по формуле O(n) = O(n-1) + O(n-2), что предполагает использование
// рекурсивного алгоритма.
//  n
//  / \
//  n-1 n-2 -------- 2^1 операций
//  / \ / \
//  n-2 n-3 n-3 n-4 -------- 2^2 операций
//  / \
//  n-3 n-4 -------- 2^3 операций
//  ........ ........
//  n-n-1 n-n-2 -------- 2^(n-1) операций

package Sem1_AlgorithmComplexity;

import java.util.concurrent.atomic.AtomicLong;

public class Task4_Fibonacchi {
    public static void main(String[] args) {
        int posNumber = 42;
        AtomicLong cnt = new AtomicLong(0);
        System.out.println(fibonacchi(posNumber, cnt));
        System.out.println(cnt);
    }

    public static int fibonacchi(int num, AtomicLong count) { // 47-е число уже не поместится в int
        count.incrementAndGet();
        if (num <= 2)
            return 1;
        return fibonacchi(num - 1, count) + fibonacchi(num - 2, count);
    }
}
