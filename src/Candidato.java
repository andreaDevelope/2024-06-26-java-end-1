public class Candidato {
    private String nomeCandidato;
    private String cognomeCandidato;

    public Candidato(String nomeCandidato, String cognomeCandidato) {
        setNomeCandidato(nomeCandidato);
        setCognomeCandidato(cognomeCandidato);
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getCognomeCandidato() {
        return cognomeCandidato;
    }

    public void setCognomeCandidato(String cognomeCandidato) {
        this.cognomeCandidato = cognomeCandidato;
    }
}
