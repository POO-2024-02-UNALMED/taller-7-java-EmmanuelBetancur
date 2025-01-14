package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;

    // Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
    }

    // Metodos get y set
    public String getEnsenanzas() {
        return ensenanzas;
    }

    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }

    @Override
    public String interpretacion() {
        return ensenanzas;
    }

    @Override
    public String toString() {
        return resumen() + "\n" +
               "Ensenanzas: " + ensenanzas;
    }
}