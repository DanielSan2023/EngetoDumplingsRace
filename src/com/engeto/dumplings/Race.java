package com.engeto.dumplings;

import java.time.LocalDate;

public class Race {
    int year;
    String title;
    LocalDate date;
    Racer winner;

    //region konstruktory
    public Race() {
    }

    public Race(int year, String title, LocalDate date, Racer winner) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.winner = winner;
    }

    //endregion Konstruktory
    //region Getter and Setter
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Racer getWinner() {
        return winner;
    }

    public void setWinner(Racer winner) {
        this.winner = winner;
    }

    //endregion Getter and Setter







}
