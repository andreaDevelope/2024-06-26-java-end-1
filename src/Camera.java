public class Camera {
    private int numero;
    private String tipo; 
    private boolean disponibile;

    public Camera(int numero, String tipo) {
        setNumero(numero);
        setTipo(tipo);
        this.disponibile = true; 
        setDisponibile(disponibile);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }
}
