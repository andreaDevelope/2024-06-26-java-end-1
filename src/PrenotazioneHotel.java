public class PrenotazioneHotel {
    private Cliente cliente;
    private Camera camera;

    public PrenotazioneHotel(Cliente cliente, Camera camera) {
        this.cliente = cliente;
        this.camera = camera;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
