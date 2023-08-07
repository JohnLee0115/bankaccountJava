public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;

    private static int accounts;
    private static double totalMoney; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR
    // Be sure to increment the number of accounts
    public BankAccount(double checkingsDeposit, double savingsDeposit) {
        this.checkingBalance = checkingsDeposit;
        this.savingsBalance = savingsDeposit;
        this.totalMoney = this.totalMoney + checkingsDeposit + savingsDeposit;
        accounts++;
    }
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositCheckings(double deposit) {
        this.checkingBalance += deposit;
        this.totalMoney += deposit;
    }

    public void depositSavings(double deposit) {
        this.savingsBalance += deposit;
        this.totalMoney += deposit;
    }

    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawCheckings (double withdrawAmount) {
        if (withdrawAmount > this.checkingBalance) {
            System.out.println("Insufficient funds");
        }
        else {
            this.checkingBalance -= withdrawAmount;
            this.totalMoney -= withdrawAmount;
            System.out.println("New checkings balance: $" + this.checkingBalance);
        }
    } 

    public void withdrawSavings (double withdrawAmount) {
        if (withdrawAmount > this.savingsBalance) {
            System.out.println("Insufficient funds");
        }
        else {
            this.savingsBalance -= withdrawAmount;
            this.totalMoney -= withdrawAmount;
            System.out.println("New savings balance: $" + this.savingsBalance);
        }
    } 
    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("Total Balance: $" + (checkingBalance + savingsBalance));
        System.out.println("Checkings Balance: $" + this.checkingBalance);
        System.out.println("Savings Balance: $" + this.savingsBalance);
    }
}
