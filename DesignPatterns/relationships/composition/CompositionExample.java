public class CompositionExample {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("Rooms in the house:");
        for (Room room : house.getRooms()) {
            System.out.println("- " + room.getName());
        }

        // Om huset förstörs, försvinner också rummen
        house = null;
        // Här skulle vi inte längre kunna nå rummen
        // eftersom de inte existerar utan huset
    }
}