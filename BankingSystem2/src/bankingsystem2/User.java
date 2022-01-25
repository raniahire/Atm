package bankingsystem2;

import java.util.Scanner;

public class User {
    private String fullName;
    private String mobileNumber;
    private String dateOfBirth;
    private int age;
    private String gender;
    private String permanentAddress;
    private String adharCardNumber;
    private String emailId;
    private double accountOpeningAmount;
    protected double accountBalance;
    
    Scanner sc = new Scanner(System.in);
    
    public void userDetails()
    {
        System.out.print("Enter Full Name : ");
        fullName = sc.nextLine();
        System.out.print("Enter Mobile Number(Only use 10 digit no dont use +91,+1 etc) : ");
        mobileNumber = sc.next();
        if (mobileNumber.matches("[0-9]{10}"))
        {   
        }
        else
        {
            System.out.print("Invalid Mobile Number.Re-Enter Mobile Number : ");
            while (!mobileNumber.matches("[0-9]{10}"))
            {                
               mobileNumber = sc.next();
            }
              
        }
        System.out.print("Enter Email ID : ");
        sc.nextLine();
        emailId = sc.nextLine();
        System.out.print("Enter Date Of Birth : ");
        dateOfBirth = sc.nextLine();
        System.out.print("Enter Age(In numbers) : ");
        age = sc.nextInt();
        if (age>18)
        {
        }
        else
        {
            System.out.println("You are not Eligible for Opening Amount.");
            System.exit(0);
        }
        System.out.print("Enter Gender : ");
        sc.nextLine();
        gender = sc.nextLine();
        System.out.print("Enter Permanent Address : ");
        permanentAddress = sc.nextLine();
        
        //Adhar Card Number Validation
        
        System.out.print("Enter Adhar Card Number(Only 12 digit number) : ");
        adharCardNumber = sc.nextLine();
        if (adharCardNumber.matches("[0-9]{12}"))
        {   
        }
        else
        {
            System.out.print("Invalid Adhar Card Number.Re-Enter Adhar Card Number : ");
            while (!adharCardNumber.matches("[0-9]{12}"))
            {                
               adharCardNumber = sc.nextLine();
            }
              
        }
        System.out.print("Enter Account Opening Amount(Greater than or equal to 10,000) : ");
        accountOpeningAmount = sc.nextDouble();
        
        if (accountOpeningAmount>=10000) {            
        }
        
        else
        {
            while (accountOpeningAmount<10000) {            
                System.out.println("Your amount is less than 10,000. Please Enter Greater than or equal to 10,000 :");
                accountOpeningAmount = sc.nextDouble();
            }
        }
        accountBalance=accountOpeningAmount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getAdharCardNumber() {
        return adharCardNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getAccountOpeningAmount() {
        return accountOpeningAmount;
    }

    public void setAccountOpeningAmount(double accountOpeningAmount) {
        this.accountOpeningAmount = accountOpeningAmount;
    }   
}
