public class BubbleSort {
    // 定义一个冒泡排序的方法
    public static void bubbleSort(int[] arr) {
        // 获取数组的长度
        int n = arr.length;
        // 外层循环控制排序的趟数，每趟都会将一个最大或最小的元素放到正确的位置
        for (int i = 0; i < n - 1; i++) {
            // 内层循环控制每趟比较和交换的次数，每趟都会减少一个待排序的元素
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于后一个元素，就交换它们的位置
                if (arr[j] > arr[j + 1]) {
                    // 使用一个临时变量来存储当前元素
                    int temp = arr[j];
                    // 将后一个元素赋值给当前元素
                    arr[j] = arr[j + 1];
                    // 将临时变量赋值给后一个元素
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 定义一个主方法来测试冒泡排序
    public static void main(String[] args) {
        // 创建一个待排序的数组
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        // 调用冒泡排序的方法对数组进行排序
        bubbleSort(arr);
        // 打印排序后的数组
        System.out.println("冒泡排序后的数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
