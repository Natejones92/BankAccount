import javax.swing.*;

public class BankAccount {
  private double balance;

  public BankAccount() {
    balance = 0.0;
  }

  public BankAccount(double initialAmount) {
    balance = initialAmount;
  }

  public void deposit(double in) {
    balance += in;
  }

  public void withdraw(double in) {
    balance += in;
  }

  public double getBalance() {
    return balance;
  }

  public void transfer(BankAccount other, double amount) {
    withdraw(amount);
    other.deposit(amount);
  }

  public String toString() {
    return "Account balance: " + balance;
  }

  public static void main(String[] args) {
    String input;
    input = JOptionPane.showInputDialog(" What is your account's starting balance");
    double in = Double.parseDouble(input);
    BankAccount account = new BankAccount(in);
    input = JOptionPane.showInputDialog("How much were you paid this month");
    double depost = Double.parseDouble(input);
    account.deposit(depost);
    JOptionPane.showMessageDialog(null,
        String.format("Your pay has been deposited. " + "Your current balance is $%, .2f", account.getBalance()));
    input = JOptionPane.showInputDialog("How much would you like to withraw?");
    double withdrawl = Double.parseDouble(input);
    account.withdraw(withdrawl);
    JOptionPane.showMessageDialog(null,
        String.format("Now your balance is $%, .2f", account.getBalance()));
    System.exit(0);
  }
}
