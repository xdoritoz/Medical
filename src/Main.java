import javax.print.Doc;
import java.util.Date;

import static UI.UiMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor( "jose",  "cardiologo");
        Doctor myDoctor2 = new Doctor( "manuel", "pediatra");
        User user = new Doctor("jose","cardiologo");
        myDoctor2.show();


        //showMenu();

        Patient patient = new Patient("jose", "mierda@gmail.com");
        patient.setHeight(1.65);
        patient.setWeight(75);

        System.out.println("Height: "+ patient.getHeight());
        System.out.println("Weight: "+ patient.getWeight());

        System.out.println("Patient name: "+ patient.getName()); // esto es por que el atributo de name de la clase paciente es privado y solo se puede acceder a traves de un metodo que lo maneje

        myDoctor.addAvailableapointments(new Date(), "12:00");
        myDoctor2.addAvailableapointments(new Date(), "13:00");


        myDoctor.showAvailableapointments();
        myDoctor2.showAvailableapointments();

        System.out.printf(patient.getName()+"\n");
        System.out.printf(myDoctor.getName()+"\n");

        


        //PRUEBA CON ENUMS

        for (int i = 0; i< Passsword.values().length;i++) {
            System.out.println( Passsword.values()[i]+":"+ Passsword.values()[i].getEnglish() + ", "
                    + Passsword.values()[i].getPortugues() + ", "
                    + Passsword.values()[i].getQuechua());
        }

        System.out.println("\n");
         //ahora con for each
        for (Passsword passsword : Passsword.values()) {
            System.out.println(passsword + ":" + passsword.getEnglish() + ", " + passsword.getPortugues() + ", "  + passsword.getQuechua());
        }
    }



    public enum Passsword{
        UNO("One","Huk","Um"),
        DOS("Two","Iskay","Dois"),
        TRES("Three","Kinsa","Três"),
        CUATRO("Four","Tawa","Quatro"),
        CINCO("Five","Pisqa","Cinco"),
        SEIS("Six","Soqta","Seis"),
        SIETE("Seven","Qanchis","Sete"),
        OCHO("Eight","Pusaq","Oito"),
        NUEVE("Nine","Isqon","Nove"),
        DIEZ("Ten","Chunka","Dez");

        private String english;
        private String quechua;
        private String portugues;

        private Passsword(String s, String q, String p) {
            english = s;
            quechua = q;
            portugues = p;
        }

        public String getEnglish() {
            return english;
        }

        public String getQuechua() {
            return quechua;
        }

        public String getPortugues() {
            return portugues;
        }

    }
}