import java.util.Scanner;

// Bank Account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount for withdrawal.");
        }
    }
}

// ATM class
public class atm_interface {
    private BankAccount account;

    public atm_interface(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println();
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void processOption(int option) {
        switch (option) {
            case 1:
                System.out.println("Balance: Rs " + account.getBalance());
                break;
            case 2:
                System.out.print("Enter amount to deposit: ");
                double depositAmount = getInput();
                account.deposit(depositAmount);
                break;
            case 3:
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = getInput();
                account.withdraw(withdrawAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option.");
        }
    }

    private double getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance
        atm_interface atm = new atm_interface(userAccount);

        while (true) {
            atm.displayMenu();
            System.out.print("Enter your choice: ");
            int choice = (int) atm.getInput();
            atm.processOption(choice);
        }
    }
}

