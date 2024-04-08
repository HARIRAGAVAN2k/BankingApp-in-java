class Bank {
    private int total = 1000;

    void withdraw(String name, int withdrawal) {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn " + withdrawal);
            total -= withdrawal;
            System.out.println("Balance after withdrawal: " + total);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(name + " you cannot withdraw " + withdrawal);
            System.out.println("Your balance is: " + total);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void deposit(String name, int deposit) {
        System.out.println(name + " deposited " + deposit);
        total += deposit;
        System.out.println("Balance after deposit: " + total);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.withdraw("Arnab", 20);
         System.out.println("------------------------------");
        bank.withdraw("Monodwip", 40);
             System.out.println("------------------------------");
        bank.deposit("Mukta", 35);
             System.out.println("------------------------------");
        bank.withdraw("Rinkel", 80);
             System.out.println("------------------------------");
        bank.withdraw("Shubham", 40);
             System.out.println("------------------------------");
    }
}
