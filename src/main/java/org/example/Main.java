package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<ContactInformation> data = new ArrayList<>();
        data = InputFile.InputText();
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.println("Which account do you want to use?");
            System.out.println("1. Guest users");
            System.out.println("2. Administrator");
            switch (sc.nextLine()){
                case "1" -> {
                    GuestUsers gu = new GuestUsers();
                    gu.questions(data);

                }
                case "2" -> {
                    Administrator adm = new Administrator();
                    adm.questions(data);
                }
            }

        }




    }
}