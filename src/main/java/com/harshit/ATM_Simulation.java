package com.harshit;

import java.util.Scanner;

class ATM {
    private double balance;

    // Constructor
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Successfully deposited: ₹" + amount);
        } else {
            System.out.println("❌ Deposit amount must be positive.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Successfully withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            System.out.println("❌ Withdrawal amount must be positive.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("💰 Current Balance: ₹" + balance);
    }
}

public class ATM_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(1000); // initial balance ₹1000

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("👋 Thank you for using the ATM!");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice. Try again.");
            }
        }
    }
}
