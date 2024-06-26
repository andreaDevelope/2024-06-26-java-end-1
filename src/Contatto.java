public class Contatto {
    private String nome;
    private String numeroTelefono;
    private int numTelDim;

    public Contatto(String nome, String numeroTelefono) {
        setNome(nome);
        setNumeroTelefono(numeroTelefono);
        numTelDim = 13;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) throws IllegalArgumentException {
        if (!isValidNumeroTelefono(numeroTelefono)) {
            throw new IllegalArgumentException("Numero di telefono non valido.");
        }
        this.numeroTelefono = numeroTelefono;
    }

    private boolean isValidNumeroTelefono(String numeroTelefono) {
        return numeroTelefono.length() > 0 || numeroTelefono.length() < numTelDim ; 
    }
}
