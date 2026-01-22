package org.example.abstracttask;

public interface BankAccount {
    void withdraw(double amount);
    void deposit(double amount);
    double getBalance();
    void transfer(double amount, BankAccount destination);
    void close();
    boolean isOpen();
    String getOwner();
    void setOwner(String owner);
    void setBalance(double balance);
    void setClosed(boolean closed);
    void setTransfered(double transfered);
    void setOpen(boolean open);
    void setAccountName(String name);
}
