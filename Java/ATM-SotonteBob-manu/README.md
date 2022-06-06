## Simple ATM Application
### Description:
You will be creating a basic ATM which will simply deposit or withdrawl money from a single users account. We will assume that the users account has nothing in it and either deposit or withdrawl money without allowing the user to have a negative balance.

*Please follow the steps below:*

### Steps:

1. Create a Scanner the will take in the user's input for the amount they would like to deposit/withdrawal (NEGATIVE values will count as withdrawals).
2. Create a value that starts the account balance at 0
3. Create statements that give instructions to the user. And another statement that returns their account balance.
4. Create a statment that informs the user to type "done" when they would like to exit the program.
5. Create a statment that states that when they try to withdrawal money that would modify the balance or inform the user that their account cannot be negative and don't modify the balance. 
6. Have the program reprint the beginning statements until the user types done.


#### Sample:
Input:
```
5.0
-7
10
```
Output:
```
Your balance is: 0.0
Please input your deposit/withdrawal amount (negative values count as withdrawal):
Please type done when transaction is complete or you want to exit
5.0
Your balance is: 5.0
Please input your deposit/withdrawal amount (negative values count as withdrawal):
-7
Your account can't have negative values
Your balance is: 5.0
Please input your deposit/withdrawal amount (negative values count as withdrawal):
10
Your balance is: 15.0
Please input your deposit/withdrawal amount (negative values count as withdrawal):

```