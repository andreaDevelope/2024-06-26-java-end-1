public abstract class CameraAlbergo {
    private int numeroCamera;

    public CameraAlbergo(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public int getNumeroCamera() {
        return numeroCamera;
    }

    public void setNumeroCamera(int numeroCamera) {
        this.numeroCamera = numeroCamera;
    }

    public abstract double calcolaCosto();

    public abstract int numeroLetti();
}
