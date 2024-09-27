public class Client {
    private int nume;
    private String email;
    private int numarClienti;

    Client (int nume,String email){
        this.nume=nume;
        this.email=email;
    }

    public int getNume() {
        return nume;
    }

    public void setNume(int nume) {
        this.nume = nume;
        numarClienti++;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumarClienti() {
        return numarClienti;
    }

    public void setNumarClienti(int numarClientil) {
        this.numarClienti = numarClientil;
    }

    public void arataClienti(){
            System.out.println("Nume "+getNume());
            System.out.println( "Email "+getEmail());
    }
}
