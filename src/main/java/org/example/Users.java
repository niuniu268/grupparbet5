package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Users implements Seek{

    protected ArrayList<ContactInformation> data;

    public Users(ArrayList<ContactInformation> data) {
        this.data = data;
    }

    List<ContactInformation> list;

    public  void questions(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Search");
        switch (sc.nextLine()){
            case "1" ->
                this.add(data);

            case  "2" -> {
                System.out.println("create Seeking Questions");
                this.seekingQuestion(data);
            }
        }

    }

    public ArrayList<ContactInformation> add(ArrayList<ContactInformation> data){
        ContactInformation ci = getContactInformation();

        data.add(ci);

        showSearchedItem(data);

        return data;

    }



    protected static ContactInformation getContactInformation() {
        ContactInformation ci = new ContactInformation();
        Scanner scanner = new Scanner(System.in);
        System.out.println("firstname");
        ci.setFirstname(scanner.nextLine().toLowerCase());
        System.out.println("lastname");
        ci.setLastname(scanner.nextLine().toLowerCase());
        System.out.println("age");
        ci.setAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("telphone number");
        ci.setTelephone(scanner.nextLine());
        System.out.println("city");
        ci.setCity(scanner.nextLine().toLowerCase());
        System.out.println("street");
        ci.setStreet(scanner.nextLine().toLowerCase());
        System.out.println("postcode");
        ci.setPostcode(scanner.nextLine());
        System.out.println("door num");
        ci.setDoornum(scanner.nextLine());
//        firstname + "," + lastname + "," + age + "," + telephone + "," + city + "," + street + "," + postcode + "," + doornum;
        /*finish add method*/

        System.out.println("the new data:" + ci);
        return ci;
    }


    public void seekingQuestion(ArrayList<ContactInformation> data){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which way do you want to search");
        System.out.println("1. Search by address");
        System.out.println("2. Search by firstname");
        System.out.println("3. Search by lastname");
        System.out.println("4. Free searching");
        switch (scanner.nextLine()){
            case "1" ->

                this.addressSeek(data);

            case "2" ->

                this.firstnameSeek(data);

            case "3" ->

                this.lastnameSeek(data);

            case "4" ->

                 list = this.freeSeek(data);

        }

    }

    @Override
    public void addressSeek(ArrayList<ContactInformation> e) {

        Scanner sc = new Scanner(System.in);
        System.out.println("address:");
        ContactInformation ci = new ContactInformation();
        ci.setStreet(sc.nextLine().toLowerCase());
        List<ContactInformation> list = e.stream().filter(s -> ci.getStreet().equals(s.getStreet())).toList();
        showSearchedItem(list);

    }

    @Override
    public void firstnameSeek(ArrayList<ContactInformation> e) {
        Scanner sc = new Scanner(System.in);
        System.out.println("firstname:");
        ContactInformation ci = new ContactInformation();
        ci.setFirstname(sc.nextLine().toLowerCase());
        List<ContactInformation> list = e.stream()
                .filter(s -> ci.getFirstname().equals(s.getFirstname()))
                .toList();

        if(list.isEmpty()){
            System.out.println("we cannot find the information which you want to search. please try again");
        } else{
            System.out.println(list.get(0).toString());
        }


    }

    @Override
    public void lastnameSeek(ArrayList<ContactInformation> e) {

        Scanner sc = new Scanner(System.in);
        System.out.println("lastname:");
        ContactInformation ci = new ContactInformation();
        ci.setLastname(sc.nextLine().toLowerCase());
        List<ContactInformation> list = e.stream().filter(s -> ci.getLastname().equals(s.getLastname())).toList();
        showSearchedItem(list);

    }

    @Override
    public List<ContactInformation> freeSeek(ArrayList<ContactInformation> e) {

        Scanner sc = new Scanner(System.in);
        System.out.println("what do you want to search:");
        String search = sc.nextLine().toLowerCase();
        List<ContactInformation> list = e.stream().filter(s -> s.toString().contains(search)).toList();
        showSearchedItem(list);
        return list;
    }

    private void showSearchedItem(List<ContactInformation> list){
        if(list.isEmpty()){
            System.out.println("we cannot find the information which you want to search. please try again");
        }else {
            list.forEach(System.out::println);
        }


    }


}
