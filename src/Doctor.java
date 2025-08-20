import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    private String especialidad;
    private static int contador;
    private int idUnico;
    private  int doctorAlMomento;

    public Doctor(String nombre , String email) {
        super(nombre,email);

        System.out.println("construyendo " +  (contador + 1) + " Doctores...");
        this.especialidad = especialidad;

        contador++;
        idUnico = contador;
        doctorAlMomento = contador;
    }

    public void setEmail(String email) {
        super.setEmail(email);
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    public int getDoctorAlMomento() {
        return doctorAlMomento;
    }

    public void setDoctorAlMomento(int doctorAlMomento) {
        this.doctorAlMomento = doctorAlMomento;
    }





    public void show (){

        System.out.println("\nNombre: " + super.getName());
        System.out.println("ID unico: "+ idUnico);
        System.out.println("Doctores creados en su momento: "+ doctorAlMomento);
        System.out.println("doctores creados en total: "+ contador);
        //        System.out.println("ID del objeto: " + id);
    }

    ArrayList<Availableapointments> availableapointments = new ArrayList<>();

    public void addAvailableapointments(Date date, String time){
        availableapointments.add(new Availableapointments(date, time));
    }





    public ArrayList<Availableapointments> getAvailableapointments() {
        return availableapointments;
    }

    public void showAvailableapointments(){
        for (Availableapointments Aa : availableapointments) {
            System.out.println(Aa.getDay() + "  ###hora###  " +  Aa.getTime());
        }
    }

    public static class Availableapointments{
        int id;
        Date day;
        String time;

        public Availableapointments(Date day, String time) {
            this.day = day;
            this.time = time;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public Date getDay() {
            return day;
        }

        public void setDay(Date day) {
            this.day = day;
        }
    }
}


