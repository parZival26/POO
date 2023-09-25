public class Doctor {
    static private int id = 0;
    String name;
    String email;
    String speciality;


    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id ++;
    }

    Doctor(String name){
        System.out.println("El nombre del Doctor es: " + name);
    }

    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+ id);
    }
}
