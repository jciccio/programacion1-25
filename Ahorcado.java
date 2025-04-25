import javax.swing.*;
public class Ahorcado{
	private String palabraSecreta ;
	private StringBuilder palabraUsuario;
	private int intentosRestantes;

	public Ahorcado(String palabraSecreta){
		this.intentosRestantes = 7;
		this.palabraSecreta = palabraSecreta.toUpperCase();
		this.palabraUsuario = new StringBuilder();
		for(int i = 0 ; i < palabraSecreta.length(); i++){
			palabraUsuario.append("?");
		}
	}

	public String toString(){
		String datos= "intentos restantes: " + intentosRestantes + "\npalabra secreta: " + palabraSecreta +
		"\npalabra adivinada: " + palabraUsuario+ "\n------\n";
		return datos;
	}

	private boolean gano(){
		return palabraUsuario.toString().indexOf("?") == -1;
	}

	private boolean buscarLetra(String hilera){
		// como buscamos una letra en el patron??
		// escuela => 
		// palabraSecreta.indexOf(hilera) // -1 > 
		boolean encontrado = false;
		String copiaPalabra = palabraSecreta;
		int posicion = copiaPalabra.indexOf(hilera);
		int ultimaPosicion = 0;
		while (posicion != -1){
			int nuevaPosicion = ultimaPosicion + posicion; 
			palabraUsuario.replace(
				nuevaPosicion, nuevaPosicion +hilera.length(), hilera);
			copiaPalabra = copiaPalabra.substring(posicion+hilera.length());
			ultimaPosicion += posicion+hilera.length();
			posicion = copiaPalabra.indexOf(hilera);
			encontrado = true;
		}
		return encontrado;
	}

	public void jugar(){
		// Mientras tenga intentos
		// Pedirle al usuario un valor
		// Vamos a ver si el valor se encuentra
		// Si se encuentra se modifica la palabra secreta
		// Si no se encuentra, se resta 1 a los intentos
		do{
			String letras = JOptionPane.showInputDialog(toString() + "\nDigite una letra(s):");
			boolean letraEncontrada = buscarLetra(letras.toUpperCase());
			if(!letraEncontrada){
				intentosRestantes--;
			}
		}while(intentosRestantes > 0 && !gano());

		if(gano()){
			JOptionPane.showMessageDialog(null, "Felicidades, ganó! :)");
		}
		else{
			JOptionPane.showMessageDialog(null, "Perdió :(");
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

		ahorcado.jugar();

		Ahorcado ahorcado2 = new Ahorcado ("ESCUELA");
		System.out.println(ahorcado2);
	}
}