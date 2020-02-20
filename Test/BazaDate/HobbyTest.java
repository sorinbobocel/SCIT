package BazaDate;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HobbyTest {

    @Test
   void  if_hobby_does_not_contain_other_informations_but_country_return_only_hobby_and_country() {

        List<Hobby> list = new ArrayList<>();
        Hobby hb = new Hobby("Hiking", new Tara("Argentina"));
        assertTrue(list.add(hb));

    }
}