public class Prenotazione {
    private boolean[] posti;

    public Prenotazione() {
        this.posti = new boolean[50];
    }

    public boolean[] getPosti() {
        return posti;
    }

    public void setPosti(boolean[] posti) {
        if (posti.length == 50) {
            this.posti = posti;
        } else {
            throw new IllegalArgumentException("L'array posti deve avere una lunghezza di 50.");
        }
    }

    public void prenota(int posto) throws IllegalArgumentException, IllegalStateException {
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido.");
        }
        if (!posti[posto]) {
            posti[posto] = true;
        } else {
            throw new IllegalStateException("Posto già prenotato.");
        }
    }

    public void annullaPrenotazione(int posto) throws IllegalArgumentException, IllegalStateException {
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido.");
        }
        if (posti[posto]) {
            posti[posto] = false;
        } else {
            throw new IllegalStateException("Il posto non era prenotato.");
        }
    }

    public boolean isDisponibile(int posto) throws IllegalArgumentException {
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido.");
        }
        return !posti[posto];
    }

    public boolean ciSonoPostiDisponibili() {
        for (boolean posto : posti) {
            if (!posto) {
                return true; 
            }
        }
        return false; 
    }

    public void stampaPosti() {
        for (int i = 0; i < posti.length; i++) {
            System.out.println("Posto " + i + ": " + (posti[i] ? "Prenotato" : "Libero"));
        }
    }
}