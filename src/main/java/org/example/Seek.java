package org.example;

import java.util.ArrayList;

public interface Seek {
    abstract ArrayList<ContactInformation> addressSeek(ArrayList<ContactInformation> e, String s );
    abstract ArrayList<ContactInformation> firstnameSeek(ArrayList<ContactInformation> e, String s);
    abstract ArrayList<ContactInformation> lastnameSeek(ArrayList<ContactInformation> e, String s);

}
