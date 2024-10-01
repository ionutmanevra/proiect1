public class CosCumparaturi {
    public Produs produs;
    public int pretCos;
    public int numarProduse;

    CosCumparaturi(Produs produs,int pretCos,int numarProduse){
        this.produs=produs;
        this.pretCos=pretCos;
        this.numarProduse=numarProduse;
    }

    public Produs getProdus() {
        return produs;
    }

    public void setProdus(Produs produs) {
        this.produs = produs;
    }

    public int getPretCos() {
        return pretCos;
    }

    public void setPretCos(int pretCos) {
        this.pretCos = pretCos;
    }

    public int getNumarProduse() {
        return numarProduse;
    }

    public void setNumarProduse(int numarProduse) {
        this.numarProduse = numarProduse;
    }

    public void arataCos(){
        System.out.println(getProdus());
        System.out.println("Numar produse: "+ getNumarProduse());
        System.out.println("Pret: "+ getPretCos());
    }

}


