import java.util.HashMap;
import java.util.Map;

public class SistemaElettorale {
    private Map<Candidato, Integer> conteggioVoti;
    private Map<String, Candidato> candidatiRegistrati;

    public SistemaElettorale() {
        conteggioVoti = new HashMap<>();
        candidatiRegistrati = new HashMap<>();
    }

    public void registraCandidato(Candidato candidato) {
        candidatiRegistrati.put(candidato.getNomeCandidato(), candidato);
        conteggioVoti.put(candidato, 0); 
    }

    public void registraVoto(Elettore elettore, Candidato candidato) throws IllegalArgumentException {
        if (!candidatiRegistrati.containsValue(candidato)) {
            throw new IllegalArgumentException("Il candidato non è registrato nel sistema.");
        }

        
        for (Candidato c : conteggioVoti.keySet()) {
            if (conteggioVoti.get(c) > 0 && c.equals(candidato)) {
                throw new IllegalArgumentException("voto illegale arresto imminente");
            }
        }

        int votiAttuali = conteggioVoti.get(candidato);
        conteggioVoti.put(candidato, votiAttuali + 1);
    }

    public void stampaRisultati() {
        for (Candidato candidato : conteggioVoti.keySet()) {
            System.out.println("Candidato: " + candidato.getNomeCandidato() + " " + candidato.getCognomeCandidato() + " - Voti ricevuti: " + conteggioVoti.get(candidato));
        }
    }
}
