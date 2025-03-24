public class PruebaCarta{
	
	public static void main (String [] args){
		Carta carta1 = new Carta();
		carta1.setNumero(7);
		carta1.setPalo("Corazones");
		carta1.imprimir();

		Carta carta2 = new Carta();
		carta2.imprimir();

		Carta carta3 = new Carta();
		carta3.imprimir();

		Carta carta4 = new Carta(10, "Diamantes");
		carta4.imprimir();
	}

}