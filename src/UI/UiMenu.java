package UI;

import java.util.Scanner;

public class UiMenu {
    public final static String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    static int response = 0;

    public static void showMenu(){
        System.out.print("\nWelcome to my appointment:");
        System.out.println("\nSelecciona una opcion:");



        do {
            System.out.println("1.Doctor");
            System.out.println("2.patient");
            System.out.println("0.salir");

            System.out.print("Opcion: ");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch(response){
                case 1:
                    System.out.println("\nDOCTOR\n");
                    break;
                case 2:
                    System.out.println("\ningresando al menu paciente...");
                    response = 0;
                    showPatientMenu();
                    break;
                case 0:
                    System.out.println("gracias por tu visita...");
                    break;

                default:
                    System.out.println("Por favor ingrese una opcion valida");
            }
        }while(response!=0);
    }

    public static void showPatientMenu(){
        do {
            System.out.println("\n\npatient");
            System.out.println("1.Book and appointments");
            System.out.println("2.My appointments");
            System.out.println("0.return");

            System.out.print("Opcion: ");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());


            switch (response) {
                case 1:
                    System.out.println("\n::Book and appointment");
                    break;
                case 2:
                    System.out.println("\n::Appointment");
                    for (int i = 0; i < 3; i++) {
                        System.out.println((i+1)+ ". "+ MONTHS[i]);
                    }
                    break;
                case 0:
                    System.out.println("\nVolviendo al menu principal...");
                    showMenu();
                    break;
                default:
                    System.out.println("Por favor ingrese una opcion valida");
            }

        }while(response!=0);

    }

}
