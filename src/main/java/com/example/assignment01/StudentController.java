package com.example.assignment01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Set;

public class StudentController implements Initializable {

    @FXML
    private Label Activities;
    @FXML
    private Label FirstNameLabel;

    @FXML
    private Label LastNameLabel;

    @FXML
    private Label StudentNumberLabel;

    @FXML
    private ImageView imageView;

    private ArrayList<Student> Students;

    private int index = 0;


    @FXML
    void NextStudent(ActionEvent event) {
        index = index + 1;
        if (index == 3)
            index = 0;
        setStudents(Students.get(index));
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            Student Nathan = new Student("Nathan", "Marino", 11101);
            Student Nicholas = new Student("Nicholas", "Marino", 2222);
            Student Ava = new Student("Ava", "Marino", 334344);
            Students = new ArrayList<>();
            Students.add(Nathan);
            Students.add(Ava);
            Students.add(Nicholas);
            Nathan.activities("Videogames");
            Nathan.activities("Piano");
            Nathan.activities("Drawing");
            Nicholas.activities("Guitar");
            Nicholas.activities("Videogames");
            Nicholas.activities("Science");
            Ava.activities("Running");
            Ava.activities("Sleeping");
            Ava.activities("Being crazy");

            setStudents(Students.get(0));

    }


    public void setStudents(Student student){

        FirstNameLabel.setText("FirstName " + student.getFirstName());
        LastNameLabel.setText("LastName " + student.getLastName());
        StudentNumberLabel.setText("StudentNumber " + student.getStudentNumber());
        imageView.setImage(student.getImage());
        Activities.setText(student.showActivities());

    }




}
