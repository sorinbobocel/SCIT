package BazaDate;

import BazaDate.Adresa;

import java.util.List;

public class Hobby {

    private String hobby;
    private int frequency;
    private List<Adresa> hobbyPlaces;
    private Tara tara;

    public Hobby(String hobby, int frequency, List<Adresa> hobbyPlaces) {
        this.hobby = hobby;
        this.frequency = frequency;
        this.hobbyPlaces = hobbyPlaces;
    }

    public Hobby(String hobby, Tara tara) {
        this.hobby = hobby;
        this.tara = tara;
    }

    public Hobby() {

    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public int getFrequency() {        return frequency;    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Adresa> getHobbyPlaces() {        return hobbyPlaces;    }

    public void setHobbyPlaces(List<Adresa> hobbyPlaces) {
        this.hobbyPlaces = hobbyPlaces;
    }

    public Tara getTara() {        return tara;    }

    public void setTara(Tara tara) {        this.tara = tara;    }

    @Override
    public String toString() {
        if(frequency == 0 && hobbyPlaces == null) {
            return  hobby + " in " + tara;
        } else {
            return "BazaDate.Hobby:'" + hobby + '\'' +
                    " frequency: " + frequency + " times per week" +
                    " Places to practice it:" + hobbyPlaces;
        }
    }
}
