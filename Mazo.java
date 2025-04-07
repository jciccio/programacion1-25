public class Mazo{
	
	private Carta [] cartas;


	public Mazo(){
		cartas = new Carta [52];
		int contador = 0;
		for(int palo = 0; palo <4 ; palo++){
			for(int i = 0; i < 13; i++){
				Carta carta = new Carta(i+1, obtenerPalo(palo));
				cartas [contador] = carta;
				contador++;
			}
		}
	}

	private String obtenerPalo(int i){
		String palo = "";
		switch(i){
		case 0:
			palo = "Treboles";
			break;
		case 1:
			palo = "Corazones";
			break;
		case 2:
			palo = "Espadas";
			break;
		case 3:
			palo = "Diamantes";
			break;
		}
		return palo;
	}


	public void revolver(){
		for(int i = 0 ; i < cartas.length ;i++){
			// Voy a intercambiar i con algo aleatorio
			int aleatorio = (int)(Math.random() * 52); //[0,1[
			Carta temp = cartas[i];
			cartas[i] = cartas[aleatorio];
			cartas[aleatorio] = temp;
		}
	}

	public void imprimir(){
		for(int i = 0 ; i < cartas.length; i++){
			cartas[i].imprimir();
		}
	}
}