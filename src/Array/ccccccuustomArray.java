package Array;

public class ccccccuustomArray
{
    Object arr[];
    int s;
    int capacity;
    ccccccuustomArray()
    {
        s=0;
        capacity=90;
        arr = new Object[capacity];
    }
    void add(Object it)
    {
        arr[s++]=it;
    }
    int size()
    {
        return s;
    }
    Object get(int index)
    {
        return arr[index];
    }

    public static void main(String[] args) {
        ccccccuustomArray oo = new ccccccuustomArray();
        oo.add(55);
        oo.add(88);
        oo.add("hgefh");

       for(int i=0;i<oo.size();i++)
       {
           System.out.println(oo.get(i));
       }
    }
}

