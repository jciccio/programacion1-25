public class Ahorcado{
	private String palabraSecreta ;
	private StringBuilder palabraDescubierta;
	private int intentosRestantes;

	public Ahorcado(String palabraSecreta){
		this.intentosRestantes = 7;
		this.palabraSecreta = palabraSecreta.toUpperCase();
		this.palabraDescubierta = new StringBuilder();
		for(int i = 0 ; i < palabraSecreta.length(); i++){
			palabraDescubierta.append("?");
		}
	}

	public String toString(){
		String datos= "intentos restantes: " + intentosRestantes + "\npalabra secreta: " + palabraSecreta +
		"\npalabra adivinada: " + palabraDescubierta+ "\n------\n";
		return datos;
	}

	private boolean gano(){
		return palabraDescubierta.toString().indexOf("?") == -1;
	}

	private boolean buscarLetra(String hilera){
		boolean encontrado = false;
		String copiaPalabra = palabraSecreta;
		int posicion = palabraSecreta.indexOf(hilera);
		int ultimaPosicion = 0;
		while(posicion != -1){
			int nuevaPosicion = ultimaPosicion + posicion;
			palabraDescubierta.replace(nuevaPosicion, nuevaPosicion+hilera.length(), hilera);
			copiaPalabra = copiaPalabra.substring(posicion + hilera.length());
			ultimaPosicion += posicion + hilera.length(); 
			posicion = palabraSecreta.indexOf(hilera);
			encontrado = true;
		}
		return encontrado;
		/*for(int i = 0 ;i < palabraSecreta.length(); i++){
			if(palabraSecreta.charAt(i) == hilera.charAt(0)){
				palabraDescubierta.replace(i, i+1, hilera.chartAt(0));
			}
		}*/
	}

	public void jugar(){
		Interfaz interfaz = new Interfaz();
		do{
			// Pedir una letra
			String letraUsuario = interfaz.solicitarHileraAlUsuario();
			// Buscar si la letra está
			boolean estaLaLetra = buscarLetra(letraUsuario);
			// Si la letra se encuentra, entonces cambiamos la palabra descubierta
			if(!estaLaLetra){// Si la letra no está, entonces restamos un intento
				intentosRestantes --;
			}
		}while(!gano() && intentosRestantes > 0);
		
		if(gano()){
			System.out.println("Gano :)");
		}
		else{
			System.out.println("Perdio :(");
		}
	}

	
	// Buscar una letra
	// Jugar
	// Algo que me permita saber si ganó
	// toString X
	// main X
	public static void main (String [] args){
		Ahorcado ahorcado = new Ahorcado ("PARALELEPIPEDO");
		System.out.println(ahorcado);

		Ahorcado ahorcado2 = new Ahorcado ("ESCUELA");
		System.out.println(ahorcado2);
	}
}