package org.example;

import java.util.Objects;

public class ContactInformation {
    private String firstname;
    private String lastname;
    private int age;
    private String telephone;
    private String city;
    private String street;
    private String postcode;
    private String doornum;


    public ContactInformation() {
    }

    public ContactInformation(String firstname, String lastname, int age, String telephone, String city, String street, String postcode, String doornum) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.telephone = telephone;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.doornum = doornum;
    }

    /**
     * 获取
     * @return firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * 设置
     * @param firstname
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 获取
     * @return lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * 设置
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取
     * @return postcode
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * 设置
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * 获取
     * @return doornum
     */
    public String getDoornum() {
        return doornum;
    }

    /**
     * 设置
     * @param doornum
     */
    public void setDoornum(String doornum) {
        this.doornum = doornum;
    }

    public String toString() {
        return  firstname + "," + lastname + "," + age + "," + telephone + "," + city + "," + street + "," + postcode + "," + doornum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactInformation that = (ContactInformation) o;
        return age == that.age && Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(telephone, that.telephone) && Objects.equals(city, that.city) && Objects.equals(street, that.street) && Objects.equals(postcode, that.postcode) && Objects.equals(doornum, that.doornum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, telephone, city, street, postcode, doornum);
    }
}
