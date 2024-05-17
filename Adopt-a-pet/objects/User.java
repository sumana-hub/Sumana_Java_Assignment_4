package objects;

public class User {
  private String name;
  private String email;
  private int phone;
  private int appointmentDay;

  public User(String name, String email, int phone) {
    this.name = name;
    this.email = email;
    this.phone = phone;
  } // constructor

  // ===============>>
  // GETTERS
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public int getPhone() {
    return this.phone;
  }

  public int getAppointmentDay() {
    return this.appointmentDay;
  }

  // ===============>>
  // SETTERS
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(int phone) {
    this.phone = phone;
  }

  public void setAppointmentDay(int appointmentDay) {
    this.appointmentDay = appointmentDay;
  }
} // class