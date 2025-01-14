// Clase Alfabeto
package comunicacion;

public class Alfabeto extends Pictograma {
    private static String[] letras;

    // Constructor
    public Alfabeto(String origen, String[] letras) {
        super(origen);
        Alfabeto.letras = letras;
    }

    // Metodos get y set
    public static String[] getLetras() {
        return letras;
    }

    public static void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    // Metodo interpretacion
    @Override
    public String interpretacion() {
        return "Interpretación no definida en la clase Alfabeto.";
    }

    // Metodo toString
    @Override
    public String toString() {
        return String.join(", ", letras);
    }
}