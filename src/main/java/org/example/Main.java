package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContactInformation> data = new ArrayList<>();

        data = InputFile.InputText();

/*        ContactInformation ci1 = new ContactInformation("hongwei","han",23,"123456","malmo","lundsgatan","21188","12");
        ContactInformation ci2 = new ContactInformation("louis","wang",45,"23456","stockholm","varvsgatan","1111","12");
        ContactInformation ci3 = new ContactInformation("tiger","cat",66,"123456","goteborg","lundsgatan","21188","12");
        ContactInformation ci4 = new ContactInformation("dog","cat",99,"123456","louis","lundsgatan","21188","12");


        Collections.addAll(data, ci1, ci2, ci3, ci4);
        */




        Scanner sc = new Scanner(System.in);


        loop: while (true){
            System.out.println("Which account do you want to use?");
            System.out.println("1. Guest users");
            System.out.println("2. Administrator");
            System.out.println("3. quit");
            switch (sc.nextLine()){
                case "1" -> {

                    GuestUsers gu = new GuestUsers(data);
                    gu.questions();

                }
                case "2" -> {
                    Login.login(data);

                }
                case "3" ->{
                    OutputFile.outputTextFile(data);
                    break loop;
                }
            }

        }




    }
}