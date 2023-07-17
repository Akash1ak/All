package Array;

public class custt {
Object arr[];
int s;
int capacity;

custt()
{
    capacity=20;
    s =0;
    arr = new Object[capacity];
}

void add(Object itam)
{
    arr[s++]=itam;
}
int size(){
    return s;
}
Object get(int index)
{
    return arr[index];
}
}
class Amisha
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
