package phones;

import phoneInterface.Phone;

public abstract class Nokia extends Phone {

    private String color, material;

    public Nokia(String imei, String color, String material) {
        super(imei);
        this.color = color;
        this.material = material;
    }

    public Nokia(String imei) {
        super(imei);
    }
}

