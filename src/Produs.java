public class Produs {
    public int pret;
    public String nume;
    public String descriere;
    public String categorie;

    Produs(int pret, String nume, String descriere,String categorie){
        this.pret=pret;
        this.nume=nume;
        this.descriere=descriere;
        this.categorie=categorie;
    }


    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

}
