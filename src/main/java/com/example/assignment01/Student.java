package com.example.assignment01;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> favouriteActivities = new ArrayList<String>();

    /*
    The constructor
     */
    public Student(String firstName, String lastName, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        this.studentNumber = studentNumber;

    }


    /*
        This method returns the firstname
    */

    public String getFirstName() {
        return firstName;
    }

/**
    This method sets the instance variable this.firstName to whatever the user passes as an argument for the firstName.
    It will capitalize the first letter of the firstname provided, remove white spaces, and also check to see if its length is greater or equal to 2.
 */
    public void setFirstName(String firstName) {
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        firstName = firstName.trim();

        if (firstName.length() >= 2)
             this.firstName = firstName;


     else
         throw new IllegalArgumentException("The first name has to be greater than 2 letters");

    }

    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        lastName = lastName.trim();

        if (lastName.length() >= 2)
            this.lastName = lastName;

        else
            throw new IllegalArgumentException("The last name has to be greater than 2 letters");
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    /**
    This method will set the instance variable this.studentNumber only if its in the range of 1000000 -> 9999999.
     */
    public void setStudentNumber(int studentNumber) {

      if (studentNumber > 010000000 && studentNumber < 999999999)
          this.studentNumber = studentNumber;

      else
          throw new IllegalArgumentException("The student number is not in the range of 010000000 -> 999999999. ");
    }

    public ArrayList<String> getFavouriteActivities() {
        return favouriteActivities;
    }

    public void setFavouriteActivities(ArrayList<String> favouriteActivities) {

        this.favouriteActivities = favouriteActivities;
    }

@Override
    public String toString() {
        return "Firstname: " + firstName + " Lastname: " + lastName + " StudentNumber: " + studentNumber;
    }

    /**
        This method adds the students favourite activities to a list called favouriteActivities. If the activity contains a number, it will throw an error.
     */
public void activities (String activities)
  {
    for (int i = 0; i < activities.length(); i++)
    {
        if (Character.isDigit(activities.charAt(i)))
        {
            throw new IllegalArgumentException("Activity cannot contain a number");
        }

    }

      favouriteActivities.add(activities);

  }
    /**
    This method will return all the activities in the list.
     */
  public String showActivities()
    {
        return favouriteActivities.toString();
    }

    /**
    This method will get the image depending on the student
     */
    public Image getImage(){
      String pathName = "images/"+firstName+".jpg";
      return new Image(Student.class.getResourceAsStream(pathName));
    }


}
