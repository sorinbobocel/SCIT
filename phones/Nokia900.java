package phones;

public class Nokia900 extends Nokia {
    private boolean hasBluetooth;

    public Nokia900(String imei, String color, String material, boolean hasBluetooth) {
        super(imei, color, material);
        this.hasBluetooth = hasBluetooth;
    }

    public Nokia900(String imei, boolean hasBluetooth) {
        super(imei);
        this.hasBluetooth = hasBluetooth;
    }
}

