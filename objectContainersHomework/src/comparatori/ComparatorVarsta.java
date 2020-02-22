package comparatori;

import Persoane.Persoana;

import java.util.Comparator;

public class ComparatorVarsta implements Comparator <Persoana> {

    @Override
public int compare(Persoana o1, Persoana o2) {
    if(o1.getAge() > o2.getAge()) {
        return 1;
    } else if (o1.getAge() < o2.getAge()) {
        return -1;
    } else {
        return 0;
    }
}
}
