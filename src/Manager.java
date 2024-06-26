public class Manager extends Impiegato {
    private double bonus;

    public Manager(String nome, String cognome, double salario, double bonus) {
        super(nome, cognome, salario);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void aumentaSalario(int percentuale) {
        setSalario((getSalario() * percentuale /20) + getBonus());
    }

    @Override
    public String toString() {
        return "Manager [nome=" + getNome() + getCognome() + ", salario=" + getSalario() + ", bonus=" + bonus + "]";
    }
}
