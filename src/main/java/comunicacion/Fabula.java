package comunicacion;

public class Fabula extends Escrito{
    private String ensenanzas;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 1 * this.getPaginas();
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    //metodo get

    public String getEnsenanza(){
        return ensenanzas;
    }

    //metodo set

    public void setEnsenanzas(String censenanzas){
        this.ensenanzas = censenanzas;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + getEnsenanza(); 
    }   

}