package model;

public class User {

    private int userId;

    private String fname;

    private String lname;

    private int contact;

    private String address;

    public User() {
        super();
    }


    public User(int userId, String fname, String lname, int contact, String address) {
        this.userId = userId;
        this.fname = fname;
        this.lname = lname;
        this.contact = contact;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", contact=" + contact
                + ", address=" + address + "]";
    }



}