package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = 0;
        String result = "";


        String numberString;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please select a number: ");
        System.out.println("1. Residential Customer.");
        System.out.println("2. Business Customer.");

        System.out.println("\nEnter a number from the menu: ");
        number = scanner.nextInt();



            switch (number) {

                case 1:
                    String name = userInput("Enter your name: ");
                    String phone = userInput("Enter your telephone number: ");
                    result = Info(name, phone);

                    break;

                case 2:
                    String businessName = userInput("Enter the name of your business: ");
                    String businessContact = userInput("Enter the contact name of your business: ");
                    String businessPhone = userInput("Enter the telephone number of your business: ");
                    result = Info(businessName, businessContact, businessPhone);
                    break;

                default:
                    if (number > 2){

                          System.out.println("Please enter a valid number 1 or 2.");
                        }

            }

        System.out.println(result);


    }


    public static String Info(String name, String phone) {
        String info = "";
        String n = name;
        String p = phone;
        info = "Name: " + n + "\n" + "Telephone: " + p;
        return info;


    }

    public static String Info(String businessName,  String businessContact, String businessPhone) {
        String info = "";
        String bn = businessName;
        String bc = businessContact;
        String bp = businessPhone;
        info = "Business Name: " + bn + "\n" + "Business Contact Name: " + bc + "\n" + "Business Telephone: " + bp;
        return info;

    }

    public static String userInput(String number) {
        System.out.print(number);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}