package com.engeto.dumplings;

import java.time.LocalDate;

public class Racer {
   private String name;
   private String surname;
    int numberOfDumplings;
    boolean isFinalResult; // Skončil už závodník („true“), nebo ještě pokračuje
                           // v jídle („false“)?
    LocalDate born;
    RacerLevel professionalLevel;

    //region Konstruktors
    public Racer() {
        this("Racer", "Anonymus",LocalDate.MIN);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Racer(String name, String surname, LocalDate born) {
            this(name,surname, born, 0,RacerLevel.AMATEUR);
    }

    public Racer(String name,String surname, LocalDate born, int numberOfDumplings,RacerLevel professionalLevel) {
        this.name = name;
        this.surname = surname;
        this.numberOfDumplings = numberOfDumplings;
        this.born = born;
        this.professionalLevel = professionalLevel;
    }

    public Racer(String name,String surname, LocalDate born, int numberOfDumplings, boolean isFinalResult,RacerLevel professionalLevel) {
        this.name = name;
        this.surname = surname;
        this.numberOfDumplings = numberOfDumplings;
        this.isFinalResult = isFinalResult;
        this.born = born;
        this.professionalLevel = professionalLevel;
    }
   //endregion
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public int getNumberOfDumplings() {
        return numberOfDumplings;
    }

    public void setNumberOfDumplings(int numberOfDumplings) {
        this.numberOfDumplings = numberOfDumplings;
    }
    public boolean isFinalResult(){
        return isFinalResult;
    }

    public RacerLevel getProfessionalLevel() {
        return professionalLevel;
    }

    public void setProfessionalLevel(RacerLevel professionalLevel) {
        this.professionalLevel = professionalLevel;
    }

    public int addDumplings(int howMuch) {
        this.numberOfDumplings += howMuch;
        return this.numberOfDumplings;
    }


    public void setFinalResult(boolean finalResult) {
        isFinalResult = finalResult;
    }

    @Override
    public String toString() {
        return "Racer{" +
                "name='" + name + '\'' +
                ", numberOfDumplings=" + numberOfDumplings +
                '}';
    }


    public int getPoints() {
        int quotient;
        if (professionalLevel == RacerLevel.AMATEUR) {
            if (numberOfDumplings <= 15)    quotient = 1;
            else if (numberOfDumplings < 30) quotient = 2;
            else if (numberOfDumplings < 50) quotient = 3;
            else quotient = 4;
        } else if (professionalLevel == RacerLevel.SECOND_LEAGUE) {
            if (numberOfDumplings <= 20)    quotient = 1;
            else if (numberOfDumplings < 40) quotient = 2;
            else if (numberOfDumplings < 60) quotient = 3;
            else quotient = 4;
        } else { //  else FIRST_LEAGUE
            if (numberOfDumplings <= 40)    quotient = 1;
            else if (numberOfDumplings < 60) quotient = 2;
            else if (numberOfDumplings < 80) quotient = 3;
            else quotient = 4;
        }
        return numberOfDumplings * quotient;
    }
}