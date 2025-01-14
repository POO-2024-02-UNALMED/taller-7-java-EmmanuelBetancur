package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 10 * getPaginas();
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    //metodos get

    public String getFecha(){
        return this.fecha;
    }
    
    public String getPrimicia(){
        return this.primicia;
    }

    //metodos set

    public void setFecha(String cfecha){
        this.fecha = cfecha;
    }

    public void setPrimicia(String cprimicia){
        this.primicia = cprimicia;
    }

    @Override
    public String toString() {
        return this.getOrigen() + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getFecha() + "\n" + this.getPrimicia();
    }

}