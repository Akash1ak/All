package Array;

public class cusArrayList
{
    Object arr[];
    int s;
    int capacity;

    cusArrayList()
    {
        capacity=50;
        s=0;
        arr=new Object[capacity];
    }
    void add(Object itam)
    {
        arr[s++]=itam;
    }
    int size()
    {
        return s;
    }
    Object get(int index)
    {
        return arr[index];
    }
}
class Amish
{
    public static void main(String[] args) {
        cusArrayList ok = new cusArrayList();
        ok.add("sam");
        ok.add("bb");
        ok.add("oo");

        for(int i=0;i<ok.size();i++)
        {
            System.out.println(ok.get(i));
        }
    }
}
