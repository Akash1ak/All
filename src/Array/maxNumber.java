package Array;

public class maxNumber
{
    public static void main(String[] args) {
        int [] array = new int[]{87,54,98,6,80,765};
        int max =array[0];
        for(int i=0;i<array.length;i++)
        {
            if (array[i]>max)
            {
                max =array[i];
            }
        }
//        System.out.println("given array is ");
//        for(int i=0;i<array.length;i++)
//        {
//            System.out.println(array[i]);
//        }
        System.out.println("from an array max no is here "+max);
    }
}
