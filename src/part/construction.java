package part;

public class construction {
    private String bank;

    public construction(String bank, long accountNo, int totalAmount) {
        this.bank = bank;
        this.accountNo = accountNo;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "const1{" +
                "bank='" + bank + '\'' +
                ", accountNo=" + accountNo +
                ", totalAmount=" + totalAmount +
                '}';
    }

    private long accountNo;
    private int totalAmount;

    public static void main(String[] args) {
        construction co =new construction("HDFC",50100847,765800);
        System.out.println("bank details ="+co.toString());
        construction cod = new construction("Sbi",478346964,4500);
        System.out.println("Sbi bank details ="+co.toString());
    }

}