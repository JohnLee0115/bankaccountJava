public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount bankAccount1 = new BankAccount(500, 500);
        BankAccount bankAccount2 = new BankAccount(1500, 1500);
        BankAccount bankAccount3 = new BankAccount(2500, 2500);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // bankAccount1.depositCheckings(200);
        // bankAccount2.depositCheckings(300);
        // bankAccount3.depositCheckings(400);

        // bankAccount1.depositSavings(1200);
        // bankAccount2.depositSavings(1300);
        // bankAccount3.depositSavings(1400);

        // bankAccount1.getBalance();
        // bankAccount2.getBalance();
        // bankAccount3.getBalance();
        


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // bankAccount1.withdrawCheckings(700);
        // bankAccount2.withdrawCheckings(800);
        // bankAccount3.withdrawCheckings(800);

        // bankAccount1.withdrawSavings(1000);
        // bankAccount2.withdrawSavings(1800);
        // bankAccount3.withdrawSavings(1800);

        // bankAccount1.getBalance();
        // bankAccount2.getBalance();
        // bankAccount3.getBalance();


        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println(BankAccount.getTotalMoney());
        System.out.println(BankAccount.getAccounts());
    }
}

