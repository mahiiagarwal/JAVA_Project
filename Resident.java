public class Resident {
    private int id;
    private String name;
    private String phone;
    private String roomNumber;

    public Resident(int id, String name, String phone, String roomNumber) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.roomNumber = roomNumber;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getRoomNumber() { return roomNumber; }

    public void setPhone(String phone) { this.phone = phone; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    @Override
    public String toString() {
        return "Resident ID: " + id + ", Name: " + name + ", Phone: " + phone + ", Room: " + roomNumber;
    }
}
