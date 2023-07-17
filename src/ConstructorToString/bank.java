package ConstructorToString;

public class  bank
{
    private String bankName;

    public bank(String bankName, String branch, int balance, long client) {
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        this.client = client;
    }

    @Override
    public String toString() {
        return "bank" +
                "bankName='" + bankName + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", client=" + client ;
    }

    private String branch;
    private int balance;
    private long client;

    public static void main(String[] args) {
        bank bank =new bank("HDFC","deccan",2000000000,1300000);
        System.out.println("total information "+bank.toString());
        bank ba =new bank("SBI","warje",2000000,1200);
        System.out.println("total info "+ba.toString());
    }
}
