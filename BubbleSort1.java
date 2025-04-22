public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        long start = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        long end = System.nanoTime();
        System.out.println("Sorted array:");
        for (int value : array) System.out.print(value + " ");
        System.out.println("\nTime: " + (end - start) + " ns");
    }
}