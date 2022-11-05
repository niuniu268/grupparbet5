package org.example;

import java.util.ArrayList;


import java.util.Scanner;


public class Administrator extends Users{

    private static final String username = "admin";
    private static final String password = "12345";

    public Administrator(ArrayList<ContactInformation> data) {
        super(data);
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }



    @Override
    public void questions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        switch (sc.nextLine()){
            case "1" ->
                this.add(data);

            case  "2" ->

                this.seekingQuestion(data);

            case "3" ->

                this.update(data);

            case "4" ->

                this.delete(data);

        }
    }



    public void delete(ArrayList<ContactInformation> data){

        list = super.freeSeek(data);

        System.out.println("Do you want to delete these data? Y or N");
        Scanner sc = new Scanner(System.in);

        if("Y".equals(sc.nextLine())){
            data.removeAll(list);
        }
    }

    public void update(ArrayList<ContactInformation> data) {


        list = super.freeSeek(data);
        System.out.println("=========================================");
        System.out.println("Do you want to update the first line? Y/N");
        System.out.println("=========================================");
        System.out.println();
        System.out.println("Follow information will be updated:");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();

        if(!list.isEmpty() && "Y".equals(answer)){
            System.out.println(list.get(0).toString());
            ContactInformation elem = Users.getContactInformation();
            System.out.println(elem);
            data.forEach(s -> {
                    if (list.get(0).equals(s)){
                        s.setFirstname(elem.getFirstname());
                        s.setLastname(elem.getLastname());
                        s.setAge(elem.getAge());
                        s.setTelephone(elem.getTelephone());
                        s.setStreet(elem.getStreet());
                        s.setCity(elem.getCity());
                        s.setDoornum(elem.getDoornum());
                        s.setPostcode(elem.getPostcode());
                    }
            });

        }else{
            System.out.println("please use add new information");
        }
    }





}
