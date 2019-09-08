# BankApplication
1. This project demonstrates a BankApplication using Java.
2. This Application provides functionalities such as deposit, withdraw, check balance, previous transaction.
3. The **BankAccountInterface interface** is a contract and declares deposit, withdraw, previousTransactionDisplay, showMenu methods.
4. BankAccount class implements BankAccountInterface and defines the above methods.
5. Here I have used **Getters and Setters** for variables customerName, customerID, balance, previousTransaction as a layer of encapsulation
6. The **encapsulation** is provided thinking in future the value of customerIDs or balance(if interest is added with balance) may change.
7. I have used **FactoryMethod pattern** to create objects of BankAccount. This avoids the direct use of BankAccount constructor.
8. BankAccountFactory getInput method generates the BankAccount object if customerName, customerID, amount is not empty.
9. Finally in the main class BankApplication, I create an object of BankAccountFactory and use method getInput(customerName, customerID, amount)
10. The getInput method returns an object of BankAccount.
11. Here the user does not care about the implmentation of BankAccount, he is only concerned about using methods declared in interface.
12. In future I will use **Observer pattern** to create notifications when deposit or withdrawal is made.
