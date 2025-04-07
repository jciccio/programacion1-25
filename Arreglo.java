public class Arreglo{


	public int [] generarArreglo (int tam, int multiplo){
		int [] x = new int [tam];
		for(int i = 0 ; i < x.length ; i++){
			x[i] = multiplo * (i+1);
		} 
		return x;
	}

	public int [] generarPrimos (int tam){
		int [] primos = new int [tam];
		Matematicas mate = new Matematicas();
		int indice = 0;
		int numeroActual = 2;
		while(indice < primos.length){
			if(mate.esPrimo(numeroActual)){
				primos[indice] = numeroActual;
				indice++;
			}
			numeroActual++;
		}
		return primos;
	}

	public void imprimir(int [] arreglo){
		for(int i = 0; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}

}