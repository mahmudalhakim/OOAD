class House {
    private List<Room> rooms;

    public House() {
        this.rooms = new ArrayList<>();
        addRooms();
    }

    private void addRooms() {
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
        rooms.add(new Room("Kitchen"));
    }

    public List<Room> getRooms() {
        return rooms;
    }
}