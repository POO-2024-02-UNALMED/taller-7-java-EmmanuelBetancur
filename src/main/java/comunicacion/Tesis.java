package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion,String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return palabrasPagina * 5 * getPaginas();
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    //metodos get

    public String getIdea(){
        return idea;
    }

    public String[] getArgumentos(){
        return argumentos;
    }

    public String getConclusion(){
        return conclusion;
    }

    public String getReferencias(){
        return referencias;
    }

    //metodos set

    public void setIdea(String cidea){
        this.idea = cidea;
    }

    public void setArgumentos(String[] cargumentos){
        this.argumentos = cargumentos;
    }

    public void setConclusion(String cconclusion){
        this.conclusion = cconclusion;
    }

    public void setReferencias(String creferencias){
        this.referencias = creferencias;
    }

    @Override
    public String toString() {
        return this.getOrigen() + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.getIdea() + "\n" + this.argumentos.length + "\n" + this.getConclusion() + "\n" + this.getReferencias();  
    }
}