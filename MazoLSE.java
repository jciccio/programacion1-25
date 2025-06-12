public class MazoLSE{
	private Nodo primero;

	private class Nodo{
		private Nodo siguiente;
		private Carta carta;

		public Nodo(Carta carta){
			this.carta = carta;
			siguiente = null;
		}

		public Nodo(int numero, String palo){
			carta = new Carta(numero, palo);
			siguiente = null;
		}

		public String toString(){
			return carta.toString() + "\n";
		}
	}

	public MazoLSE(){
		String [] palos = {"Diamantes", "Corazones", "Treboles", "Espadas"};
		for(int i = 0; i < 4; i++){
			for(int j = 1 ; j <= 13; j++){
				agregarAlFinal(new Carta(j, palos[i]));
			}
		}
	}


	public void agregarAlInicio(Carta carta){
		Nodo nuevo = new Nodo(carta);
		nuevo.siguiente = primero;
		primero = nuevo;
	}

	public void agregarAlFinal(Carta carta){
		Nodo nuevo = new Nodo(carta);
		if(primero == null){
			primero = nuevo;
		}
		else{
			Nodo actual = primero;
			while(actual.siguiente != null){
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public String toString(){
		Nodo actual = primero;
		String contenido = ">>>>>>Lista<<<<<\n";
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido;
	}

	public String imprimir(){
		return imprimir(primero);
	}

	private String imprimir(Nodo nodo){
		String retorno = "";
		if(nodo != null){
			retorno += nodo.toString() + imprimir(nodo.siguiente);
		}
		return retorno;		
	}

	public Carta buscarCarta(int numero, String palo){
		Carta retorno = null;
		Nodo actual = primero;
		while(retorno == null && actual != null){
			if(numero == actual.carta.getNumero() && palo.equals(actual.carta.getPalo())){
				retorno = actual.carta;
			}
			actual = actual.siguiente;
		}
		return retorno;
	}


	public static void main (String [] args){
		MazoLSE mazo = new MazoLSE();
		System.out.println(mazo);	
	}


}