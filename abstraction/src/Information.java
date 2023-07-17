abstract class Information
{
    abstract void accountdetails();
    abstract void bankDetails();
}
class Customer extends Information {
    void accountdetails() {
        String name = "Akash Umakant Biradar";
        String IFSC = "HDFC00000123";
        long account_no = 601003453849l;
        System.out.println("********** Customer Details **********");
        System.out.println(name);
        System.out.println(IFSC);
        System.out.println(account_no);
        System.out.println("=======================================================");
        System.out.println("*********** Bamk Details ***********");
    }
    @Override
    void bankDetails()
    {
        String bank_Name ="HDFC";
        String address = "Udgir";
        long bank_Ph_No = 41351734500l;
        int totalEmployee = 23;
        String totalBalance = "7.8 core";

        System.out.println(bank_Name);
        System.out.println(address);
        System.out.println(bank_Ph_No);
        System.out.println(totalEmployee);
        System.out.println(totalBalance);


    }
}
class All
{
    public static void main(String[] args)
    {
        Information obj = new Customer() ;
         obj.accountdetails();
         obj.bankDetails();

    }

}
