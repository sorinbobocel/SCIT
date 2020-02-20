package BazaDate;

import Persoane.Persoana;
import comparatori.ComparatorNume;
import comparatori.ComparatorVarsta;

import java.util.*;

public class Database {

    Set<Persoana> tre = new TreeSet<Persoana>(new ComparatorNume().thenComparing(new ComparatorVarsta()));
    HashMap<Persoana, List<Hobby>> hashMap = new HashMap<>();

    public void populate(Persoana p) {
        if (!tre.contains(p)) {
            tre.add(p);
        } else {
            System.out.println("Person is already added");
        }
    }

    public void iterateTreeset() {
        Iterator<Persoana> it = tre.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public  void populateMap(Persoana persoana, Hobby hobby) {
        List<Hobby> hbList;
        if (hashMap.containsKey(persoana)) {
            hbList = hashMap.get(persoana);
        } else {
            hbList = new ArrayList<>();
        }
        hbList.add(hobby);
        hashMap.put(persoana, hbList);
    }

    public  void printHashMap() {
        for (Map.Entry<Persoana, List<Hobby>> hm : hashMap.entrySet()) {
            System.out.println(hm.getKey() + " " + hm.getValue());
        }
    }

    public Set<Persoana> getTre() {
        return tre;
    }

    public void setTre(Set<Persoana> tre) {
        this.tre = tre;
    }

    public HashMap<Persoana, List<Hobby>> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Persoana, List<Hobby>> hashMap) {
        this.hashMap = hashMap;
    }
}




