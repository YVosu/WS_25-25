package PKA.VL_07;

import PKA.VL_02.PR_02.Aufgabe_01.ClassHierarchy;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(5000);
        account1.deposit(2000);
        System.out.println(account1.getBalance());


    }
}
