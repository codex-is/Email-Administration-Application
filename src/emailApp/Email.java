package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "company.com";

    //constructor to recieve the first and last name
    public Email(){
        //this keyword refers to class level variable (above)
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your Firstname: ");
        this.firstName = name.nextLine();
        System.out.println("Enter your Lastname: ");
        this.lastName = name.nextLine();
        System.out.println("email created :"+this.firstName+" "+this.lastName);

        //call a method asking for department & return department
        this.department = setDepartment();
        System.out.println("Department:" +" "+this.department);

        //call a methods that returns random password
        this.password = randomPass(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

        //combine elements thet returns email
        email = firstName.toLowerCase() + lastName.toLowerCase()+"@"+department+"."+ companySuffix;
        System.out.println("Your email is: "+ email);


    }
    //ask for the department
    private String setDepartment(){
        System.out.println("Enter your Department \n1 for Sales\n2 for Developement \n3 for Accounting");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice){
            case 1:
                return "Sales";
            case 2:
                return "Developement";
            case 3:
                return "Accounting";
            default:
                return "Invalid choice";
        }

    }
    //generate random password
    private String randomPass(int length){
        String passSet = "abcdefghijklmnopqrstuvwxyz1234567890!@#$%&*";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int random = (int)(Math.random() * passSet.length());
            password[i] =  passSet.charAt(random);
        }
        return new String(password);
    }
    //set mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //change password
    public void changePassword(String password){
        this.password = password;
    }
}
