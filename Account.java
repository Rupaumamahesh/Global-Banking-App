public class Account{
    private int accountNumber;
    private String name;
    private int age;
    private double balance;
    private String accountType;
    private String status;

    //constructor - version 1
    // public Account(int accountNumber, String name, int age, double balance, String accountType, String status) {
    //     this. accountNumber = accountNumber;
    //     this.name = name;
    //     this.age = age;
    //     this.balance = balance;
    //     this.accountType = accountType;
    //     this.status = status;

    // } 
    public Account(int accountNumber, String name, int age, double balance, String accountType) {
        this. accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.accountType = accountType;
        this.status = "Active";
    } 
    public boolean deposit(double amount) {
        if(this.status.equals("Active") && amount > 0) {
            balance += amount;
            //System.out.println(balance);
            return true;
        }
        else {
            //System.out.println("Deposit is failed");
            return false;
        }
    }
    public boolean withdraw (double amount) {
        if(this.status.equals("Active") && balance > amount) {
            balance -= amount;
            //System.out.println(balance);
            return true; 
        }
        else {
            //System.out.println("Invalid ammount.");
            return false;
        }
    }
    //getter methods 
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountType() {
        return accountType;
    }
    public String getStatus() {
        return status;
    }
    //setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

