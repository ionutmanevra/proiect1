import java.util.ArrayList;

public class Client {
    private String nume;
    private String email;
    private static int numarClienti=1;

    public ArrayList<CosCumparaturi> cosCumparaturi;

    public Client(String nume, String email) {
        this.nume=nume;
        this.email=email;
        this.cosCumparaturi=new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
        numarClienti++;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getNumarClienti() {
        return numarClienti;
    }

    public static void setNumarClienti(int numarClienti) {
        Client.numarClienti = numarClienti;
    }

    public void arataClienti(){
            System.out.println("Nume: "+getNume());
            System.out.println( "Email: "+getEmail());
    }

}
