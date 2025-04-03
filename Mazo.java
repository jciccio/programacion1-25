public class Mazo{
	

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


	public Mazo(){
		
		for(int palo = 0; palo <4 ; palo++){
			for(int i = 0; i < 13; i++){
				Carta carta = new Carta(i+1, obtenerPalo(palo));
				carta.imprimir();
			}
		}
		
	}

	public void imprimir(){
	
	}
}