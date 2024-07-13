package com.student;

public class Address {
    private String area;
    private String landmark;
    private String city;
    private String pincode;

    public Address(String area, String landmark, String city, String pincode) {
        this.area = area;
        this.landmark = landmark;
        this.city = city;
        this.pincode = pincode;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address [area=" + area + ", landmark=" + landmark + ", city=" + city + ", pincode=" + pincode + "]";
    }
}
