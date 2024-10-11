# Design-Driven-SmartATM

## Overview

The Design-Driven-SmartATM Simulation project is a Java application that models an Automated Teller Machine (ATM), demonstrating the use of Design Patterns to handle transactions and operations. This simulation provides a straightforward command-line interface, allowing users to engage with the ATM system seamlessly while offering an educational showcase of well-structured Design Principles in action.


## Features

  - This project provides an interactive ATM interface that includes the following capabilities:
    
      - Insert and eject cards.
      - Enter a PIN.
      - Withdraw cash.
      - Deposit cash.
      - Check balance.
      - Enforces PIN-based authentication for security.
      - Supports different transaction strategies (Withdrawal and Deposit) with customizable limits.
      - State-based operation handling for secure and logical transitions between ATM states.
      - User-friendly error handling and feedback for invalid actions.

   
## Design Patterns

### -> Strategy Pattern :

- The Strategy Pattern is applied to handle different transaction types (Withdrawal and Deposit) in a flexible way. Each transaction type can have its own unique behavior, and it allows easy addition of new transaction types in the future.

  - Classes Involved:
    
      ``` TransactionStrategy ```
    
      ``` WithdrawalStrategy ```
    
      ``` DepositStrategy ```


### -> Decorator Pattern :

- The Decorator Pattern dynamically adds behavior to ATM transactions without modifying the underlying structure. It is used here to dynamically wrap transaction processes with additional logic for withdrawal and deposit operations.

  - Classes Involved:
    
      ``` ATMTransaction ```
    
      ``` WithdrawTransactionDecorator ```
    
      ``` DepositTransactionDecorator ```


### -> Observer Pattern :

- The Observer Pattern is used to keep the ATM user interface updated with changes in the ATM state. When the state of the ATM changes (e.g., card inserted, PIN entered), the observers are notified and the UI reflects these changes.

  - Classes Involved:
    
      ``` Observer ```
    
      ``` ATMUserInterface ```

    
### -> Factory Method Pattern :

- The Factory Method Pattern provides an easy way to create different transaction objects (Withdrawal and Deposit) without modifying the creation logic for each transaction. Factories are used to encapsulate the creation process.

  - Classes Involved:
    
      ``` TransactionFactory ```
    
      ``` WithdrawFactory ```
    
      ``` DepositFactory ```

### -> State Pattern :
    
