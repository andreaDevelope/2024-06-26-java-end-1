public class Cliente {
    private String nome;
    private String cognome;
    private String idCliente;

    public Cliente(String nome, String cognome, String idCliente) {
        setNome(nome);
        setCognome(cognome);
        setIdCliente(idCliente);
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

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
}
