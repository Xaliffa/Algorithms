// 1. Необходимо написать алгоритм поиска всех доступных комбинаций
// (посчитать количество) для количества кубиков K с количеством граней N.
// 2. У вас есть 2 варианта на выбор – количество кубиков может быть строго
// ограничено (4 кубика, например), либо их количество будет
// динамическим. Выбор за вами.
// 3. Если вы реализуете простой вариант, обращает внимание, что данное
// решение имеет сложность O(n4), но если количество кубиков сделать
// переменной, то она трансформируется в O(nk), что будет представлять
// собой экспоненциальную сложность. Для второго решения очевидно, что
// его сложность O(nk) с самого начала.

package Sem1_AlgorithmComplexity;

public class Task3_ComplexComolexity {
    public static void main(String[] args) {
        System.out.println(combinationCounter(5));
    }

    public static int combinationCounter(int faceNum) {
        int cnt = 0;
        for (int i = 1; i <= faceNum; i++) {
            for (int j = 1; j <= faceNum; j++) {
                for (int k = 1; k <= faceNum; k++) {
                    for (int l = 1; l <= faceNum; l++) {
                        cnt++;
                        System.out.println(i + " -- " + j + " -- " + k + " -- " + l);
                    }
                }
            }
        }
        return cnt;
    }
}
