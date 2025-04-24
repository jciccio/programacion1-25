public class CopiaYReferencia{
	

	public void pasoPorCopia(int numero){
		numero = 100;
	}

	public void pasoPorReferencia (int [] numero){
		numero[0] = 27;
	}

	public void imprimir (int [] arreglo){
		for(int i = 0 ; i < arreglo.length; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

	public void modificarCarta(Carta carta1){
		carta1.setPalo("Diamantes");
		carta1.setNumero(11);
	}


	public static void main (String [] args){
		CopiaYReferencia cr = new CopiaYReferencia();

		Carta carta1 = new Carta(7, "Espadas");
		int numero = 50;
		cr.pasoPorCopia(numero);
		System.out.println(numero);

		int [] y = {1,2,3};
		cr.imprimir(y);

		cr.pasoPorReferencia(y);
		cr.imprimir(y);

		carta1.imprimir();
		cr.modificarCarta(carta1);
		carta1.imprimir();

	}


}