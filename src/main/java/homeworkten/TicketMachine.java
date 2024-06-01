package homeworkten;

public class TicketMachine {

    public int calculateFare(TransportType transportType, int zone) {
        switch (getTransportType(transportType)) {
            case TRAIN, BUS, SUBWAY:
                switch (getZone(zone)) {
                    case "low":
                        return transportType.getLowZonePrice();
                    case "medium":
                        return transportType.getMiddleZonePrice();
                    case "high":
                        return transportType.getHighZonePrice();
                    case "invalid zone":
                        return 0;
                }
            default:
                return 0;
        }
    }

    private String getZone(int zone) {
        if (zone == 1 || zone == 2 || zone == 3) {
            return switch (zone) {
                case 1 -> "low";
                case 2 -> "medium";
                case 3 -> "high";
                default -> "invalid zone";
            };
        }
        return "invalid zone";
    }

    private TransportType getTransportType(TransportType transportType) {
        return transportType;
    }
}
