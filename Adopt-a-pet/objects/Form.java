package objects;

import java.util.Scanner;

public class Form {
  private String applicantName;
  private String address;
  private String phoneNumber;

  public Form() {
    // Do Nothing
  }

  // Getters and Setters
  public String getApplicantName() {
    return applicantName;
  }

  public void setApplicantName(String applicantName) {
    this.applicantName = applicantName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  // Method to fill the form
  public void fillForm(Scanner input) {
    System.out.println("Enter your name: ");
    this.applicantName = input.nextLine();
    System.out.println("Enter your address: ");
    this.address = input.nextLine();
    System.out.println("Enter your phone number: ");
    this.phoneNumber = input.nextLine();
  }
}
