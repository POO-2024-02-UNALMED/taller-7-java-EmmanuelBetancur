package comunicacion;

public class Periodico extends Escrito {
    private String primicia;

    // Constructor
    public Periodico(String origen, String titulo, String autor, int paginas, String primicia) {
        super(origen, titulo, autor, paginas);
        this.primicia = primicia;
    }

    // Metodos get y set
    public String getPrimicia() {
        return primicia;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 10;
    }

    @Override
    public String interpretacion() {
        return primicia;
    }

    @Override
    public String toString() {
        return resumen() + "\n" +
               "Primicia: " + primicia;
    }
}