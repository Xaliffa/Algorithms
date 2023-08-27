// 1.Пишем тесты для сравнения производительности сортировки больших массивов.
// 2.Для наглядного результата стоит сравнивать массивы до 100 000 элементов.
// При таком подходе будет явно видно, какая из сортировок окажется быстрее.

public class Task3_SpeedTest {
    public static void main(String[] args) {
        int size = 100000;
        
        int[] rndArray = fillArrayRnd(size, 1, 1000);
        long start = System.currentTimeMillis();
        quickSort(rndArray, 0, rndArray.length - 1);
        long time = System.currentTimeMillis() - start;
        System.out.println("Quicksort time is: " + time);

        int[] rndArray2 = fillArrayRnd(size, 1, 1000);
        long start2 = System.currentTimeMillis();
        insertSort(rndArray2);
        long time2 = System.currentTimeMillis() - start2;
        System.out.println("Insertsort time is: " + time2);

        int[] rndArray3 = fillArrayRnd(size, 1, 1000);
        long start3 = System.currentTimeMillis();
        bubbleSort(rndArray3);
        long time3 = System.currentTimeMillis() - start3;
        System.out.println("Bubblesort time is: " + time3);

    }

    public static int[] fillArrayRnd(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    public static void quickSort(int[] array, int startPosIndex, int endPosIndex) {
        int leftPosIndex = startPosIndex;
        int rightPosIndex = endPosIndex;
        int pivot = array[startPosIndex + (endPosIndex - startPosIndex) / 2];

        do {
            while (array[leftPosIndex] < pivot)
                leftPosIndex++;
            while (array[rightPosIndex] > pivot)
                rightPosIndex--;

            if (leftPosIndex <= rightPosIndex) {
                if (leftPosIndex < rightPosIndex) {
                    int temp = array[leftPosIndex];
                    array[leftPosIndex] = array[rightPosIndex];
                    array[rightPosIndex] = temp;
                }
                leftPosIndex++;
                rightPosIndex--;
            }
        } while (leftPosIndex <= rightPosIndex);

        if (leftPosIndex < endPosIndex) {
            quickSort(array, leftPosIndex, endPosIndex);
        }

        if (rightPosIndex > startPosIndex) {
            quickSort(array, startPosIndex, rightPosIndex);
        }
    }

    public static void insertSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        boolean finish;
        do {
            finish = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    finish = false;
                }
            }
        } while (!finish);
    }
}
