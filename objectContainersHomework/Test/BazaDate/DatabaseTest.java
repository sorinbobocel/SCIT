package BazaDate;

import Persoane.Persoana;
import Persoane.Somer;
import Persoane.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DatabaseTest {

    Database dt;

    @BeforeEach
    public void setup() {
        dt = new Database();
    }

    @Test
    public void when_populate_with_duplicate_data_only_one_value_added() {

        Persoana pTest = new Student("John", 20);
        Persoana pTest2 = new Student("John", 20);
        dt.populate(pTest);
        dt.populate(pTest2);
        assertEquals(dt.getTre().size(), 1);
    }

    @Test
    void populate_even_with_negative_age_added() {

        Persoana p1 = new Somer("Jerome K. Jerome", -5);
        dt.populate(p1);
        assertEquals(dt.getTre().size(), 1);
    }

    @Test
    void populate_Map_with_nulls_not_accepted() {

        Persoana p1 = new Persoana(null, 0);
        Hobby hbTest = new Hobby(null, new Tara(null));

        dt.populateMap(p1, hbTest);
        assertEquals(dt.getHashMap().size(), 0);
    }
}
