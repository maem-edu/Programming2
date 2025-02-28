package crit_thinking_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class AgeCalc {
    private String birthDate;

    // Constructor
    public AgeCalc() {
        birthDate = "00-00-0000";
    }

    // Getters and setters
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    // Method to calculate age
    public int calculateAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        LocalDate birthDate = LocalDate.parse(this.birthDate, formatter);
        LocalDate currentDate = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(birthDate, currentDate);
    }
}