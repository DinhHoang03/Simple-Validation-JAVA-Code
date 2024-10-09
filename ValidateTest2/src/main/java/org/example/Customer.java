package org.example;

public class Customer {

    private String customerId;
    private String fullName;
    private String address;

    //Default constructor
    public Customer() {

    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        if(customerId == null || customerId.trim().isEmpty()) {
            throw new IllegalArgumentException("customerId cannot be null or empty");
        }else{
            System.out.println("Your customer id: " + customerId + " succesfully added");
            this.customerId = customerId;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if(fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("fullName cannot be null or empty");
        }else {
            System.out.println("Your full name: " + fullName + " succesfully added");
            this.fullName = fullName;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("address cannot be null or empty");
        }else{
            System.out.println("Your address: " + address + " succesfully added");
            this.address = address;
        }
    }

    @Override
    public String toString() {
        return "This is a customer " + customerId + " and " + fullName + " at " + address;
    }
}
