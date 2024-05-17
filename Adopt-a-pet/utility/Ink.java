package utility;

import objects.Shelter;
import objects.User;
import objects.Form;
import objects.Pet;

import java.util.Scanner;
import java.util.ArrayList;

public class Ink {
  private Scanner input = new Scanner(System.in);
  private int choice;

  // ANSI color codes for styling
  private final String ANSI_RESET = "\u001B[0m";
  private final String ANSI_CYAN = "\u001B[36m";
  private final String ANSI_YELLOW = "\u001B[33m";
  private final String ANSI_GREEN = "\u001B[32m";
  private final String ANSI_RED = "\u001B[31m";
  private final String ANSI_BLUE = "\u001B[34m";
  private final String ANSI_PURPLE = "\u001B[35m";

  public void printWelcome() {
    System.out.println(ANSI_PURPLE + """
                                         /^ ^\\
                                        / 0 0 \\
                                        V\\ Y /V
                                      / - \\
                                       /    |
                                      V__) ||
        """ + ANSI_RESET);
    System.out.println(ANSI_GREEN + """
           _       _             _                               _
           / \\   __| | ___  _ __ | |_       __ _       _ __   ___| |_
          / _ \\ / _` |/ _ \\| '_ \\| __|____ / _` |_____| '_ \\ / _ \\ __|
         / ___ \\ (_| | (_) | |_) | ||_____| (_| |_____| |_) |  __/ |_
        /_/   \\_\\__,_|\\___/| .__/ \\__|     \\__,_|     | .__/ \\___|\\__|
                           |_|                        |_|
         """);

  } // printWelcome()

  public void printGoodday() {
    System.out.println(ANSI_PURPLE + "Have a great day, pet lover!" + ANSI_RESET);
    System.out.println(ANSI_YELLOW + """
             '
            \\  ,  /
         ' ,___/_\\___, '
           \\ /o.o\\ /
        -=   > \\_/ <   =-
            /_\\___/_\\
        . `   \\ /   ` .
             /  `  \\
               .
         """ + ANSI_RESET);
  } // printGoodDay()

