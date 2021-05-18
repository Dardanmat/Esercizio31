package informatica.esercizio31;

public abstract class Tesserato {
    
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private String codiceTessera;
    private Gara infoGara;
    private Corso corso;

    public Tesserato(String nome, String cognome, String CodiceFiscale, Corso corso, Gara infoGara) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = CodiceFiscale;
        this.corso = corso;
        this.infoGara = infoGara;
        
        this.codiceTessera = generaCodiceTessera();
    }
    
    public Tesserato(String nome, String cognome, String CodiceFiscale, Corso corso) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = CodiceFiscale;
        this.corso = corso;
        this.infoGara = new Gara();
        
        this.codiceTessera = generaCodiceTessera();
    }

    public Gara getInfoGara() {
        return infoGara;
    }

    public void setInfoGara(Gara infoGara) {
        this.infoGara = infoGara;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceTessera() {
        return codiceTessera;
    }

    public void setCodiceTessera(String codiceTessera) {
        this.codiceTessera = codiceTessera;
    }

    public Corso getCorso() {
        return corso;
    }

    public void setCorso(Corso corso) {
        this.corso = corso;
    }
    
    public abstract String generaCodiceTessera();

    @Override
    public String toString() {
        return "Informazioni di " + nome + " " + cognome + ":" 
                + "\n -Codice Fiscale: " + codiceFiscale 
                + "\n -Codice Tessera: " + codiceTessera 
                + "\n -Corso: " + corso.toString();
    }
    
    
    
}
