//sorry again for late submission, here is the code




public class BubbleSort<T extends Comparable<T>> {

    public void sort(T[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
          
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static void main(String[] args) {
   
        Integer[] intArray = {5, 2, 9, 1, 5, 6};
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        bubbleSort.sort(intArray);

        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}
