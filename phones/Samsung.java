package phones;

import phoneInterface.Phone;

public abstract class Samsung extends Phone {

    private String color, material;

    public Samsung(String imei, String color, String material) {
        super(imei);
        this.color = color;
        this.material = material;
    }

    public Samsung(String imei) {
        super(imei);
    }
}
