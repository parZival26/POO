public class Patient {
    private static int id = 0;
    private String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    private double weight;
    private double height;
    String bloodType;

    public Patient(String name, String email){
        id ++;
        this.name = name;
        this.email = email;
    }
}
