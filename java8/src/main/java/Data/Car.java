package Data;

import java.util.Objects;

public class Car {

    private String model;
    private boolean convertible;
    private int doors;

    public Car(String model, boolean convertible, int doors) {
        this.model = model;
        this.convertible = convertible;
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public boolean isConvertible() {
            return convertible;
    }
    public int getDoors() {
        return doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel());
    }

    @Override
    public String toString() {
        return
                "Model: '" + model.toUpperCase() + '\'' +
                ", convertible: " + convertible +
                ", number of doors: " + doors;
    }
}
