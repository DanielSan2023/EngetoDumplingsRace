package com.engeto.dumplings;

import java.time.LocalDate;

public class Racer {
    String name;
    int numberOfDumplings;
    boolean isFinalResult; // Skončil už závodník („true“), nebo ještě pokračuje
                           // v jídle („false“)?
    LocalDate born;

    //region Konstruktors
    public Racer() {
        this("Anonymous racer", LocalDate.MIN);
    }

    public Racer(String name, LocalDate born) {
            this(name, born, 0);
    }

    public Racer(String name, LocalDate born, int numberOfDumplings) {
        this.name = name;
        this.numberOfDumplings = numberOfDumplings;
        this.born = born;
    }

    public Racer(String name, LocalDate born, int numberOfDumplings, boolean isFinalResult) {
        this.name = name;
        this.numberOfDumplings = numberOfDumplings;
        this.isFinalResult = isFinalResult;
        this.born = born;
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

    public int addDumplings(int howMuch) {
        this.numberOfDumplings += howMuch;
        return this.numberOfDumplings;
    }

    public int getPoints() {
        if (numberOfDumplings <= 15) return 0;
        return numberOfDumplings;
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
}