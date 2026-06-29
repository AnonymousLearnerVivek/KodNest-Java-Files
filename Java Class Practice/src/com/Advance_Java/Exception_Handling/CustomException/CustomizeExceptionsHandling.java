package com.Advance_Java.Exception_Handling.CustomException;

import java.util.Scanner;

class BankValidationException extends Exception {
    @Override
    public String getMessage() {
        return "You made wrong attempt";
    }
}

public class CustomizeExceptionsHandling {
    public static void main(String[] args) {
        System.out.println("Banking started");
        Bank bank = new Bank();
        bank.atmBanking();

        System.out.println("Banking ended");
    }
}
