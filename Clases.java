public class Clases{
    // atributos

    // metodos
    public int calculo(int a, int b){
        int suma = a + b;
        return suma;
    }
    public static void main(String[] args) {
        Clases objeto = new Clases();
        int resultado = objeto.calculo(5, 6);
        System.out.println("El resultado es: " + resultado);
    }
}