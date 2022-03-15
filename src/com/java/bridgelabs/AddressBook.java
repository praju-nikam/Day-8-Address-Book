package com.java.bridgelabs;

import java.util.Scanner;

public class AddressBook
{
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*-*-*-*-*- Welcome To AddressBook -*-*-*-*-*");
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("1. Add New Contacts \n 2. Edit Contacts \n 3. Delete Contacts \n 4. Display Contacts ");
            System.out.println(" Please Select the Option");
            choice = addressBook.scanner.nextInt();

            switch (choice) {
                case 1:
                    // Adding new Contacts
                    addressBook.addNewContacts();
                    break;
                case 2:
                    // Edit  Contacts
                    addressBook.editContacts();
                    break;

                case 3:
                    // Delete  Contacts
                    addressBook.deleteContacts();
                    break;

                case 4:
                    // Display  Contacts
                    addressBook.displayContacts();
                    break;

                default:
                    System.out.println("Please Enter the Option 1 to 4");
                    break;

            }
        }
        while (choice != 4) ;
    }

    // Create Contacts Object for Getter & Setter method
    Contacts contacts = new Contacts();

    // Add New contacts to AddressBook
    public void addNewContacts()
    {
        System.out.println("Enter Contacts Details : ");
        System.out.println("Enter First Name : ");
        contacts.setFirstName(scanner.next());
        System.out.println("Enter Last Name : ");
        contacts.setLastName(scanner.next());
        System.out.println("Enter The Address : ");
        contacts.setAddress(scanner.next());
        System.out.println("Enter the City : ");
        contacts.setCity(scanner.next());
        System.out.println("Enter the State : ");
        contacts.setState(scanner.next());
        System.out.println("Enter the Zip Code : ");
        contacts.setZip(scanner.next());
        System.out.println("Enter the Phone Number : ");
        contacts.setPhoneNo(scanner.next());
        System.out.println("Enter the Email Id : ");
        contacts.setEmailId(scanner.next());

    }
    // Display the Contacts Details
    public void displayContacts()
    {
        if(contacts.getFirstName() == null)
        {
            System.out.println("Contact Details Not Available");
        }
         else
        {
            System.out.println("Contact Details : ");
            System.out.println("First Name : " +contacts.getFirstName());
            System.out.println("Last Name : " +contacts.getLastName());
            System.out.println("Address : " +contacts.getAddress());
            System.out.println("City : " +contacts.getAddress());
            System.out.println("State : " +contacts.getState());
            System.out.println("Zip Code : " +contacts.getZip());
            System.out.println("Phone Number : " +contacts.getPhoneNo());
            System.out.println("Email Id : " +contacts.getEmailId());
        }
    }

    // Edit the Existing Contacts
    public  void editContacts()
    {
        // First name to Edit the Contact
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();

        // check the user with First name
        if(! firstName.equalsIgnoreCase(contacts.getFirstName()))
        {
            System.out.println("Entered Contact Name is Not Available in Address Book");
        }
        else
        {
            System.out.println("Enter the First Name : ");
            contacts.setFirstName(scanner.next());
            System.out.println("Enter the Last Name : ");
            contacts.setLastName(scanner.next());
            System.out.println("Enter the Address : ");
            contacts.setAddress(scanner.next());
            System.out.println("Enter the city : ");
            contacts.setCity(scanner.next());
            System.out.println("Enter the State : ");
            contacts.setState(scanner.next());
            System.out.println("Enter the Zip Code : ");
            contacts.setZip(scanner.next());
            System.out.println("Enter the Phone Number : ");
            contacts.setPhoneNo(scanner.next());
            System.out.println("Enter the Email Id : ");
            contacts.setEmailId(scanner.next());
        }
    }

    //  Delete the user Contact with First Name
    public void deleteContacts()
    {
        // get first Name to Delete the Contacts
        System.out.println("Enter the First Name : ");
        String firstName = scanner.next();
        if(! firstName.equalsIgnoreCase(contacts.getFirstName()))
        {
            System.out.println("Entered Contact Name is Not Available");
        }
        else
        {
            contacts.setFirstName(null);
            contacts.setLastName(null);
            contacts.setAddress(null);
            contacts.setCity(null);
            contacts.setState(null);
            contacts.setZip(null);
            contacts.setPhoneNo(null);
            contacts.setEmailId(null);

        }
    }
}
