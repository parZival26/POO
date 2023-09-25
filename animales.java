import java.time.LocalDate;

class Animal{
    private String nombre;
    private LocalDate fechaDeNacimientoDate;
    private String raza;
    public Animal(String nombre, LocalDate fechaDeNacimientoDate, String raza) {
        this.nombre = nombre;
        this.fechaDeNacimientoDate = fechaDeNacimientoDate;
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public LocalDate getFechaDeNacimientoDate() {
        return fechaDeNacimientoDate;
    }
    public void setFechaDeNacimientoDate(LocalDate fechaDeNacimientoDate) {
        this.fechaDeNacimientoDate = fechaDeNacimientoDate;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad(){
        LocalDate fechaActual = LocalDate.now();
        return (fechaDeNacimientoDate.until(fechaActual)).getYears();
    }

}

class Gato extends Animal{
    private String color;

    

    public Gato(String nombre, LocalDate fechaDeNacimiento, String raza, String color) {
        super(nombre, fechaDeNacimiento, raza);
        this.color = color;
    }
    


	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String ronronear(){
        return "Mmmmmrrrr Mmrrrr Miau";
    }

}

class Perro extends Animal {    
    
    public Perro(String nombre, LocalDate fechaDeNacimientoDate, String raza) {
		super(nombre, fechaDeNacimientoDate, raza);
	}
    public String ladrar(){
        return "Guao Guao";
    }
    
    
}



