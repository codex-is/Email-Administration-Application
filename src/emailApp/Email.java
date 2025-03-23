package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;

    //constructor to recieve the first and last name
    public Email(String firstName,String lastName){
        //this keyword refers to class level variable (above)
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("email created :"+this.firstName+" "+this.lastName);

        //call a method asking for department & return department
        this.department = setDepartment();
        System.out.println("Department:" +" "+this.department);

        //call a methods that returns random password
        this.password = randomPass(defaultPasswordLength);
        System.out.println("Your password is: "+this.password);

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
        String passSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*?~";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int random = (int)(Math.random() * passSet.length());
            password[i] =  passSet.charAt(random);
        }
        return new String(password);
    }
    //set mailbox capacity
    //set alternate email
    //change password
}
