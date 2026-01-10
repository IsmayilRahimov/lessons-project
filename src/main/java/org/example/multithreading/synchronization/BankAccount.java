package org.example.multithreading.synchronization;

public class BankAccount {
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public synchronized void deposit(String person, int amount) {
        System.out.println(person + " USD " + amount + " cixaris edir:");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        if (balance >= amount) {
            balance -= amount;
            System.out.println(person + " USD " + amount + " cixaris etdi:" + " \n Yeni Balansiniz pul cixarildiqdan sonra : " + balance);
        } else {
            System.out.println("Hesabinizda yeteri qeder vesait yoxdur:" + balance);
        }
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(5000);
        Thread t1 = new Thread(() -> {
            bankAccount.deposit("John", 4500);
        });
        Thread t2 = new Thread(() -> {
            bankAccount.deposit("John", 4500);
        });
        t1.start();
        t2.start();
    }
}
