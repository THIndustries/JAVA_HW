package home_work_003;

public class ex03 {
    //Дополнительно. Реализовать алгоритм сортировки слиянием.
    public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }

    public static void merge(int[] array, int leftIndex, int middleIndex, int rightIndex) {
        int[] leftArray = new int[middleIndex - leftIndex + 1];
        int[] rightArray = new int[rightIndex - middleIndex];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[leftIndex + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[middleIndex + 1 + i];
        }

        int leftArrayIndex = 0;
        int rightArrayIndex = 0;
        int mergedArrayIndex = leftIndex;

        while (leftArrayIndex < leftArray.length && rightArrayIndex < rightArray.length) {
            if (leftArray[leftArrayIndex] <= rightArray[rightArrayIndex]) {
                array[mergedArrayIndex] = leftArray[leftArrayIndex];
                leftArrayIndex++;
            } else {
                array[mergedArrayIndex] = rightArray[rightArrayIndex];
                rightArrayIndex++;
            }
            mergedArrayIndex++;
        }

        while (leftArrayIndex < leftArray.length) {
            array[mergedArrayIndex] = leftArray[leftArrayIndex];
            leftArrayIndex++;
            mergedArrayIndex++;
        }

        while (rightArrayIndex < rightArray.length) {
            array[mergedArrayIndex] = rightArray[rightArrayIndex];
            rightArrayIndex++;
            mergedArrayIndex++;
        }
    }

    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };
        mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

