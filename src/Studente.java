import java.util.ArrayList;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;
    private ArrayList<Integer> voti;

    public Studente(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.voti = new ArrayList<>();
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

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public ArrayList<Integer> getVoti() {
        return voti;
    }

    public void aggiungiVoto(int voto) throws IllegalArgumentException {
        if (voto < 0 || voto > 10) {
            throw new IllegalArgumentException("Il voto deve essere compreso tra 0 e 10.");
        }
        voti.add(voto);
    }

    public double calcolaMediaVoti() {
        if (voti.isEmpty()) {
            return 0;
        }
        int somma = 0;
        for (int voto : voti) {
            somma += voto;
        }
        return (double) somma / voti.size();
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome + " " + cognome);
        System.out.println("Matricola: " + matricola);
        System.out.println("Voti: " + voti);
        System.out.println("Media voti: " + calcolaMediaVoti());
    }
}
