public class Task1_SimpleSortInsert_Comparison {

    public static void main(String[] args) {

        int[] rndArray = fillArrayRnd(1000, 1, 100);
        // for (int i = 0; i < rndArray.length; i++) {
        //     System.out.print(rndArray[i] + " ");
        // }
        // System.out.println(
        //         "-----------------------------------------------------------------------------------------------");

        // ВЫЗОВ СОРТИРОВКИ ВСТАВКАМИ
        long start = System.currentTimeMillis();
        insertSort(rndArray);
        long time = System.currentTimeMillis() - start;
        // for (int i = 0; i < rndArray.length; i++) {
        //     System.out.print(rndArray[i] + " ");
        // }
        // System.out.println(
        //         "-----------------------------------------------------------------------------------------------");

        System.out.println("Insert time is: " + time);

        // ВЫЗОВ ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        start = System.currentTimeMillis();
        bubbleSort(rndArray);
        time = System.currentTimeMillis() - start;
        // for (int i = 0; i < rndArray.length; i++) {
        //     System.out.print(rndArray[i] + " ");
        // }
        // System.out.println(
        //         "-----------------------------------------------------------------------------------------------");

        System.out.println("Bubble time is: " + time);

    }

    public static int[] fillArrayRnd(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    public static void insertSort(int[] array) {
        int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                cnt++;
            }
        }
        System.out.println("Insert cnt: " + cnt);

    }

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
        System.out.println("Bubble cnt: " + cnt);
    }
}
