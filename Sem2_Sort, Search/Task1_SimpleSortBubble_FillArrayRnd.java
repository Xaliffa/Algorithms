// 1.Необходимо написать один из простых алгоритмов сортировки, имеющий сложность O(n^2).
// 2.Можно выбрать из пузырьковой сортировки, сортировки вставками и сортировки выбором.
// 3.Следует обратить внимание на сложность данных алгоритмов и
// указать признаки квадратичной сложности для каждого из них.

import java.util.Random;

public class Task1_SimpleSortBubble_FillArrayRnd {

    public static void main(String[] args) {

        int[] rndArray = fillArrayRnd(1000, 1, 100);
        for (int i = 0; i < rndArray.length; i++) {
            System.out.print(rndArray[i] + " ");
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------");

        long start = System.currentTimeMillis();
        bubbleSort(rndArray);
        long time = System.currentTimeMillis() - start;
        for (int i = 0; i < rndArray.length; i++) {
            System.out.print(rndArray[i] + " ");
        }
        System.out.println(
                "-----------------------------------------------------------------------------------------------");

        System.out.println("Time is: " + time);

    }

    public static int[] fillArrayRnd(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    // ЕЩЁ ВАРИАНТ РАНДОМНОГО ЗАПОЛНЕНИЯ, НЕ ТЕСТИРОВАЛА

    // public static void fillArrayRandom(int[] array, int bound){
    //     Random r = new Random();
    //     for (int i = 0; i < array.length; i++) {
    //         array[i] = r.nextInt(bound);
    //     }
    // }

    public static void bubbleSort(int[] array) {
        boolean finish;
        int cnt = 0;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
                cnt++;
            }

        } while (!finish);
        System.out.println("Cnt: " + cnt);
    }
}