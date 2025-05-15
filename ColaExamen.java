public class ColaExamen{
	private Mensaje [] cola;;
	private int siguienteIndice;

	// Voy a llenar la cola de 0 hacia arriba
	// El indice 0 siempre es el siguiente que vamos a sacar de la cola
	public ColaExamen(){
		cola = new Mensaje[100];
		siguienteIndice = 0; 
	}

	// Verificar para quien es el mensaje
	// Agregar a la cola
	// Quitar de la cola

	public int getIdMensajeEnCola(){
		int identificador = -1;
		if(cola[0] != null){
			identificador = cola[0].getDestinatario();
		}
		return identificador;
	}

	public boolean tieneAutorizacion(int id){
		boolean permiso = false;
		if(cola[0] != null && cola[0].getDestinatario() == id){
			permiso = true;
		}
		return permiso;
	}

	public void agregarACola(Mensaje mensaje){
		if(siguienteIndice >= cola.length){
			duplicarTamanio();
		}
		cola[siguienteIndice] = mensaje;
		siguienteIndice++;
	}

	public void duplicarTamanio(){
		Mensaje [] colaCopia = new Mensaje[cola.length*2];
		for(int i = 0; i < cola.length; i++){
			colaCopia[i] = cola[i];
		}
		this.cola = colaCopia;
	}

	public Mensaje quitarCola(){
		Mensaje mensaje = null;
		if(siguienteIndice > 0){
			mensaje = cola[0];
			cola[siguienteIndice-1] = null;
			for(int i = 1; i < siguienteIndice; i++){
				cola[i-1] = cola[i];
			}
			siguienteIndice--;	
		}
		
		return mensaje;
	} 
}