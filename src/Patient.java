public class Patient extends User{

    static int id = 0;

    private String Unidad;

    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);
        id++;
    }

    //getter and setter

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWeight() {
        return weight + "Kg";
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height + "mts";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
}
