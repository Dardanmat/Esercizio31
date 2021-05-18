package informatica.esercizio31;

public class Main {
    public static void main(String[] args) {
        
        Palestra palestra = new Palestra();
        
        palestra.addTesserato(new Agonista("Marco", "Marconi", "agonia1", Corso.CORSA, new Gara(0, 5)));
        palestra.addTesserato(new Agonista("Fabio", "Fabiani", "agonia2", Corso.CORSA, new Gara(0, 45)));
        palestra.addTesserato(new Agonista("Michele", "Micheletti", "agonia3", Corso.DOCCIA, new Gara(0, 125)));
        palestra.addTesserato(new Agonista("Francesco", "Franceschini", "agonia4", Corso.DOCCIA, new Gara(0, 95)));
        palestra.addTesserato(new Agonista("Matteo", "Matteucci", "agonia5", Corso.CORSA, new Gara(0, 2)));
        palestra.addTesserato(new Agonista("Girolamo", "Per il pesce", "agonia6", Corso.FLEXING, new Gara(0, 3)));
        
        palestra.addTesserato(new Amatoriale("Damien", "Marcel", "amato7", Corso.DOCCIA, new Gara(0, 65)));
        palestra.addTesserato(new Amatoriale("Nicolai", "Reedz", "amato8", Corso.PASSEGGIO, new Gara(0, 25)));
        palestra.addTesserato(new Amatoriale("Chad", "Burchill", "amato9", Corso.PASSEGGIO, new Gara(0, 35)));
        palestra.addTesserato(new Amatoriale("Zvonomir", "Burazin", "amato10", Corso.DOCCIA, new Gara(0, 15)));
        palestra.addTesserato(new Amatoriale("Milan", "Svejda", "amato11", Corso.FLEXING, new Gara(0, 50)));
        
        System.out.println(palestra.toStringCodiceECognomi());
        System.out.println("---------------------RIORDINO ALFABETICO--------------------------");
        palestra.riordinaTesseratiPerCognome();
        System.out.println(palestra.toStringCodiceECognomi());
        
        System.out.println("\n---------------------RIORDINO PER CODICE--------------------------");
        palestra.riordinaTesseratiPerNumeroDiCodice();
        System.out.println(palestra.toStringCodice());
        
        System.out.println("\n---------------------RIORDINO PER GARE--------------------------");
        for (Tesserato t : palestra.listaTesseratiOrdinataPerNumGareEffettuate()) {
            System.out.println(t.getCodiceTessera() + " - " + t.getInfoGara().getPartecipazioniGare());
        }
        
        System.out.println("\n---------------------LISTA AGONISTI--------------------------");
        for (Tesserato t : palestra.listaTesseratiPerTipo(Agonista.class)) {
            System.out.println(t.getCodiceTessera());
        }
        
        System.out.println("\n---------------------LISTA AMATORIALE--------------------------");
        for (Tesserato t : palestra.listaTesseratiPerTipo(Amatoriale.class)) {
            System.out.println(t.getCodiceTessera());
        }
        
    }
}
