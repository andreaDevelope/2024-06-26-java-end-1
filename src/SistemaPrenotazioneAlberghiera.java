import java.util.ArrayList;
import java.util.List;

public class SistemaPrenotazioneAlberghiera {
    private List<CameraAlbergo> camereDisponibili;

    public SistemaPrenotazioneAlberghiera() {
        camereDisponibili = new ArrayList<>();
    }

    public void aggiungiCamera(CameraAlbergo camera) {
        camereDisponibili.add(camera);
    }

    public void rimuoviCamera(CameraAlbergo camera) {
        camereDisponibili.remove(camera);
        System.out.println("hai cancellato la prenotazione della camera: " + camera);
    }

    public void stampaCamereDisponibili() {
        for (CameraAlbergo camera : camereDisponibili) {
            System.out.println("Camera numero: " + camera.getNumeroCamera() + ", Tipo: " + camera.getClass().getSimpleName() + ", Costo: " + camera.calcolaCosto() + ", Letti: " + camera.numeroLetti());
        }
    }
}
