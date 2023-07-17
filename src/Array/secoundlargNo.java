package Array;

public class secoundlargNo
{
    public static void main(String[] args) {
        int [] array = new int[]{76,9,80,76,856,777};
        int temp,size;
        size = array.length;
        for(int i =0;i<size;i++)
        {
            for (int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    temp =array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println("Secound largest nno "+array[size-2]);
        System.out.println("secound smallest no "+array[1]);
    }
}
