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

		Carta carta5 = new Carta(11, "Diamantes");
		carta5.imprimir();
		
		Carta carta6 = new Carta(12, "Diamantes");
		carta6.imprimir();
		
		Carta carta7 = new Carta(13, "Diamantes");
		carta7.imprimir();
		
		Carta carta8 = new Carta(1, "Diamantes");
		carta8.imprimir();
		carta8.imprimirIf();

		Carta carta9 = new Carta(100, "Diamantes");
		carta9.imprimir();
		carta9.imprimirIf();

	}

}