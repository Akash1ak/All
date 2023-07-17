package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_class1
{
    private int accountNo;
    private String name;
    private int amount;
    private String email;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Comparator_class1{" +
                "accountNo=" + accountNo +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", email='" + email + '\'' +
                '}';
    }

    public Comparator_class1(int accountNo, String name, int amount, String email) {
        this.accountNo = accountNo;
        this.name = name;
        this.amount = amount;
        this.email = email;
    }

    public static void main(String[] args) {
     //  List abc = new ArrayList<>();
       Comparator_class1 acc =new Comparator_class1(4578,"akash",45000,"ab@gmail.com");
       Comparator_class1 acc2 = new Comparator_class1(8956,"shubham",56000,"Shubham@gmail.com");

       List<Comparator_class1> list = new ArrayList<>();
       list.add(acc);
       list.add(acc2);

        Name name = new Name();
        Collections.sort(list,name);
        System.out.println(list);


    }
}

class Name implements Comparator<Comparator_class1>
{

    @Override
    public int compare(Comparator_class1 o1, Comparator_class1 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}