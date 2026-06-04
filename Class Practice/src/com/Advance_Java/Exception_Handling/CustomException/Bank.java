package com.Advance_Java.Exception_Handling.CustomException;

public class Bank {
    void atmBanking() {
        System.out.println("Connection established to bank server");

        ATM atm = new ATM();
        try {
            atm.collectInput();
            atm.validate();
        }
        catch (BankValidationException be) {
            System.out.println("You entered an invalid Pin Number. You are left with 2 more attempts.");
            System.out.println(be.getMessage());
            try {
                atm.collectInput();
                atm.validate();
            }
            catch (BankValidationException be2) {
                System.out.println("You entered an invalid Pin Number. You are left with 1 more attempts.");
                System.out.println(be2.getMessage());
                try {
                    atm.collectInput();
                    atm.validate();
                }
                catch (BankValidationException be3) {
                    System.out.println("You entered an invalid Pin Number. You finished all the attempts. Your card is blocked. Contact Bank.");

                }
            }
        }
        System.out.println("Connection terminated to bank server");
    }
}
