package informatica.esercizio31;

public class Agonista extends Tesserato{

    private static int tesseratiAgonisti = 1;

    public Agonista(String nome, String cognome, String CodiceFiscale, Corso corso, Gara infoGara) {
        super(nome, cognome, CodiceFiscale, corso, infoGara);
    }
    
    public Agonista(String nome, String cognome, String CodiceFiscale, Corso corso) {
        super(nome, cognome, CodiceFiscale, corso);
    }
    
    @Override
    public String generaCodiceTessera() {
        String s = "P" + tesseratiAgonisti;
        tesseratiAgonisti++;
        return s;
    }

    @Override
    public String toString() {
        return "Tessarato Agonista\n" + super.toString();
    }
    
    
    
}
