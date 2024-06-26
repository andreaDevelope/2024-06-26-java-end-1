public class ContoBancario {
    private String titolare;
    private double saldo;

    public ContoBancario(String titolare, double saldoIniziale) {
        this.titolare = titolare;
        this.saldo = saldoIniziale;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double importo) throws IllegalArgumentException {
        if (importo <= 0) {
            throw new IllegalArgumentException("L'importo del deposito deve essere positivo.");
        }
        saldo += importo;
    }

    public void preleva(double importo) throws IllegalArgumentException, IllegalStateException {
        if (importo <= 0) {
            throw new IllegalArgumentException("L'importo del prelievo deve essere positivo.");
        }
        if (importo > saldo) {
            throw new IllegalStateException("Fondi insufficienti.");
        }
        saldo -= importo;
    }
}
