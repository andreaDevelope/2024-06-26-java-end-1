public class Elettore {
    private String nomeElettore;
    private String cognomeElettore;

    public Elettore(String nomeElettore, String cognomeElettore) {
        setNomeElettore(nomeElettore);
        setCognomeElettore(cognomeElettore);
    }

    public String getNomeElettore() {
        return nomeElettore;
    }

    public void setNomeElettore(String nomeElettore) {
        this.nomeElettore = nomeElettore;
    }

    public String getCognomeElettore() {
        return cognomeElettore;
    }

    public void setCognomeElettore(String cognomeElettore) {
        this.cognomeElettore = cognomeElettore;
    }

    public void vota(Candidato candidato, SistemaElettorale sistemaElettorale) throws IllegalArgumentException {
        sistemaElettorale.registraVoto(this, candidato);
    }
}