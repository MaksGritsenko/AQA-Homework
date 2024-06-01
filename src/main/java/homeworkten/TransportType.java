package homeworkten;

public enum TransportType {

    BUS(2, 4, 9),
    SUBWAY(10, 15, 27),
    TRAIN(18, 25, 45);

    private final int lowZonePrice;
    private final int middleZonePrice;
    private final int highZonePrice;

    TransportType(int lowZonePrice, int middleZonePrice, int highZonePrice) {
        this.lowZonePrice = lowZonePrice;
        this.middleZonePrice = middleZonePrice;
        this.highZonePrice = highZonePrice;
    }

    public int getLowZonePrice() {
        return lowZonePrice;
    }
    public int getMiddleZonePrice() {
        return middleZonePrice;
    }

    public int getHighZonePrice() {
        return highZonePrice;
    }
}
