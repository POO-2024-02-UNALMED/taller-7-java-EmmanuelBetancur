package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras = new String [] {
			"A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    private String interpretacion;

    public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}


    public int cantidadLetras() {
        return letras.length;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }

    //metodos get

    public String[] getLetras() {
        return letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    //metodos set

    public void setLetras(String[] cletras) {
        letras = cletras;
    }

    public void setInterpretacion(String cinterpretacion) {
        interpretacion = cinterpretacion;
    }

}