package com.Advance_Java.Exception_Handling;

import java.util.Scanner;

class Atm {
    public void withdraw() throws Exception
    {
        System.out.println("ATM transaction started");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Pin:");
            int pin = sc.nextInt();
            if(pin == 1234) {
                System.out.println("Enter amount to withdraw:");
                int amount = sc.nextInt();
                System.out.println("Collect your cash");
            }
            else {
                System.out.println("Incorrect pin");
            }
        }
        catch (Exception e) {
            System.out.println("Invalid Input. Collect your card.");
            throw e; // here we are rethrowing the exception to the caller method i.e, to bankAtm() that we have encountered an error
            // and This rethrowing exception we achieve with 2 keywords 'throw' and 'throws'
        }
        finally {
            System.out.println("ATM transaction ended");
        }
    }
}
class Bank{
    public void bankAtm() {
        System.out.println("Connection established with bank server");
        try {
            Atm atm = new Atm();
            atm.withdraw();
        }
        catch (Exception e) {
            System.out.println("Warning message. There was a transaction attempt was made using your card.");
        }
        System.out.println("Connection terminated from bank server");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Main method execution started");
        Bank bank = new Bank();
        bank.bankAtm();
        System.out.println("Main method execution ended");
    }
}
