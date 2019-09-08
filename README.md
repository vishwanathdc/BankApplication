# BankApplication
1. This project demonstrates a BankApplication using Java.
2. This Application provides functionalities such as deposit, withdraw, check balance, previous transaction.
3. The **BankAccountInterface interface** is a contract and declares showMenu method.
4. BankAccount class implements BankAccountInterface and defines the above method along with deposit, withdraw, check balance, previousTransaction methods.
5. Here I have used **Getters and Setters** for variables customerName, customerID, balance, previousTransaction as a layer of encapsulation
6. The **encapsulation** is provided thinking in future the value of customerIDs or balance(if interest is added with balance) may change.
7. I have used **Factory method pattern** to create objects of BankAccount. This avoids the direct use of BankAccount constructor. This also helps in validation of input and establishing connection between publisher and ubscriber for Observer pattern.
8. I have used **Observer pattern**, here the observer interface listens to the changes in class BankAccount and sends notifications whenever deposit/withdrawal is made.
9. The subscriber is an **abstract class**, it is extended by EmailSubscriber and SmsSubscriber to have their **own definition of display method** which is an abstract method in Subscriber class.
8. BankAccountFactory setInput method generates the BankAccount object only if customerName, customerID, amount, notificationType is not empty.
9. Finally in the main class BankApplication, I create an object of BankAccountFactory and use method setinput(customerName, customerID, amount, notificationType)
10. The setInput method returns an object of BankAccount.
11. Here the user does not care about the implmentation of BankAccount, he is only concerned about using methods declared in interface.
12. Testing: I have used **JUnit Testing** to test deposit, withdrawal, checkBalance, previousTransaction methods of BankAccount class.

