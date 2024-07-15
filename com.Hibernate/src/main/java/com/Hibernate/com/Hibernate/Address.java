package com.Hibernate.com.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    @Column(name = "address_id")
    private int addressId;

    @Column(name = "city", nullable = false, length = 50)
    private String city;

    @Column(name = "location", length = 100)
    private String location;

    // Required no-argument constructor
    public Address() {
    }

    public Address(int addressId, String city, String location) {
        this.addressId = addressId;
        this.city = city;
        this.location = location;
    }

    // Getters and setters

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
