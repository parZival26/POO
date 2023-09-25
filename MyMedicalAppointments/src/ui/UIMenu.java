package ui;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTS ={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            response = Integer.valueOf(sc.nextLine());
            
            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

        }while (response != 0);

        sc.close();
        
    }

    public static void showPatientMenu(){
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i+1)+". " + MONTS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
        sc.close();

    }

}
