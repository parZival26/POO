class HolaMundo{

    public static void main(String[] args) {
        Perro manchas = new Perro("Manchas", "Chihuahua", 5);
        System.out.println(manchas.getName() + " es un@ " + manchas.getRace());
        System.out.println("Tiene " + manchas.getEdad() + " años");

        System.out.println("Un año mas tarde");
        manchas.setEdad(manchas.getEdad() + 1);
        System.out.println("Ahora tiene " + manchas.getEdad() + " años");
        manchas.setName("Tatto");
        System.out.println("Ahora se llama " + manchas.getName());
    
    }
}