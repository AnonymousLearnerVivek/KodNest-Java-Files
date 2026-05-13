package com.Encapsulation;

import java.util.Scanner;

class Bank {
    private int accNo = 1234;
    private int balance = 10000;
    private int pin = 4242;

    void withdraw(int pinNo, int amount) {
        if(amount > balance) {
            System.out.println("Insufficient funds!");
        } else if(pinNo != pin) {
            System.out.println("Invalid pin!");
        } else if(pinNo == pin && amount <= balance) {
            balance -= amount;
            System.out.println("You have successfully withdraws $" + amount);
        }
    }

    void checkBalance(int accNumber, int pinNo) {
        if(accNumber == accNo && pinNo == pin) {
            System.out.println("your updated balance after withdrawal is: $" + balance);
        }
    }
}

public class MainEncapsulationPractice {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.withdraw(4242, 100);
        bank.checkBalance(1234, 4242);
    }
}
