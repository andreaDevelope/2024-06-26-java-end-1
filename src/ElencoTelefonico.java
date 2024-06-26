import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ElencoTelefonico {
    private List<Contatto> elenco;

    public ElencoTelefonico() {
        this.elenco = new ArrayList<>();
    }

    public void aggiungiContatto(Contatto contatto) {
        elenco.add(contatto);
    }

    public void rimuoviContatto(String nome) {
        Iterator<Contatto> iterator = elenco.iterator();
        while (iterator.hasNext()) {
            Contatto contatto = iterator.next();
            if (contatto.getNome().equals(nome)) {
                iterator.remove();
                return;
            }
        }
    }

    public Contatto cercaContatto(String nome) {
        for (Contatto contatto : elenco) {
            if (contatto.getNome().equals(nome)) {
                return contatto;
            }
        }
        return null;
    }
}
