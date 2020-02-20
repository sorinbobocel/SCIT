package Persoane;

import java.util.Objects;

public class Persoana {

    private String name;
    private int age;

    public Persoana(String name) {
        this.name = name;
    }

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persoana() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        if (this.age == 0) {
            return
                    "Nume: " + name;
        }
        return
                "Nume: '" + name + '\'' +
                        ", varsta: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return
                Objects.equals(name, persoana.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}