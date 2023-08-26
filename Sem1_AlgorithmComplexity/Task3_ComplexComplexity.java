// 1. Необходимо написать алгоритм поиска всех доступных комбинаций
// (посчитать количество) для количества кубиков K с количеством граней N.
// 2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
// ограничено (4 кубика, например), либо их количество будет
// динамическим. Выбор за вами.
// 3. Если вы реализуете простой вариант, обращает внимание, что данное
// решение имеет сложность O(n^4), но если количество кубиков сделать
// переменной, то она трансформируется в O(n^k), что будет представлять
// собой экспоненциальную сложность. Для второго решения очевидно, что
// его сложность O(n^k) с самого начала.

package Sem1_AlgorithmComplexity;

import java.util.ArrayList;

public class Task3_ComplexComplexity {
    public static void main(String[] args) {
    //     System.out.println(combinationCounter(6)); МОЯ ВЕРСИЯ - ЭКСПОНЕНЦИАЛЬНАЯ СЛОЖНОСТЬ
    // }

    // public static int combinationCounter(int faceNum) {
    //     int cnt = 0;
    //     for (int i = 1; i <= faceNum; i++) {
    //         for (int j = 1; j <= faceNum; j++) {
    //             for (int k = 1; k <= faceNum; k++) {
    //                 for (int l = 1; l <= faceNum; l++) {
    //                     cnt++;
    //                     System.out.println(i + " -- " + j + " -- " + k + " -- " + l);
    //                 }
    //             }
    //         }
    //     }
    //     return cnt;

// ВЕРСИЯ С СЕМИНАРА

    int numberSides = 6, cnt = 0;
    ArrayList<String> simpleList = new ArrayList<>();
    for (int i1 = 1; i1 <= numberSides; i1++) {
        for (int i2 = 1; i2 <= numberSides; i2++) {
            for (int i3 = 1; i3 <= numberSides; i3++) {
                for (int i4 = 1; i4 <= numberSides; i4++) {
                    simpleList.add(" " + i1 + i2 + i3 + i4);
                    cnt++;
                }
            }
        }
    }
    System.out.println(simpleList);
    System.out.println(cnt);

    }
}
