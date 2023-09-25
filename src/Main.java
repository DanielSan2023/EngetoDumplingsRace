import com.engeto.dumplings.Race;
import com.engeto.dumplings.Racer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

        // Create object 'chuck'
        chuck = new Racer("Chuck Norris ",LocalDate.of(2000,5,1),
                1000,false);
//        chuck.setName("Chuck Norris ");
//        chuck.setBorn(LocalDate.of(2000,5,1));
//        chuck.setNumberOfDumplings(1000);
//        chuck.setFinalResult(false);
        Jackie = new Racer("Jackie Chann ",LocalDate.of(1960,11,1),
                140,false);
        Sonya = new Racer("Jackie Chann ",LocalDate.of(1960,11,1),
                140,false);


        String chucksName = chuck.getName();

        System.out.println(chucksName +"  zjedol:  "+chuck.getNumberOfDumplings() +" knedlikov");


        //Create object todayRace
        todaysRace = new Race("MCR Brichac Cup",2000,  LocalDate.of(2000,5,12),chuck);

        todaysRace2 = new Race(2023);
        System.out.println(todaysRace2.getDate() +"  "+ todaysRace2.getTitle());
        todaysRace2 = new Race("Poleno  CUP",2023);
        System.out.println(todaysRace2.getDate() +"  "+ todaysRace2.getTitle());
        todaysRace.setWinner(chuck);


        // ArrayList - listOfRacer
        listOfRacer.add(chuck);
        listOfRacer.add(Jackie);
        listOfRacer.add(Sonya);

        // Copy List to other List
        List<Racer> copyOfList = new ArrayList<Racer>(listOfRacer);
        System.out.println("Pocet pretekárov je : "+listOfRacer.size()+"  ich mena sú:  ");

        //write Racer in listOfRacer
        for(Racer racer : listOfRacer){
              System.out.println( racer.getName());
        }


        //Add listOfRace = List<Array>
        listOfRace.add(race2017);
        listOfRace.add(race2018);
        listOfRace.add(race2019);
        for(Race race : listOfRace){
            System.out.println( race.getTitle()+" - "+race.getYear());

        }


    }
}