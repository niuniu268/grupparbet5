package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFile {
    public static ArrayList<ContactInformation> InputText() {
        String filepath = "out.txt";

        ArrayList<ContactInformation> data;
        try (
                FileReader fr = new FileReader(filepath);
                BufferedReader br = new BufferedReader(fr)
        ) {

            data = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {

                String[] arr = new String[8];
                ContactInformation ci = new ContactInformation();
                arr = line.split(",");

                ci.setFirstname(arr[0]);
                ci.setLastname(arr[1]);
                ci.setAge(Integer.parseInt(arr[2]));
                ci.setTelephone(arr[3]);
                ci.setCity(arr[4]);
                ci.setStreet(arr[5]);
                ci.setDoornum(arr[6]);
                ci.setPostcode(arr[7]);

                data.add(ci);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

}
