package org.example.abstracttask;

public class BankAccountImp implements BankAccount {

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal");
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Deposit");
    }

    @Override
    public double getBalance() {
        return 5.5;
    }

    @Override
    public void transfer(double amount, BankAccount destination) {
        System.out.println("Transfer");
    }

    @Override
    public void close() {
        System.out.println("Close");
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public String getOwner() {
        return null;
    }

    @Override
    public void setOwner(String owner) {
    }

    @Override
    public void setBalance(double balance) {
    }
    @Override
    public void setClosed(boolean closed) {
    }
    @Override
    public void setTransfered(double transfered) {
    }

    @Override
    public void setOpen(boolean open) {

    }

    @Override
    public void setAccountName(String name) {

    }
}
