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

    public Race( String title,int year, LocalDate date, List<Racer> listOfRacers) {
        this.year = year;
        this.title = title;
        this.date = date;
        this.listOfRacers = listOfRacers;
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

                // delete racer from listOfRacer
    public void removeRacer(Racer racer){
       listOfRacers.remove(racer);
    }
                // create new ArrayList for racer and return listOfRacers with all racers.


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
    @Override
    public String toString() {
        return "Race{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", winner=" + winner +
                ", listOfRacers=" + listOfRacers +
                '}';
    }
    public Racer getRacerWithMostDumplings(List<Racer> listOfRacers) {
        if (listOfRacers.isEmpty()) {
            return null; // Ak nie sú žiadni pretekári, vráti null.
        }
        Racer racerWithMostDumplings = listOfRacers.get(0); // Predpokladáme, že prvý pretekár má najviac knedlíkov.
        for (Racer racer : listOfRacers) {
            if (racer.getNumberOfDumplings() > racerWithMostDumplings.getNumberOfDumplings()) {
                racerWithMostDumplings = racer; // Ak aktuálny pretekár má viac knedlíkov, aktualizujeme pretekára s najviac knedlíkmi.
            }
        }

        return racerWithMostDumplings;
    }







}
