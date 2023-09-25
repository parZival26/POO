import static ui.UIMenu.*;


public class Main {
    public static void main(String[] args) {
        Doctor doctorJuan = new Doctor();
        doctorJuan.name = "Juan";
        doctorJuan.showName();
        doctorJuan.showId();

        Doctor doctorCarlos = new Doctor();
        doctorCarlos.name = "Carlos";
        doctorCarlos.showName();
        doctorCarlos.showId();

        Patient patient = new Patient("Sebas", "sebas@gmail.com");
        


    }

    
   
}
