import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
        ArrayList<Customer> customerList;
        Scanner sc;

        public Bank(){
            customerList = new ArrayList<>();
            sc = new Scanner(System.in);
        }






        public void menu(){
            int choice=0;
            while(true){
                System.out.println("==========*** Welcome to the Dena Bank ***==========");
                System.out.println("1].Open Account\t\t\t2].Deposit Money");
                System.out.println("3].Withdraw Money\t\t\t4].Check Balance");
                System.out.println("5].Exit System");
                System.out.println("----------------------------------------");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                System.out.println("----------------------------------------");

                sc.nextLine();
                if(choice ==1){
                    System.out.println("Enter your name: ");
                    String name  = sc.nextLine();
                    System.out.println("Enter your age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    if(age <20 && age >80 ){
                        System.out.println("You are not eligible to open account.");
                        break;
                    }else{

                        System.out.println("Enter your Address: ");
                        String address = sc.nextLine();
                        System.out.println("Enter Initial Amount: (initial amount should not be less that 1000)");
                        int initialAmount = sc.nextInt();
                        sc.nextLine();
                        if(initialAmount < 1000){
                            System.out.println("Initial Amount should be greater than or equal to 1000");
                        }else{
                            Customer newCustomer = new Customer(name,age,address,initialAmount);
                            customerList.add(newCustomer);
                            System.out.println("Name: "+newCustomer.getCustomerName());
                            System.out.println("Address: "+newCustomer.getAddress());
                            System.out.println("A/C no: "+newCustomer.getAccountNo());
                            System.out.println("CAUTION! Always remember your a/c no");
                            System.out.println("Hey "+newCustomer.getCustomerName()+" You are a member of our Bank. " +
                                    "Congratulation");
                        }
                    }

                }else if(choice ==5){
                    break;
                }


            }



        }








}
