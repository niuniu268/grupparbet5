package org.example;

import java.util.ArrayList;

public interface Seek {
    abstract void addressSeek(ArrayList<ContactInformation> e);
    abstract void firstnameSeek(ArrayList<ContactInformation> e);
    abstract void lastnameSeek(ArrayList<ContactInformation> e);
    abstract void freeSeek(ArrayList<ContactInformation> e);

}
