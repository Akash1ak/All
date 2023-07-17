package ComparatorvsComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test
{
    private int sr_no;
    private String empName;
    private long mobNo;
    private char bloodGroup;
    private String state;



    public int getSr_no() {
        return sr_no;
    }
    public void setSr_no(int sr_no)
    {
        this.sr_no = sr_no;
    }

    public String getEmpName()
    {
        return empName;
    }
    public void setEmpName(String empName)
    {
        this.empName =empName;
    }
    public long getMobNo()
    {
        return mobNo;
    }
    public void setMobNo(int mobNo)
    {
        this.mobNo =mobNo;
    }
    public char getBloodGroup()
    {
        return bloodGroup;
    }
    public void setBloodGroup(char bloodGroup)
    {
        this.bloodGroup = bloodGroup;
    }
    public String getState(String state)
    {
        return state;
    }
    public void setState()
    {
        this.state =state;
    }
    @Override
    public String toString()
    {
        return "Test{" +
                "sr_no =" +sr_no +
                " , empName='" + empName + '\'' +
                ",mobNo=" + mobNo +
                ", bloodGroup=" +bloodGroup +
                ", state =' " + state +'\'' +
                '}';
    }
    public Test(int sr_no, String empName , int mobNo , char bloodGroup , String state)
    {
        this.sr_no =sr_no;
        this.empName = empName;
        this.mobNo = mobNo;
        this.bloodGroup = bloodGroup;
        this.state =state;
    }

    public static void main(String[] args) {
        Test obj = new Test(01, "Akash", 751775356, 'a', "maharashtra");
        Test obj2 = new Test(02, "omkar", 784512366, 'b', "karnatka");
        Test obj3 = new Test(03, "saurabh", 89562358, 'o', "kerla");
        Test obj4 = new Test(04, "Appa", 852266442, 'b', "uater predesh");
        Test obj5 = new Test(05, "janni", 445599222, 'o', "rajastan");


        List<Test> worker = new ArrayList<>();
        worker.add(obj);
        worker.add(obj2);
        worker.add(obj3);
        worker.add(obj4);
        worker.add(obj5);

        name comparator = new name();
        Collections.sort(worker,comparator);
        System.out.println("name sort"+worker);

        blood blood = new blood();
        Collections.sort(worker,blood);
        System.out.println("blood gropup sort :"+worker);

        mob mob = new mob();
        Collections.sort(worker,mob);
        System.out.println("mob no ="+worker);

        }
}

class name implements Comparator<Test>
{

    @Override
    public int compare(Test o1, Test o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
class blood implements Comparator<Test>
{ @Override
public int compare(Test o1, Test o2)
{

    if(o1.getBloodGroup()>o2.getBloodGroup())
    {
        return 1;
    }
        if(o1.getBloodGroup()< o2.getBloodGroup())
    {
        return -1;
    }
        return 0;
}
 }
class mob implements  Comparator<Test>
{
    @Override
    public int compare(Test o1, Test o2)
    {
     if(o1.getMobNo()>o2.getMobNo())
    {
        return 1;
    }
        if(o1.getMobNo()< o2.getMobNo())
    {
        return -1;
    }
        return 0;
}


}
