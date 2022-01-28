package org.xpdojo.bank;

public class Account {

    public double balance;

    public Account(double intialBalanec) {
        balance=intialBalanec;
    }

    public void deposit(double amount) {
        double newBalance= balance+amount;
        balance=newBalance;
    }

    public double getBalance(){
        return balance;
    }
}
