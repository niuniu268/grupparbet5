package org.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Consumer;

public class OutputFile {

    public static void outputTextFile(ArrayList<ContactInformation> list) {

        String path = "database.txt";

        try (FileWriter fw = new FileWriter(path);
             BufferedWriter bw = new BufferedWriter(fw);

        ){
            list.forEach(new Consumer<ContactInformation>() {
                @Override
                public void accept(ContactInformation contactInformation) {
                    String s = contactInformation.getFirstname()+","+contactInformation.getLastname()
                            +","+contactInformation.getAge()+","+contactInformation.getTelephone()+","+
                            contactInformation.getCity()+","+contactInformation.getStreet()+","
                            +contactInformation.getDoornum()+","+contactInformation.getPostcode();

                    try {
                        bw.write(s);
                        bw.newLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            });



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

/*
                ci.setFirstname(arr[0]);
                        ci.setLastname(arr[1]);
                        ci.setAge(Integer.parseInt(arr[2]));
                        ci.setTelephone(arr[3]);
                        ci.setCity(arr[4]);
                        ci.setStreet(arr[5]);
                        ci.setDoornum(arr[6]);
                        ci.setPostcode(arr[7]);
                        */

