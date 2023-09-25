package com.engeto.dumplings;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Race {
    int year;
    String title;
    LocalDate date;
    Racer winner;
   List<Racer> listOfRacers = new ArrayList<>();

    //region konstruktory
    public Race() {
    }

    public Race( String title,int year, LocalDate date, Racer winner) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.winner = winner;
    }

    public Race(String title, int year, LocalDate date) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.winner = null;
    }

    public Race(int year) {
        this("Svestka Cup",year);

    }
    public Race( String title,int year) {
        this.year = year;
        this.title = title;
        this.date = LocalDate.now();
    }



    //endregion Konstruktory
    //region Getter and Setter


           // add new racer
    public void addRacer(Racer newRacer){
        listOfRacers.add(newRacer);
    }
                // delete racer from listOfRacer
    public void removeRacer(Racer racer){
       listOfRacers.remove(racer);
    }
                // create new ArrayList for racer and return listOfRacers with all racers.
    public List<Racer> getRacers(){
        return new ArrayList<Racer>(listOfRacers);
    }

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
