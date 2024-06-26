public class Suite extends CameraAlbergo {
    public Suite(int numeroCamera) {
        super(numeroCamera);
    }

    @Override
    public void setNumeroCamera(int numeroCamera) {
        setNumeroCamera(numeroCamera);
    }

    @Override
    public double calcolaCosto() {
        return 150.0; // Costo fisso per una suite
    }

    @Override
    public int numeroLetti() {
        return 3;
    }
}
