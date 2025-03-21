/*

Carta
- numero
- palo
+ setNumero()
+ setPalo()
+ getNumero()
+ getPalo()
+ imprimir()
*/

public class Carta{
	private int numero;
	private String palo;


	// Constructor de clase
	// Primer metodo que se ejecuta cuando se genera una instancia
	public Carta(){
		numero = 6;
		palo = "Espadas";
	}


	public Carta(int numero, String palo){
		this.numero = numero;
		this.palo = palo;
	}




	public void setNumero(int numero){
		this.numero = numero;
	}

	public void setPalo(String palo){
		this.palo = palo;
	}

	public int getNumero(){
		return this.numero;
	}

	public String getPalo(){
		return this.palo;
	}

	public void imprimir(){
		System.out.println( numero + " de " + palo);
	}
}