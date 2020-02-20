package BazaDate;

import Persoane.Persoana;
import Persoane.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

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

        //when
        dt.populate(pTest);
        //then
      dt.populate(pTest2);

        assertEquals(dt.getTre().size(), 1);


    }
}
