public class PruebaArreglo{
	

	public static void main (String [] args){
		Arreglo arreglo = new Arreglo();
		// Como crear e inicializar el arreglo
		int [] x = new int [10];

		x[0] = 75;
		x[8] = 12;
		x[9] = 3;
		x[1] = 11;
		x[2] = 14;
		x[3] = 43;
		x[4] = 41;
		x[5] = 52;

		arreglo.imprimir(x);
		// Cómo crear e inicializar por extensión
		int [] y = {1,3,5,7,9,11};
		arreglo.imprimir(y);

		// Cómo mezclar dos arreglos en uno
		int [] z = new int [x.length + y.length];
		arreglo.imprimir(z);

		// z 16, y 6, x 10
		for(int i = 0 ; i < x.length; i++){
			z[i] = x[i];
		}
		arreglo.imprimir(z);

		
		for(int i = x.length; i < z.length ; i++){
			z[i] = y[i - x.length];// 0,1,2,3,4,5
			
		}

		arreglo.imprimir(z);


		
		int [] numerosPares = arreglo.generarArreglo(10, 5);
		arreglo.imprimir(numerosPares);

		int [] numerosPares2 = arreglo.generarArreglo(75, 10);
		arreglo.imprimir(numerosPares2);

		int [] numerosPares3 = arreglo.generarArreglo(750, 2);
		arreglo.imprimir(numerosPares3);


		arreglo.imprimir(arreglo.generarPrimos(40));
	}

}