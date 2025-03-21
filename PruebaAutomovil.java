public class PruebaAutomovil{
	public static void main (String [] args){
		Automovil auto1 = new Automovil();
		auto1.imprimir();

		Automovil auto2 = new Automovil();
		auto2.acelerar();
		auto2.acelerar();
		auto2.acelerar();
		auto2.frenar();
		auto2.girarDerecha();
		auto2.girarDerecha();
		auto2.girarDerecha();
		auto2.imprimir();

		Automovil auto3 = new Automovil();
		auto3.acelerar();
		auto3.acelerar();
		auto3.frenar();
		auto3.girarIzquierda();
		auto3.girarIzquierda();
		auto3.imprimir();

		int marchaAuto3 = auto3.getMarcha();
		auto3.setMarcha(marchaAuto3 + 1);
		auto3.imprimir();

		marchaAuto3 = auto3.getMarcha();
		auto3.setMarcha(marchaAuto3 + 1);
		auto3.imprimir();

		marchaAuto3 = auto3.getMarcha();
		auto3.setMarcha(marchaAuto3 + 1);
		auto3.imprimir();
	}
}