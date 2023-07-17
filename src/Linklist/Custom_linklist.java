package Linklist;

import Array.CustArray1;

import java.util.Arrays;

public class Custom_linklist
{
Object linklist[];
    int s;
    int capacity;

    Custom_linklist()
    {
        capacity =10;
        s =0;
        linklist = new Object[capacity];

    }
    public void add(Object item)
    {
        linklist[s++]=item;
    }
    Object get(int index)
    {
        return linklist[index];
    }

    Object Remove(int index)
    {
        if (index <0 || index>s)
        {
            throw new IndexOutOfBoundsException("Enter a valid index");
        }
        Object RemoveArray = linklist[index];
        for(int i =index; i<s-1;i++)
        {
            linklist[i]=linklist[i+1];
        }
        s--;
        return RemoveArray;
    }

    @Override
    public String toString() {
        return "CustArray1{" +
                "array=" + Arrays.toString(linklist) +
                ", s=" + s +
                ", capacity=" + capacity +
                '}';
    }

    int size()
    {
        return s;
    }

    public static void main(String[] args) {
        Custom_linklist obj = new Custom_linklist();
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

//        for(int i =0;i<obj.size();i++)
//        {
//            System.out.println(obj.toString());
//        }
        // System.out.println("cust array :"+obj);
        System.out.println(obj.toString());
    }

}

