import java.math.BigInteger;

public class Customer {
   final String customerName;
   final int age;
   final String address;
   final int accountNo;
   final double initalAmount;
   private double totalAmount;

    public Customer(String customerName, int age,String address,double initalAmount){
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.accountNo = (int) Math.floor(Math.random()*100000);
        this.initalAmount = initalAmount;
        this.totalAmount = initalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public void deposit(double amount){
        totalAmount+=amount;
    }
    public void withDraw(double amount){
        totalAmount-=amount;
    }
}
