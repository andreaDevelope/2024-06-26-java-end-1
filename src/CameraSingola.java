public class CameraSingola extends CameraAlbergo {
    public CameraSingola(int numeroCamera) {
        super(numeroCamera);
        
    }

    @Override
    public void setNumeroCamera(int numeroCamera) {
        super.setNumeroCamera(numeroCamera);
    }

    @Override
    public double calcolaCosto() {
        return 50.0;
    }

    @Override
    public int numeroLetti() {
        return 1;
    }
}
