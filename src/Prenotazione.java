public class Prenotazione {
    private boolean[] posti;

    public Prenotazione() {
        this.posti = new boolean[50];
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

    public void annullaPrenotazione(int posto) throws Exception, Exception {
        if (posto < 0 || posto >= posti.length) {
            throw new IllegalArgumentException("Numero di posto non valido.");
        }
        if (posti[posto]) {
            posti[posto] = false;
        } else {
            throw new IllegalStateException("Il posto non era prenotato o posto inesistente.");
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

    public boolean[] getStatoPosti() {
        return posti;
    }

}

