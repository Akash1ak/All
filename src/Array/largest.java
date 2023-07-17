package Array;

public class largest
{
    public static void main(String[] args) {
        int [] array = new int[]{45,46,47,48,49};
        int temp;
        int size=array.length;
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(array[size-1]);
    }
}
