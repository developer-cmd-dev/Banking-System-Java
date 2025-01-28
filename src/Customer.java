import java.math.BigInteger;

public class Customer {
   final String customerName;
   final int age;
   final String address;
   final int accountNo;
   final double initalAmount;

    public Customer(String customerName, int age,String address,double initalAmount){
        this.customerName = customerName;
        this.age = age;
        this.address = address;
        this.accountNo = (int) Math.floor(Math.random()*100000);
        this.initalAmount = initalAmount;
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
}
