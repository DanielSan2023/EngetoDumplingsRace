import com.engeto.dumplings.Race;
import com.engeto.dumplings.Racer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Racer firstRacer = new Racer(); // create Object Racer
        Racer secondRacer = new Racer();
        Racer thirdRacer = new Racer();
        Racer chuck;
        Race todaysRace;

        Race race2017  = new Race();
        Race race2018 =  new Race();
        Race race2019 = new Race();

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

        String chucksName = chuck.getName();

        System.out.println(chucksName +"  zjedol:  "+chuck.getNumberOfDumplings() +" knedlikov");



        //Create object todayRace
        todaysRace = new Race(2000,"MCR Brichac Cup",  LocalDate.of(2000,5,12),chuck);








    }
}