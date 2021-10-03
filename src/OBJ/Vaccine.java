package OBJ;

/**
 *
 * @author GMT
 */
public class Vaccine {
    private final String VaccineID;
    private String name;

    public Vaccine(String VaccineID, String name) {
        this.VaccineID = VaccineID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVaccineID() {
        return VaccineID;
    }
    
    @Override
    public String toString() {
        return "VaccinesId: " + this.getVaccineID() + ", Vaccine name: " + this.getName();
    }
    public void output(){
        System.out.println("VaccinesId: " + this.getVaccineID() + ", Vaccine name: " + this.getName());
    }
}