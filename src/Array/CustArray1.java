package Array;

import java.util.Arrays;

public class CustArray1
{
    Object array[];
    int s;
    int capacity;

    CustArray1()
    {
        capacity =10;
        s =0;
        array = new Object[capacity];

    }
    public void add(Object items)
    {
        array[s++]=items;
    }
    Object get(int index)
    {
        return array[index];
    }
    Object Remove(int index)
    {
        if (index <0 || index>s)
        {
            throw new IndexOutOfBoundsException("Enter a valid index");
        }
        Object RemoveArray = array[index];
        for(int i =index; i<s-1;i++)
        {
            array[i]=array[i+1];
        }
        s--;
        return RemoveArray;
    }

    @Override
    public String toString() {
        return "CustArray1{" +
                "array=" + Arrays.toString(array) +
                ", s=" + s +
                ", capacity=" + capacity +
                '}';
    }

    int size()
    {
        return s;
    }

    public static void main(String[] args) {
        CustArray1 obj = new CustArray1();
        obj.add(12);
        obj.add(23);
        obj.add(90);
        obj.add("Abcd");
        obj.add(23);
        obj.add(24);
        obj.add(27);
        obj.add(29);
        obj.add(56);
        obj.add(67);
        System.out.println(obj.Remove(2));

        for(int i =0;i<obj.size();i++)
        {
            System.out.println(obj.toString());
        }
       // System.out.println("cust array :"+obj);
        System.out.println(obj.toString());
    }

}
