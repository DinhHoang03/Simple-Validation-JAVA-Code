package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Customer> customers = new ArrayList<Customer>();

        boolean back = false;

        while(!back) {

            Customer cus = new Customer();
            boolean valid = false;

            System.out.println("----------------Menu---------------");
            //Validate user ID input
            //This is a do while loop validate(run at least once before checking the condition inside a loop)
            do {
                try {
                    System.out.println("Please enter your customer ID:");
                    cus.setCustomerId(sc.nextLine());
                    valid = true;

                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }while(!valid);

            //Validate userFullName
            //This is a while loop validate(Alway checking condition before running this block of code)
            while(true){
                try{
                    System.out.println("Please enter your name here:");
                    cus.setFullName(sc.nextLine());
                    break;
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }

            //Validate userAddress
            //This is a do while loop validation

            do {
                valid = false;
                try{
                    System.out.println("Please enter your address here:");
                    cus.setAddress(sc.nextLine());
                    valid = true;
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }while(!valid);

            /**
             * So which one is more usefull? Do while or while
             * Its really depend on your logic that apply to your input for user.
             * If you first check the input then use while loop
             * If you need to run it at least once before cheking the condition then use do while is perfect for you
             * Validation is very importain since you have to check user input before pushing user data into database
             * This thing can help you get avoid SQL Injection since you need to security your own database with thousand or milion of user data!
             */
            //Add customer
            customers.add(cus);

            System.out.println("Would you like to continue? (y/n)");
            String input = sc.next().toLowerCase();
            if(input.equals("n")) {
                back = true;
                System.out.println("You are out of the loop!");
            }
        }

        for(Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}