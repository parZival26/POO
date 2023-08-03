public class Perro {
    private String name;
    private String race;
    private int edad;

    public Perro(String name, String race, int edad){
        this.name = name;
        this.race = race;
        this.edad = edad;
    }

    public String getName(){
        return this.name;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public String getRace(){
        return this.race;
    }

    public String setRace(String race){
        this.race = race;
        return this.race;
    }

    public int getEdad(){
        return this.edad;
    }

    public int setEdad(int edad){
        this.edad = edad;
        return this.edad;
    }
    
}
