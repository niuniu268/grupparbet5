package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    protected static ArrayList<ContactInformation> data;

    public static void login(ArrayList<ContactInformation> data) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please input your username and password");
        System.out.println("username:");
        String un = scanner.nextLine();
        System.out.println("password:");
        String pw = scanner.nextLine();

        if(un.equals(Administrator.getUsername()) && pw.equals(Administrator.getPassword())){
            Administrator adm = new Administrator(data);
            adm.questions();
        }




    }
}
