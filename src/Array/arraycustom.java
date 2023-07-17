package Array;

public class arraycustom
{
    int s;
    int capacity;
    Object arr[];

    arraycustom()
    {
        capacity = 20;
        s = 10;
        arr = new Object[capacity];
    }
    void add(Object itam)
    {
        arr[s++] = itam;
    }
    int size()
    {
        return  s;
    }
    Object get(int index)
    {
        return arr[index];
    }
}
class swami
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

