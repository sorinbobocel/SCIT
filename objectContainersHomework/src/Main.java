import BazaDate.Database;
import BazaDate.Hobby;
import BazaDate.Tara;
import Persoane.Angajat;
import Persoane.Persoana;
import Persoane.Somer;
import Persoane.Student;

public class Main {

    public static void main(String[] args) {

        Database tr1 = new Database();
        tr1.populate(new Student("Jim Wesley", 31));
        tr1.populate(new Angajat("Ian McGills", 42));
        tr1.populate(new Somer("Nikola Tesla", 40));
        tr1.populate(new Student("Emil", 22));

        tr1.iterateTreeset();

        Hobby hobby1 = new Hobby("Cycling", new Tara("France"));
        Hobby hobby2 = new Hobby("Collecting locomotive toys", new Tara("USA"));
        Hobby hobby3 = new Hobby("Surf", new Tara("Australia"));
        Hobby hobby4 = new Hobby("Writing", new Tara("Canada"));

        Persoana p1 = new Student("Jim Weasel", 21);
        Persoana p2 = new Angajat("Mark Farrell", 40);
        Persoana p3 = new Student("Jim Weasel", 32);
        Persoana p4 = new Somer("John Sallinger", 63);

        Database hm = new Database();
        hm.populateMap(p1, hobby2);
        hm.populateMap(p1, hobby4);
        hm.populateMap(p2, hobby2);
        hm.populateMap(p2, hobby3);
        hm.populateMap(p3, hobby1);
        hm.populateMap(p4, hobby1);
        hm.populateMap(p4, hobby2);
        hm.populateMap(p4, hobby3);

        hm.printHashMap();
    }
}
