# Java Banking System

A clean console-based banking application built with Java.

This project simulates basic banking operations through a simple menu-driven interface.  
The user can check their balance, deposit money, withdraw money, and safely handle invalid input without crashing the program.

---

## Features

- Check current account balance
- Deposit money
- Withdraw money
- Prevent withdrawal when funds are insufficient
- Reject invalid numeric values
- Handle non-numeric user input safely
- Format currency in euro
- Structured code using separate methods

---

## Built With

- Java
- IntelliJ IDEA
- Scanner
- switch-case
- while loop
- methods
- try-catch
- NumberFormat
- Locale

---

## Project Structure

```text
src/
└── Main.java
```

---

## How It Works

When the program starts, the user sees a menu in the console:

```text
Welcome to Banking System
1 - Check Balance
2 - Deposit
3 - Withdraw
4 - Exit
```

The program keeps running until the user chooses to exit.

---

## Example Use Cases

### Check Balance
The user can view the current balance formatted as euro currency.

### Deposit
The user enters an amount to add to the balance.

### Withdraw
The user enters an amount to withdraw.  
If the amount is greater than the available balance, the transaction is rejected.

### Input Validation
If the user enters invalid input such as text instead of numbers, the program shows an error message and continues running.

---

## Learning Goals of This Project

This project was built to practice and demonstrate:

- Java fundamentals
- user input handling
- conditionals and control flow
- loops
- methods
- error handling
- clean code structure

---

## How to Run

1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Use the console menu

---

## Future Improvements

- Transaction history
- Save balance to file
- Multiple accounts
- PIN system
- Better console UI

---

## Author

**Sahand Kholdirezaei**
