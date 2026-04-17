interface BankInterface{
    void deposit(double amount);
    void withdraw(double amount);
    void display();
}
class customer{
    protected String name;
    protected int customerId;
    public void setCustomerDetails(String name,int customerId){
        this.name=name;
        this.customerId=customerId;
    }
    public void showCustomerDetails(){
        System.out.println("Customeer Name : "+name);
        System.out.println("Customer Id : "+customerId);
    }
}
class account{
    protected double balance=0;
    public void showBalance(){
        System.out.println("Balance : "+balance);
    }
}
class bankSystem extends customer implements BankInterface{
    account a = new account();
    public void deposit(double amount){
        a.balance+=amount;
        System.out.println("Deposited : "+amount);
    }
    public void withdraw(double amount){
        if(amount>a.balance){
            System.out.println("Insufficient Balance !");
        }else{
            a.balance-=amount;
            System.out.println("Withdraw : "+amount);
        }
    }
    public void display(){
        showCustomerDetails();
        a.showBalance();
    }
}
public class Bank {
    public static void main(String[] args) {
        bankSystem obj = new bankSystem();
        obj.setCustomerDetails("Ankit Kumar", 54);
        obj.deposit(5001);
        obj.withdraw(130.56);
        obj.display();
    }   
}
