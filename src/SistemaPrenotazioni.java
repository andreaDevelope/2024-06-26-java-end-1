import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaPrenotazioni {
    private List<Camera> camere;
    private Map<Cliente, PrenotazioneHotel> prenotazioni;

    public SistemaPrenotazioni() {
        camere = new ArrayList<>();
        prenotazioni = new HashMap<>();
    }

    public void aggiungiCamera(Camera camera) {
        camere.add(camera);
    }

    public void effettuaPrenotazione(Cliente cliente, Camera camera) throws IllegalArgumentException {
        if (!camera.isDisponibile()) {
            throw new IllegalArgumentException("Camera non disponibile.");
        }
        PrenotazioneHotel prenotazione = new PrenotazioneHotel(cliente, camera);
        prenotazioni.put(cliente, prenotazione);
        camera.setDisponibile(false);
    }

    public void modificaPrenotazione(Cliente cliente, Camera nuovaCamera) throws IllegalArgumentException {
        PrenotazioneHotel prenotazione = prenotazioni.get(cliente);
        if (prenotazione == null) {
            throw new IllegalArgumentException("Nessuna prenotazione trovata per il cliente.");
        }
        if (!nuovaCamera.isDisponibile()) {
            throw new IllegalArgumentException("Nuova camera non disponibile.");
        }
        prenotazione.getCamera().setDisponibile(true);
        nuovaCamera.setDisponibile(false);
        prenotazione.setCamera(nuovaCamera);
    }

    public void cancellaPrenotazione(Cliente cliente) throws IllegalArgumentException {
        PrenotazioneHotel prenotazione = prenotazioni.remove(cliente);
        if (prenotazione == null) {
            throw new IllegalArgumentException("Nessuna prenotazione trovata per il cliente.");
        }
        prenotazione.getCamera().setDisponibile(true);
    }

    public void stampaPrenotazioni() {
        for (Map.Entry<Cliente, PrenotazioneHotel> entry : prenotazioni.entrySet()) {
            Cliente cliente = entry.getKey();
            PrenotazioneHotel prenotazione = entry.getValue();
            System.out.println("Cliente: " + cliente.getNome() + " " + cliente.getCognome() + ", Camera: " + prenotazione.getCamera().getNumero() + " (" + prenotazione.getCamera().getTipo() + ")");
        }
    }
}
