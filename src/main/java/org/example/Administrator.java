package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Administrator extends Users{

    @Override
    public void questions(ArrayList<ContactInformation> data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        switch (sc.nextLine()){
            case "1" -> {
                this.add(data);
            }
            case  "2" -> {
                System.out.println("create Seeking Questions");
                this.seekingQuestion(data);
            }
            case "3" -> {
                System.out.println(" update");
                this.update(data);
            }
            case "4" -> {
                System.out.println("delete");
                this.delete(data);
            }
        }
    }

    public void delete(ArrayList<ContactInformation> data){

    }

    public void update(ArrayList<ContactInformation> data) {

    }



}
