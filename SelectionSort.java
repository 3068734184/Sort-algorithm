public class SelectionSort {

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // 找到未排序序列中最小元素的索引
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // 将最小元素与未排序序列的第一个元素交换
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 4};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
