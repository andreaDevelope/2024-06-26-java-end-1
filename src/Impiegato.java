public class Impiegato {
    private String nome;
    private String cognome;
    private double salario;

    public Impiegato(String nome, String cognome, double salario) {
        setNome(nome);
        setSalario(salario);
        setCognome(cognome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentaSalario(int percentuale) {
        salario += getSalario() * percentuale / 100.0;
    }

    @Override
    public String toString() {
        return "Impiegato nome=" + nome + cognome + ", salario=" + salario;
    }
}
