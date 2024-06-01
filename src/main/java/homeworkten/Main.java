package homeworkten;

public class Main {
    public static void main(String[] args) {

        TicketMachine ticketMachine = new TicketMachine();
        int fare = ticketMachine.calculateFare(TransportType.TRAIN, 2);
        if (fare == 0) {
            System.out.println("You have entered the wrong zone. Please select one of the three zones: 1, 2, 3.");
        } else {
            System.out.println("The cost of the trip for the selected transport and zone is: " + fare + "$");
        }
    }
}
