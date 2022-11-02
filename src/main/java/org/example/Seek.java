package org.example;

import java.util.ArrayList;
import java.util.List;

public interface Seek {
    abstract void addressSeek(ArrayList<ContactInformation> e);
    abstract void firstnameSeek(ArrayList<ContactInformation> e);
    abstract void lastnameSeek(ArrayList<ContactInformation> e);
    abstract List<ContactInformation> freeSeek(ArrayList<ContactInformation> e);

}
