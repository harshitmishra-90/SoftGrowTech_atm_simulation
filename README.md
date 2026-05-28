ATM Simulation in Java
A simple console‑based ATM simulation program built using Object-Oriented Programming (OOP) concepts in Java.
This project demonstrates how real‑world ATM operations work: depositing money, withdrawing money, and checking account balance.

📌 Features
Deposit money

Withdraw money (with balance validation)

Check current balance

Menu-driven console interface

Uses OOP principles (class, object, encapsulation)

🧠 How the Program Works
1. ATM Class
This class represents the ATM machine.
It contains:

A private variable balance

Methods for:

deposit()

withdraw()

checkBalance()

Deposit Logic
Amount must be greater than 0

If valid → added to balance

Else → error message

Withdraw Logic
Amount must be greater than 0

Amount must be less than or equal to balance

If valid → deducted from balance

Else → shows “Insufficient balance”

Check Balance
Simply prints the current balance

🖥️ Main Class (ATM_Simulation)
The main() method:

Creates a Scanner for user input

Creates an ATM object with an initial balance of ₹1000

Runs an infinite loop showing the ATM menu

Takes user choice and performs the selected operation

Exits when the user selects option 4
