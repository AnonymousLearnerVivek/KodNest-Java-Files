package com.Advance_Java.Exception_Handling.CustomException;

import java.util.Scanner;

public class ATM {
    int accNo = 1111;
    int pin = 1234;
    int p;

    public void collectInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Pin Number: ");
        p = input.nextInt();
    }
    public void validate() throws BankValidationException {
        if(p == pin) {
            System.out.println("Collect your cash");
        } else {
            BankValidationException bankException = new BankValidationException();
            throw bankException;
        }
    }
}