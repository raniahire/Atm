package bankingsystem2;

import java.util.Scanner;

public class Registration {
    private String username;
    private String password;
    private String confrimPassword;
    private String username1;
    private String password1;
    
    Operation operation = new Operation();

    Scanner sc = new Scanner(System.in);
    
    
    final public void ask()
    {
       System.out.print("Are you Existing User (Y/N) : ");
       char ans = sc.next().charAt(0);
       
        if (ans == 'y' || ans == 'Y') {
            logIn();
        }  
        else
        {
            signUp();
        }
    }
    
    final public void logIn()
    {        
        sc.nextLine();
        System.out.println("\n\t\t\tLogIn\n");
        System.out.print("Enter Username : ");
        username1 = sc.nextLine();
        System.out.print("Enter Password : ");
        password1 = sc.nextLine();
        
            if((username1.equals(username)) && (password1.equals(password)))
            {
                System.out.println("\n\t\tLogin Successfully");

            }
            
            else              
            {
                while ((!username1.equals(username)) && (!password1.equals(password)) ||(username1.equals(username)) && (!password1.equals(password)) ||(!username1.equals(username)) && (password1.equals(password))) {                    
                    System.out.println("username or password is invalid");
                    
                    System.out.print("Enter Username : ");
                    username1 = sc.nextLine();
                    System.out.print("Enter Password : ");
                    password1 = sc.nextLine();
                }
                
                System.out.println("\n\t\tLogin Successfully");
            }
        
        operation.mainMenu();
    }
    
    final public void signUp()
    {
        System.out.println("\n\t\t\tSignUp\n");
        System.out.print("Enter Username : ");
        sc.nextLine();
        username = sc.nextLine();
        operation.userDetails();
        System.out.print("Enter Password : ");
        password = sc.nextLine();        
        System.out.print("Confrim Password : ");
        confrimPassword = sc.nextLine();
        
        
        if(password.equals(confrimPassword))
        {
            System.out.println("\n\t\t\tUser Registered Successfully. Proceed to LogIn");
            logIn();
        }
        
        else
        {
            while ( !password.equals(confrimPassword)) {                
            System.out.print("Password Missmatched.\n Please Enter correct password again : ");
            confrimPassword = sc.nextLine();
            }
            
            System.out.println("\n\t\t\tUser Registered Successfully. Proceed to LogIn");
            logIn();
            
        }
    }
}
