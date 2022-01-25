package bankingsystem2;

import java.util.Scanner;

public class Operation extends User {
    private long accountNumber = 32264209320l;
    private String ifscCode = "SBIN0001240";
    private double amount;
    private int id=1;
    private  Transactions transactions=new Transactions();
   
    Scanner sc = new Scanner(System.in); 
    
    public void userInformation()
    {
        System.out.println("Name : " + getFullName());
        System.out.println("Mobile Number : " + getMobileNumber());
        System.out.println("Email Id : " + getEmailId());
        System.out.println("Date Of Birth : " + getDateOfBirth());
        System.out.println("Age : " + getAge());
        System.out.println("Permanent Address : " + getPermanentAddress());
        System.out.println("Adhar Card Number : " + getAdharCardNumber());
        System.out.println("Account Number :" + accountNumber);
        System.out.println("IFSC Code :" + ifscCode);
        furtherProcess();
    }
    
    public void mainMenu()
    {
        System.out.println("\n\n\t\t\tSelect Options");
        System.out.println("Press 1 for Debit Details");
        System.out.println("Press 2 for Credit Details");
        System.out.println("Press 3 for View Transaction History");
        System.out.println("Press 4 for Search By Amount");
        System.out.println("Press 5 for View Account Balance");
        System.out.println("Press 6 for View User Details");
        System.out.println("Press 7 for Main Menu");
        System.out.println("Press 8 for Exit");
        
        System.out.print("Enter Key : ");
        int x = sc.nextInt();
        
        switch(x)
            {
                case 1:
                    debitDetails();
                    break;
                   
                case 2:
                    creditDetails();
                    break;
                 
                case 3:
                    viewTransactionHistory();
                    break;
                 
                case 4:
                    searchByAmount();
                    break;
                 
                case 5:
                    viewAccountBalance();
                    break;
                 
                case 6:
                    userInformation();
                    break;
                 
                case 7:
                    mainMenu();
                    break;
                 
                case 8:
                    exit();
                    break;
        }
    }
    
    public void debitDetails()
    {
        System.out.print("Enter Amount : ");
        amount = sc.nextLong();
        accountBalance = accountBalance - amount;
        System.out.println("Remaining Balance : "+accountBalance);
        
        transactions.updateTransaction(id, "Debit", amount);
        id++;
        furtherProcess();
    }
    
    public void creditDetails()
    {
        System.out.print("Enter Amount : ");
        amount = sc.nextLong();
        accountBalance = accountBalance + amount;
        System.out.println("Remaining Balance : "+accountBalance);
        transactions.updateTransaction(id, "Credit", amount);
        id++;
        furtherProcess();
    }
    
    public void searchByAmount()
    {
        System.out.print("Enter Amount : ");
        amount=sc.nextDouble();
        transactions.transactionSearch(amount);
        furtherProcess();
    }
    
    final public void viewTransactionHistory()
    {
        transactions.allTransactions();
        furtherProcess();
    }
    
    final public void viewAccountBalance()
    {
        
        System.out.println("Your Account balance is :" + accountBalance);
        furtherProcess(); 
    }

    public void exit()
    {
        System.out.println("Thanks For Visit In SBI");   
    }
    public void furtherProcess(){
        System.out.println("Press 1 for continue.");
        System.out.println("press any key for exit");
        sc.nextLine();
        String x=sc.nextLine();
        if(x.equals("1")){
           mainMenu();
        }
        else{
            exit();
        }
    }
}
