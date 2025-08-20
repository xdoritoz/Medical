public class User {
    private String name;
    private String email;
    private String adress;
    private String  phoneNumber;
    private int edad;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El phone number no puede ser menor o 8 caracteres");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }
}
