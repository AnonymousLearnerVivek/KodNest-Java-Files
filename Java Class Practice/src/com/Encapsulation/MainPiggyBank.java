package com.Encapsulation;

class PiggyBank {
    private double money;

    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
        } else {
            System.out.println("Nice try! Can't add negative money.");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
        } else {
            System.out.println("Sorry, not enough funds or invalid amount.");
        }
    }

    public double checkBalance() {
        return money;
    }
}
public class MainPiggyBank {
    public static void main(String[] args) {

        //  A Practical Piggy com.Encapsulation.Bank Analogy
        /*
            What if your piggy bank had a tiny robot inside it? You don’t touch the money directly. Instead, you send instructions:

            “Add ₹100.”
            “Take out ₹50.”
            “Show me the balance.”

            And the robot follows rules:
            No negative deposits
            No over-withdrawing
            No peeking inside

            This is encapsulation.
         */


        PiggyBank myBank = new PiggyBank();
        myBank.addMoney(100.0);            // Robot says: ✅
        myBank.withdrawMoney(50.0);        // ✅
        System.out.println(myBank.checkBalance());  // ₹50.0

        myBank.addMoney(-30.0);            // ❌ Robot blocks it
        myBank.withdrawMoney(1000.0);      // ❌ Not allowed
    }
}
