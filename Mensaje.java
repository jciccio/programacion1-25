public class Mensaje {
	private int agenteFuente;
	private int agenteEmisor;
	private int agenteDestinatario;
	private String contenido;

	public Mensaje(int fuente, int emisor, int destinatario, String contenido){
		agenteFuente = fuente;
		agenteEmisor = emisor;
		agenteDestinatario = destinatario;
		this.contenido = contenido;
	}

	public int getDestinatario(){
		return agenteDestinatario;
	}

	public int getEmisor(){
		return agenteEmisor;
	}

	public int getFuente(){
		return agenteFuente;
	}

	public String getMensaje(){
		return mensaje;
	}

	public void setMensaje(String mensaje){
		this.mensaje = mensaje;
	}

	public void setFuente(int fuente){
		this.agenteFuente = fuente;
	}

	public void setFuente(int fuente){
		this.agenteEmisor = fuente;
	}
	public void setFuente(int fuente){
		this.agenteDestinatario = fuente;
	} 

}