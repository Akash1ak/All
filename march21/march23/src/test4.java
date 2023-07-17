public class test4{

    private String fname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public static String getCollegename() {
        return collegename;
    }

    public static void setCollegename(String collegename) {
        test4.collegename = collegename;
    }

    private String mname;
    private String lname;

    private static String collegename;
    public void m1()
    {
        int a =100;
        System.out.println("amount is "+a);
        System.out.println(fname);
        System.out.println(collegename);
    }
    public static void main(String [] args)
    {
       test4 ok =new test4();

       ok.m1();
       ok.setFname("fname1");
       ok.setLname("lname1");
       ok.setMname("mname1");
       test4.collegename ="MBES";

       test4 ok1 =new test4();
       ok1.setFname("fname2");
       ok1.setLname("lname2");
       System.out.println(ok.getFname());
       System.out.println(ok1.getLname());
       System.out.println(collegename);
    }
}
