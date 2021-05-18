package informatica.esercizio31;

public class Gara {
    
    private int gareVinte;
    private int partecipazioniGare;

    public Gara(int gareVinte, int partecipazioniGare) {
        this.gareVinte = gareVinte;
        this.partecipazioniGare = partecipazioniGare;
    }
    
    public Gara() {
        this.gareVinte = 0;
        this.partecipazioniGare = 0;
    }
    
    public void garaVinta(){
        partecipazioniGare++;
        gareVinte++;
    }
    
    public void garaPersa(){
        partecipazioniGare++;
    }

    public int getGareVinte() {
        return gareVinte;
    }

    public void setGareVinte(int gareVinte) {
        this.gareVinte = gareVinte;
    }

    public int getPartecipazioniGare() {
        return partecipazioniGare;
    }

    public void setPartecipazioniGare(int partecipazioniGare) {
        this.partecipazioniGare = partecipazioniGare;
    }
    
}
