import com.engeto.dumplings.Race;
import com.engeto.dumplings.Racer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Racer firstRacer = new Racer(); // create Object Racer
        Racer secondRacer = new Racer();
        Racer thirdRacer = new Racer();
        Racer chuck;
        Racer Jackie;
        Racer Sonya;
        Race todaysRace;
        Race todaysRace2;
        List<Racer> listOfRacer = new ArrayList<>();
        List<Race> listOfRace = new ArrayList<>();


        Race race2017  = new Race(2017);
        Race race2018 =  new Race(2018);
        Race race2019 = new Race(2019);

        firstRacer.setName("Radek");
        System.out.println(firstRacer.getName());
        secondRacer.setName("Jana");
        System.out.println(secondRacer.getName());
        firstRacer.setName("Radomir");
        System.out.println(firstRacer.getName());


        chuck = new Racer("Chuck Norris ",LocalDate.of(2000,5,1),
                120,false);
        Jackie = new Racer("Jackie Chann ",LocalDate.of(1960,11,1),
                14,false);
        Sonya = new Racer("Sonya",LocalDate.of(1980,4,1),
                1400,false);
        // ArrayList - listOfRacer
        listOfRacer.add(chuck);
        listOfRacer.add(Jackie);
        listOfRacer.add(Sonya);



        //write Racer in listOfRacer
        for(Racer racer : listOfRacer){
            System.out.println( racer.getName());
        }




        System.out.println(chuck.getName() +"  zjedol:  "+chuck.getNumberOfDumplings() +" knedlikov");
        chuck.addDumplings(20);
        System.out.println("Chuck zjedol :" +chuck.getPoints());
        System.out.println("Jackie zjedol:" +Jackie.getPoints());

        //Create object todayRace
        todaysRace = new Race("MCR Brichac Cup",2000,  LocalDate.of(2000,5,12),listOfRacer);

        todaysRace2 = new Race("MCR Brichac Cup",2000,  LocalDate.of(2000,5,12),listOfRacer);


        System.out.println(todaysRace2.getDate() +"  "+ todaysRace2.getTitle());
        todaysRace.setWinner(chuck);


        Racer winner = todaysRace2.getRacerWithMostDumplings(listOfRacer);
        if (winner != null) {
            System.out.println("Pretekár s najviac knedlíkmi je " + winner.getName() + " s početom " + winner.getNumberOfDumplings() + " knedlíkov.");
        } else {
            System.out.println("Nie sú žiadni pretekári.");
        }


//
//
//        //Add listOfRace = List<Array>
//        listOfRace.add(race2017);
//        listOfRace.add(race2018);
//        listOfRace.add(race2019);
//        for(Race race : listOfRace){
//            System.out.println( race.getTitle()+" - "+race.getYear());
//
//        }
//
//
//
//
    }

}


