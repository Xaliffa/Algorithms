public class Task4_SimpleBinarySearch {

    public static void main(String[] args) {
        int[] rndArray = fillArrayRnd(100, 1, 20);
        quickSort(rndArray, 0, rndArray.length - 1);
        for (int i : rndArray) {
        System.out.print(i + " ");
        }
        long start = System.nanoTime();
        int index1 = simpleSearch(rndArray, 14);
        long time = System.nanoTime() - start;
        System.out.println("index1 is: " + index1 + ", simpleSearch time is: " + time);

        long start2 = System.nanoTime();
        int index2 = binarySearch(rndArray, 14);
        long time2 = System.nanoTime() - start2;
        System.out.println("index2 is: " + index2 + ", binarySearch time is: " + time2);
            //находят разные индексы (симпл находит первый, двоичный - разные в существующей последовательности)
    }

    public static int simpleSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    public static int binarySearch(int[] array, int value, int min, int max) {
        int midPoint;
        if (max < min)
            return -1;
        else
            midPoint = (max - min) / 2 + min;

        if (value < array[midPoint])
            return binarySearch(array, value, min, midPoint - 1);

        else {
            if (value > array[midPoint])
                return binarySearch(array, value, midPoint + 1, max);
            else
                return midPoint;
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
