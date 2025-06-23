// Este comentario lo hicimos con nuestra interfaz

import java.io.Serializable;
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

// 1..13 => 11 -> J 12-> Q 13 -> K 1-> As

public class Carta implements Serializable{
	private int numero;
	private String palo;

	private String convertirNumero(){
		String numeroString = "";
		switch(numero){
			case 11:
				numeroString = "J";
			break;
			case 12:
				numeroString = "Q";
			break;
			case 13:
				numeroString = "K";
			break;
			case 1:
				numeroString = "As";
			break;
			default:
				numeroString += numero;
		}
		return numeroString;
	}

	private String convertirNumeroIf(){
		String numeroString = "";
		if(numero == 11){ // = ==
			// Lo que quiero que se ejecute
			numeroString = "J";
		}
		else{
			if(numero == 12){
				numeroString = "Q";
			}
			else{
				if(numero == 13){
					numeroString = "K";
				}
				else{
					if(numero == 1){
						numeroString = "As";
					}
					else{
						numeroString += numero; 
					}
				}
			}
		}
		return numeroString;
	}

	private String convertirNumeroIf2(){
		String numeroString = "";
		if(numero == 11){ // = ==
			// Lo que quiero que se ejecute
			numeroString = "J";
		}
		else if(numero == 12){
			numeroString = "Q";
		}
		else if(numero == 13){
			numeroString = "K";
		}
		else if(numero == 1){
			numeroString = "As";
		}
		else{
			numeroString += numero; 
		}
		
		return numeroString;
	}


	// Constructor de clase
	// Primer metodo que se ejecuta cuando se genera una instancia
	public Carta(){
		numero = 6;
		palo = "Espadas";
	}


	public Carta(int numero, String palo){
		if(numero >= 1 && numero <=13){
			this.numero = numero;
		}
		this.palo = palo;
	}

	public void setNumero(int numero){
		if(numero > 0 && numero < 14){
			this.numero = numero;	
		}
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
		System.out.println( convertirNumero() + " de " + palo);
	}

	public void imprimirIf(){
		System.out.println( convertirNumeroIf() + " de " + palo);
	}


	public String toString(){
		return convertirNumero() + " de " + palo;
	}


	public static void main (String [] args){
		Carta carta1 = new Carta();
		System.out.println(carta1);
	}

	
}
