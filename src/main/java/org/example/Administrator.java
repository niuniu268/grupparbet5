package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;

public class Administrator extends Users{

    @Override
    public void questions(ArrayList<ContactInformation> data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Search");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        switch (sc.nextLine()){
            case "1" ->
                this.add(data);

            case  "2" -> {
                System.out.println("create Seeking Questions");
                this.seekingQuestion(data);
            }
            case "3" -> {
                System.out.println(" update");
//                this.update(data);
            }
            case "4" -> {
                System.out.println("delete");
//                this.delete(data);
            }
        }
    }

/*
    public void delete(ArrayList<ContactInformation> data){


        System.out.println("Do you want to delete these data? Y or N");
        Scanner sc = new Scanner(System.in);

        if("Y".equals(sc.nextLine())){
            data.removeAll(deleteList);
        }

    }

    public void update(ArrayList<ContactInformation> data) {


        ArrayList<ContactInformation> updateList = super.freeSeek(data);
        if(updateList!=null){
            System.out.println(updateList.get(0).toString());
            ContactInformation elem = Users.getContactInformation();
            System.out.println(elem);
            data.forEach(s -> {
                    if (updateList.get(0).equals(s)){
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
            System.out.println("please use add function");
        }
    }
*/



}
