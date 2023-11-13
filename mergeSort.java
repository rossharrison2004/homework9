//here is mergesort code, sorry again


import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {

    public void sort(T[] array) {
        if (array.length <= 1) {
            return;
        }

        int mid = array.length / 2;
        T[] left = Arrays.copyOfRange(array, 0, mid);
        T[] right = Arrays.copyOfRange(array, mid, array.length);

        sort(left);
        sort(right);

        merge(array, left, right);
    }

    private void merge(T[] array, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
       
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(intArray);

     
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
