/*
Automovil
- velocidad: int [0...]
- marcha : int [-1...6]
- direccion: int[-90,90]

+ setVelocidad()
+ getVelocidad()
+ setMarcha()
+ getMarcha()
+ acelerar() -> tome velocidad actual y sumele 10
+ frenar() -> tome la velocidad actual y restele 8
+ girarDerecha() -> sumar 5
+ girarIzquierda() -> restar 5
+ imprimir()
*/

public class Automovil {

	private int marcha;
	private int direccion;
	private int velocidad;

	public Automovil(){
		marcha = 1;
		direccion = 0;
		velocidad = 0;
	}
	
	public void acelerar(){
		velocidad = velocidad + 10;
	}

	public int getVelocidad(){
		return velocidad;
	}

	public int getMarcha(){
		return marcha;
	}

	public void setVelocidad(int velocidad){
		this.velocidad = velocidad;
	}

	public void setMarcha(int marchaParametro){
		marcha = marchaParametro;
	}

	public void frenar(){
		velocidad = velocidad - 8;
	}

	public void girarIzquierda(){
		direccion = direccion - 5;
	}

	public void girarDerecha(){
		direccion = direccion + 5;
	}

	public void imprimir(){
		System.out.println("Datos del automovil\n\tVelocidad: "+ 
			velocidad + "\n\tMarcha: " + marcha + "\n\tDireccion: " + direccion);
	}

}