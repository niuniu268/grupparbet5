package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContactInformation> data = new ArrayList<>();
//        data = InputFile.InputText();

        ContactInformation ci1 = new ContactInformation("louis","han",23,"123456","malmo","lundsgatan","21188","12");
        ContactInformation ci2 = new ContactInformation("hongwei","wang",45,"23456","stockholm","varvsgatan","1111","12");
        ContactInformation ci3 = new ContactInformation("dog","cat",66,"123456","goteborg","lundsgatan","21188","12");
        ContactInformation ci4 = new ContactInformation("dog","cat",66,"123456","louis","lundsgatan","21188","12");
        data.add(ci1);
        data.add(ci2);
        data.add(ci3);
        data.add(ci4);


        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Which account do you want to use?");
            System.out.println("1. Guest users");
            System.out.println("2. Administrator");
            System.out.println("3. quit");
            switch (sc.nextLine()){
                case "1" -> {
                    GuestUsers gu = new GuestUsers();
                    gu.questions(data);

                }
                case "2" -> {
                    Administrator adm = new Administrator();
                    adm.questions(data);
                }
                case "3" ->{
                    System.exit(0);
                }
            }

        }




    }
}