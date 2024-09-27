public class CosCumparaturi {
    public String produse;
    public int pretCos;
    public int numarProduse;

    public Produs produs;

    CosCumparaturi(String produse,int pretCos,int numarProduse){
        this.produse=produse;
        this.pretCos=pretCos;
        this.numarProduse=numarProduse;
    }

    public String getProduse() {
        return produse;
    }

    public void setProduse(String produse) {
        this.produse = produse;
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

}


