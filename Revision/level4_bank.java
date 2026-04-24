/*
q11.
Create a class BankAccount with:
. Private fields: accountHolder (String) and balance (double)
. A constructor that initializes both fields
. Getters and setters for both fields
. A method deposit(double amount) that adds to balance
. A method withdraw(double amount) that subtracts from balance only if sufficient, otherwise prints
"Insufficient funds"
. A main method that creates an account, deposits, withdraws, and prints the final balance
*/

import java.util.Scanner;

class BankAccount{
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double balance){
        this.accountHolder = name;
        this.balance = balance;
    }

    String get_name(){
        return accountHolder;
    }

    void set_name(String name){
        this.accountHolder = name;
    }

    double get_balance(){
        return balance;
    }

    void set_balance(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        set_balance(this.get_balance() + amount);
    }

    void withdraw(double amount){
        if (amount > this.balance){
            System.out.println("Insufficient funds!!!");
        }
        else {
            set_balance(this.get_balance() - amount);
        }
    }
}

public class level4_bank {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount("Obito", 56000);
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: "+userAccount.get_name());
        System.out.println("Balance : "+userAccount.get_balance());

        double amount1,amount2;

        System.out.print("Enter Balance to deposit: ");
        amount1 = sc.nextDouble();
        userAccount.deposit(amount1);
        System.out.print("\nNew Balance: "+userAccount.get_balance());

        System.out.print("\nEnter Balance to withdraw: ");
        amount2 = sc.nextDouble();
        userAccount.withdraw(amount2);
        System.out.print("\nNew Balance: "+userAccount.get_balance());

        String new_name = "Obito Uchiha";
        userAccount.set_name(new_name);
        System.out.println("\nUser name changed to "+userAccount.get_name());
        sc.close();

    }
}
