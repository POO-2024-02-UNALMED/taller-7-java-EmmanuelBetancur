package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 2 * this.getPaginas();
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    //metodos get

    public String getCo_autor() {
        return co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    //metodos set

    public void setCo_autor(String cco_autor) {
        co_autor = cco_autor;
    }

    public void setEditorial(String ceditorial) {
        editorial = ceditorial;
    }

    public void setEdicion(String cedicion) {
        edicion = cedicion;
    }

    @Override
    public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getCo_autor() + "\n" + this.getEditorial() + "\n" + this.getEdicion();
    }

    
}