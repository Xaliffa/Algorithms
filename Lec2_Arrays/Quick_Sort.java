public class Quick_Sort {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 5, 8, 1, 9, 0, 2, 3, 3, 6, 8, 5 };
        quickSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int[] array, int startPosition, int endPosition){
        int leftPosition = startPosition;
        int rightPosition = endPosition;
        int pivot = array[(startPosition + endPosition)/2];

        do{
            while(array[leftPosition] < pivot){
                leftPosition++;
            }
            while(array[rightPosition] > pivot){
                rightPosition--;
            }
            if(leftPosition <= rightPosition){
                if(leftPosition<rightPosition){
                    int temp = array[leftPosition];
                    array[leftPosition] = array[rightPosition];
                    array[rightPosition] = temp;
                }
                leftPosition++;
                rightPosition--;
            }

        } while (leftPosition <= rightPosition);

        if (leftPosition < endPosition){
            quickSort(array, leftPosition, endPosition);
        }
        if(startPosition < rightPosition){
            quickSort(array, startPosition, rightPosition);
        }
    }
}