  public int validateMainMenu() {
    boolean valid = false;

    while (!valid) {
      System.out.println("\n" + ANSI_RED + "##### MAIN MENU #####" + ANSI_RESET);
      System.out.println(
          "  " + ANSI_BLUE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "|       " + ANSI_RESET + ANSI_YELLOW + "(1) View Pets" + ANSI_RESET + ANSI_BLUE
              + "        |" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "|       " + ANSI_RESET + ANSI_GREEN + "(2) Shelter Details" + ANSI_RESET + ANSI_BLUE
              + "   |" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "|    " + ANSI_RESET + ANSI_PURPLE + "(3) Book Appointment" + ANSI_RESET + ANSI_BLUE
              + "   |" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "|  " + ANSI_RESET + ANSI_CYAN + "(4) Contact Us" + ANSI_RESET + ANSI_BLUE
              + "            |" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "|            " + ANSI_RESET + ANSI_RED + "(5) Exit" + ANSI_RESET + ANSI_BLUE
              + "             |" + ANSI_RESET + "\n" +
              "  " + ANSI_BLUE + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
      try {
        choice = input.nextInt();
        if (choice >= 1 && choice <= 5) {
          valid = true;
        } else {
          System.out.println(ANSI_RED + "Please enter a number between 1 and 5." + ANSI_RESET);
        }
      } catch (Exception e) {
        System.out.println(ANSI_RED + "That's not a number!" + ANSI_RESET);
      } finally {
        input.nextLine();
      }
    }
    return choice;
  } // validateMainMen

  public void printPetDetails(Pet pet) {
    System.out.println(ANSI_PURPLE + "╔═══════════════════════╗" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "║      Pet Details      ║" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "╚═══════════════════════╝" + ANSI_RESET);
    System.out.printf(ANSI_BLUE + "Name: " + ANSI_RESET + "%s\n", pet.getName());
    System.out.printf(ANSI_BLUE + "Age: " + ANSI_RESET + "%d\n", pet.getAge());
    System.out.printf(ANSI_BLUE + "Breed: " + ANSI_RESET + "%s\n", pet.getBreed());
    System.out.printf(ANSI_BLUE + "Color: " + ANSI_RESET + "%s\n", pet.getColor());
    System.out.printf(ANSI_BLUE + "Owner: " + ANSI_RESET + "%s\n", pet.getOwner());
    System.out.printf(ANSI_BLUE + "Is Adopted: " + ANSI_RESET + "%b\n", pet.getIsAdopted());
    System.out.println(ANSI_YELLOW + "Adopt this pet? Y/N" + ANSI_RESET);
  } // printPetDetails()

  public void printAvailablePets(ArrayList<Pet> pets) {
    System.out.println(ANSI_BLUE + "╔══════════════════════════════════════╗" + ANSI_RESET);
    System.out.println(ANSI_BLUE + "║          Available Pets              ║" + ANSI_RESET);
    System.out.println(ANSI_BLUE + "╚══════════════════════════════════════╝" + ANSI_RESET);
    for (int i = 0; i < pets.size(); i++) {
      if (!pets.get(i).getIsAdopted()) {
        System.out.printf("(%d) Name: %s Type: %s Age: %d\n", i + 1,
            pets.get(i).getName(), pets.get(i).getType(), pets.get(i).getAge());
      }
    }
    System.out.println(ANSI_YELLOW + "Enter 0 to go back" + ANSI_RESET);
  } // printAvailablePets()

  public void printShelterDetails(Shelter shelter) {
    System.out.println(ANSI_GREEN + "╔════════════════════════════════╗" + ANSI_RESET);
    System.out.println(ANSI_GREEN + "║        Shelter Details         ║" + ANSI_RESET);
    System.out.println(ANSI_GREEN + "╚════════════════════════════════╝" + ANSI_RESET);
    System.out.printf(ANSI_BLUE + "Shelter Address: " + ANSI_RESET + "%s\n", shelter.getAddress());
    String[] hours = shelter.getHours();
    for (int i = 0; i < hours.length; i++) {
      System.out.println(hours[i]);
    }
    System.out.println(ANSI_CYAN + "Press any key to go back" + ANSI_RESET);
  } // printShelterDetails()

  public void bookAppointment(User user) {
    try {
      System.out.println(ANSI_PURPLE + "╔════════════════════════╗" + ANSI_RESET);
      System.out.println(ANSI_PURPLE + "║    Book Appointment    ║" + ANSI_RESET);
      System.out.println(ANSI_PURPLE + "╚════════════════════════╝" + ANSI_RESET);
      System.out.println("Please select a day of the week:");
      System.out.println("1. " + ANSI_CYAN + "Monday" + ANSI_RESET + "\n" +
          "2. " + ANSI_CYAN + "Tuesday" + ANSI_RESET + "\n" +
          "3. " + ANSI_CYAN + "Wednesday" + ANSI_RESET + "\n" +
          "4. " + ANSI_CYAN + "Thursday" + ANSI_RESET + "\n" +
          "5. " + ANSI_CYAN + "Friday" + ANSI_RESET);

      int day = input.nextInt();

      if (day < 1 || day > 5) {
        System.out.println(ANSI_RED + "Invalid day selection. Please choose 1 - 5 (Monday - Friday)" + ANSI_RESET);
        return;
      }

      user.setAppointmentDay(day);
      System.out
          .println(ANSI_GREEN + "Congratulations!!! Your appointment is booked for " + getDayOfWeek(day) + ANSI_RESET);
    } catch (Exception e) {
      System.out.println(ANSI_RED + "Oops!!! Error: " + e.getMessage() + ANSI_RESET);
    } finally {
      input.nextLine();
    }
  } // bookAppointment()

  private String getDayOfWeek(int day) {
    switch (day) {
      case 1:
        return ANSI_CYAN + "Monday" + ANSI_RESET;
      case 2:
        return ANSI_CYAN + "Tuesday" + ANSI_RESET;
      case 3:
        return ANSI_CYAN + "Wednesday" + ANSI_RESET;
      case 4:
        return ANSI_CYAN + "Thursday" + ANSI_RESET;
      case 5:
        return ANSI_CYAN + "Friday" + ANSI_RESET;
      default:
        return "";
    }
  } // getDayOfWeek()

  public void fillForm(Form form) {
    form.fillForm(input);
  } // fillForm()

  public void printForm(Form form) {
    System.out.println(ANSI_PURPLE + "╔══════════════════════════════╗" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "║        Form Details          ║" + ANSI_RESET);
    System.out.println(ANSI_PURPLE + "╚══════════════════════════════╝" + ANSI_RESET);
    System.out.println(ANSI_BLUE + "Applicant Name: " + ANSI_RESET + form.getApplicantName());
    System.out.println(ANSI_BLUE + "Address: " + ANSI_RESET + form.getAddress());
    System.out.println(ANSI_BLUE + "Phone Number: " + ANSI_RESET + form.getPhoneNumber());
    System.out.println(ANSI_GREEN + "Thank you for contacting us. We will be with you shortly." + ANSI_RESET);
  } // printForm()

} // class