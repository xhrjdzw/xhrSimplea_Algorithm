package offer2_QuickSort;

/**
 * 快排
 *
 * @author 徐浩然
 * @version QuickSort, 2017-10-16
 */
public class QuickSort
{
    /**
     * 测试
     */
    public static void main(String[] args)
    {
        int[] arg = new int[]{5, 2, 1, 9, 0, 3, 4, 6};
        QuickSort(arg);

        System.out.println(printArray(arg));
    }

    private static int partition(int[] arr, int start, int end)
    {

        //i 数组头   j 数组尾
        int i = start + 1, j = end;
        //主元数据
        int key = arr[start];
        //如果首尾没有相遇则继续循环
        while (i < j)
        {
            //i 从左到右边扫 知道碰到一个比主元素大的数
            while (arr[i] <= key && i < end)
            {
                i++;
            }
            //j 反之
            while (arr[j] >= key && j > start)
            {
                j--;
            }
            //当i j停下的时候 需要交换
            if (i < j)
            {
                swap(arr, i, j);
            }
        }
        swap(arr, start, j);
        System.out.println("某一趟排序结果:" + printArray(arr));
        //返回新的主元下标
        return j;

    }

    public static void QuickSort(int[] arr)
    {
        QuickSort(arr, 0, arr.length - 1);
    }

    private static void QuickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            //获取主元
            int key = partition(arr, start, end);

            QuickSort(arr, start, key - 1);

            QuickSort(arr, key + 1, end);
        }
    }

    private static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static String printArray(int[] arr)
    {
        StringBuilder bc = new StringBuilder();

        for (int i = 0; i < arr.length; i++)
        {
            bc.append(arr[i]);
        }
        return bc.toString();
    }


}