package data.model;

import java.util.List;

public class User {
    private int userId;
    private String firstName, lastName, phoneNumber, emailAddress, password;
    private List<Email> receivedMails;

    public List<Email> getReceivedMails() {
        return receivedMails;
    }

    public void setReceivedMails(List<Email> receivedMails) {
        this.receivedMails = receivedMails;
    }

    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", password='" + password + '\'' +
                ", userId=" + userId +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress (String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   // public User(int userId, String firstName, String lastName, String phoneNumber, String emailAddress, String password) {
   //     this.userId = userId;
    //    this.firstName = firstName;
    //    this.lastName = lastName;
    //    this.phoneNumber = phoneNumber;
     //   this.emailAddress = emailAddress;
      //  this.password = password;
    }
//}

