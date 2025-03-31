public class CajaFuerte{
	private boolean estaAbierta; // Tenemos dos estados: abierto, cerrado
	private int combinacion; //1234

	public CajaFuerte(int combinacionParametro, boolean estaAbierta){
		this.estaAbierta = estaAbierta;
		this.combinacion = combinacionParametro;
	} 

	public void setEstaAbierta(boolean estaAbierta){
		this.estaAbierta = estaAbierta;
	}

	public void setCombinacion(int combinacionParametro){
		combinacion = combinacionParametro;
	}

	public boolean getEstaAbierto(){
		return estaAbierta;
	}

	public int getCombinacion(){
		return combinacion;
	}

}