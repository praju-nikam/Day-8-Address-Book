package com.java.bridgelabs.multipleAddressBook;

public class ContactPerson {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private long phoneNumber;
    private String emailId;

    ContactPerson(String firstName, String lastName, String address, String city, String state, int zipCode, long phoneNumber, String emailId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
    }

    ContactPerson(){
        this("","","","","",0,0,"");
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZip(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phone_number) {
        this.phoneNumber = phone_number;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String toString(){

        return "Person Details :  \tFirst name : "+this.firstName+ " \t Last name : "+this.lastName+
                " \t Address : " +this.address+ " \tCity : " +this.city+ " \t State : "
                +this.state+ " \tZipCode : " +this.zipCode+ " \tPhone Number : " +this.phoneNumber+ " \t Email Id : "+this.emailId;
    }
}