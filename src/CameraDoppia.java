public class CameraDoppia extends CameraAlbergo {
    public CameraDoppia(int numeroCamera) {
        super(numeroCamera);
        
    }

    @Override
    public void setNumeroCamera(int numeroCamera) {
        setNumeroCamera(numeroCamera);
    }

    @Override
    public double calcolaCosto() {
        return 80.0;
    }

    @Override
    public int numeroLetti() {
        return 2;
    }
}
