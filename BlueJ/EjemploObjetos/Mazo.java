public class Mazo{
	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;


	public Mazo(){
		carta1 = new Carta();
		carta2 = new Carta(8, "Corazones");
		carta3 = new Carta();
		carta3.setPalo("Diamantes");
		carta3.setNumero(2);
	}

	public void imprimir(){
		carta1.imprimir();
		carta2.imprimir();
		carta3.imprimir();
	}
}