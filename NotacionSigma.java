public class NotacionSigma {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <=5; i++){
            System.out.println(i*3);
            result += i*3;
        }
        System.out.println("El resultado es: "+result);
    }
}
