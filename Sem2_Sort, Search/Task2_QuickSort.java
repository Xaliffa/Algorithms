// Написать алгоритм quicksort 

public class Task2_QuickSort {
    public static void main(String[] args) {
        int[] array = fillArrayRnd(100, 1, 100);
       // int[] array = new int[] { 4, 12, 8, 59, 17, 3, 0, 54, 87, 61, 24, 85, 12, 65, 34, 74 };
        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
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

}
