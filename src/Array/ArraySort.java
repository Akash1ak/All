package Array;

import java.util.Arrays;

public class ArraySort
{
    public static void main(String[] args) {
//        int[] array =new int[]{12,98,-67,54,83};
//        Arrays.sort(array);
//        System.out.println("Elements of array sorted in ascending order: ");
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }

        int[] array = new int[]{45,97,05,82,-86};
        System.out.println("array after sorting");
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                int temp=0;
                if (array[i]> array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]);
        }
        System.out.println("descending order");
        for(int i=0;i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = 0;
                if (array[j] > array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
