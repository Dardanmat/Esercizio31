package informatica.esercizio31;

public class Amatoriale extends Tesserato{
    
    private static int tesseratiAmatoriali = 1;

    public Amatoriale(String nome, String cognome, String CodiceFiscale, Corso corso, Gara infoGara) {
        super(nome, cognome, CodiceFiscale, corso, infoGara);
    }
    
    public Amatoriale(String nome, String cognome, String CodiceFiscale, Corso corso) {
        super(nome, cognome, CodiceFiscale, corso);
    }
    
    @Override
    public String generaCodiceTessera() {
        String s = "A" + tesseratiAmatoriali;
        tesseratiAmatoriali++;
        return s;
    }

    @Override
    public String toString() {
        return "Tesserato Amatoriale\n" + super.toString();
    }
    
}
