package informatica.esercizio31;
import java.util.ArrayList;
import java.util.Comparator;

public class Palestra {
    
    private ArrayList<Tesserato> listaTesserati;

    public Palestra() {
        listaTesserati = new ArrayList<>();
    }
    
    public boolean addTesserato(Tesserato t){
        if(t == null) return false;
        return listaTesserati.add(t);
    }
    
    public void riordinaTesseratiPerCognome(){
        listaTesserati.sort(new ComparaCognomeTesserati());
    }
    
    public void riordinaTesseratiPerNumeroDiCodice(){
        listaTesserati.sort(new ComparaNumeroCodiceTesserati());
    }
    
    private int trovaNumeroCodice(String codice){
        return Integer.parseInt(codice.substring(1)); //se il codice è P23, substring(1) rende soltanto la parte oltre P, quindi solo 23
    }
    
    public ArrayList<Tesserato> listaTesseratiPerTipo(Class<? extends Tesserato> c){
        ArrayList<Tesserato> lista = new ArrayList<>();
        
        for (Tesserato t : listaTesserati) {
            if(c == t.getClass()) lista.add(t);
        }
        
        return lista;
    }
    
    public ArrayList<Tesserato> listaTesseratiOrdinataPerNumGareEffettuate(){
        ArrayList<Tesserato> lista = listaTesseratiPerTipo(Agonista.class);
        lista.sort(new ComparaNumGareEffettuateTesserati());
        return lista;
    }

    @Override
    public String toString() {
        String s = "Lista palestrati:\n";
        for (Tesserato t : listaTesserati) {
            s += "\n" + t.toString() + "\n";
        }
        return s;
    }
    
    public String toStringCodice(){
        String s = "";
        
        for (Tesserato t : listaTesserati) {
            s += t.getCodiceTessera() + " - " + t.getCognome() + "\n";
        }
        return s;
    }
    
    public String toStringCodiceECognomi(){
        String s = "";
        
        for (Tesserato t : listaTesserati) {
            s += t.getCodiceTessera() + " - " + t.getCognome() + "\n";
        }
        return s;
    }
    
    private class ComparaNumGareEffettuateTesserati implements Comparator<Tesserato>{
        @Override
        public int compare(Tesserato o1, Tesserato o2){
            if(o1.getInfoGara().getPartecipazioniGare() > o2.getInfoGara().getPartecipazioniGare()) return 1;
            if(o1.getInfoGara().getPartecipazioniGare() < o2.getInfoGara().getPartecipazioniGare()) return -1;
            return 0;
        }
    }
    
    private class ComparaNumeroCodiceTesserati implements Comparator<Tesserato>{
        @Override
        public int compare(Tesserato o1, Tesserato o2) {
            if(trovaNumeroCodice(o1.getCodiceTessera()) > trovaNumeroCodice(o2.getCodiceTessera())) return 1;
            if(trovaNumeroCodice(o1.getCodiceTessera()) < trovaNumeroCodice(o2.getCodiceTessera())) return -1;
            return 0;
        }
    }
    
    private class ComparaCognomeTesserati implements Comparator<Tesserato>{
        @Override
        public int compare(Tesserato o1, Tesserato o2) {
            return o1.getCognome().compareTo(o2.getCognome());
        }
    }
    
}
