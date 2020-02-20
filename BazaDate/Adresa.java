package BazaDate;

public class Adresa {
    private String oras;
    private String strada;
    private int nr;

    public Adresa(String oras, String strada, int nr) {
        this.oras = oras;
        this.strada = strada;
        this.nr = nr;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    @Override
    public String toString() {
        return "BazaDate.Adresa:" +
                "Oras " + oras + '\'' +
                ", Strada '" + strada + '\'' +
                ", nr. " + nr;
    }
}
