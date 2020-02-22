package BazaDate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HobbyTest {

    @Test
   void  if_hobby_does_contains_only_country_return_hobby_and_country() {

        List<Hobby> list = new ArrayList<>();
        Hobby hb = new Hobby("Hiking", new Tara("Argentina"));
        assertTrue(list.add(hb));

    }

    @Test
    void if_hobby_is_null_do_not_return_anything() {
        Hobby hb1 = new Hobby(null, new Tara("USA"));
        assertNull(hb1.getHobby());
    }
}