package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Users implements Seek{

    public void questions(ArrayList<ContactInformation> data){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Search");
        switch (sc.nextLine()){
            case "1" -> {
                this.add(data);
            }
            case  "2" -> {
                System.out.println("create Seeking Questions");
                this.seekingQuestion(data);
            }
        }

    }

    public ArrayList<ContactInformation> add(ArrayList<ContactInformation> data){
        ContactInformation ci = new ContactInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("lastname");
        ci.setLastname(scanner.nextLine());
        System.out.println("firstname");
        ci.setFirstname(scanner.nextLine());

        /*finish add method*/

        data.add(ci);

        return data;


    };

    public void seekingQuestion(ArrayList<ContactInformation> data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which way do you want to search");
        System.out.println("1. Search by address");
        System.out.println("2. Search by firstname");
        System.out.println("3. Search by lastname");
        switch (scanner.nextLine()){
            case "1" -> {
                System.out.println("address:");
                String address = scanner.nextLine();
                this.addressSeek(data, address);
            }
            case "2" -> {
                System.out.println("firstname:");
                String firstname = scanner.nextLine();
                this.firstnameSeek(data, firstname);
            }
            case "3" -> {
                System.out.println("lastname:");
                String lastname = scanner.nextLine();
                this.lastnameSeek(data, lastname);
            }
        }

    }

    @Override
    public ArrayList<ContactInformation> addressSeek(ArrayList<ContactInformation> e, String s) {
        return null;
    }

    @Override
    public ArrayList<ContactInformation> firstnameSeek(ArrayList<ContactInformation> e, String s) {
        return null;
    }

    @Override
    public ArrayList<ContactInformation> lastnameSeek(ArrayList<ContactInformation> e, String s) {
        return null;
    }


}
