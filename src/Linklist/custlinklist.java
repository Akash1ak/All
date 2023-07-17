package Linklist;

public class custlinklist
{
    node head;
    static class node
    {
        int data;
        node next;
         node(int data)
         {
             this.data =data;
             next=null;
         }

    }
    public static custlinklist insert(custlinklist list,int data)
    {
        node newnode =new node(data);
        if(list.head == null) {
            list.head=newnode;
        } else {
            node last = list.head;
            while (last.next != null)    //end of the elements
            {
                last=last.next;
            }
        }
        return  list;
    }

    public static void printmylist (custlinklist list)
    {
        node currentnode = list.head;
        System.out.println("");
    }
    public static void main(String[] args) {

    }
}
