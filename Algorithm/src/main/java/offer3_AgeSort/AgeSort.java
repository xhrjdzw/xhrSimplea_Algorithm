package offer3_AgeSort;

/**
 * 对某公司所有员工的年龄进行排序，要求时间复杂度为O(n)
 * @author 徐浩然
 * @version AgeSort, 2017-10-17
 */
public class AgeSort
{
    public static void ageSort(int[] ages){
        int[] countAge = new int[100];
        for (int i = 0; i <ages.length ; i++)
        {
            countAge[ages[i]]++;
        }
        int curIndex = 0;
        for (int i = 0; i <countAge.length ; i++)
        {
            for (int j = 0; j < countAge[i]; j++)
            {
                ages[curIndex]= i;
                curIndex ++;
            }
        }
    }
}

