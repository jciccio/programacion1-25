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


	public int [] eliminarDuplicados(int[] arregloEntrada){// 5
		int [] arregloSalida = new int [arregloEntrada.length]; // 5
		int ultimoIndice = 0;
		for(int i = 0; i < arregloEntrada.length; i++){
			int numero = arregloEntrada[i];

			// El ciclo nos regresa si está el número o no
			boolean sePuedeAgregar = true;
			for(int j = 0 ;  j < ultimoIndice; j++){
				if(arregloSalida[j] == numero){
					sePuedeAgregar = false;
				}
			}

			if(sePuedeAgregar){
				arregloSalida[ultimoIndice] = numero;
				ultimoIndice++;
			}
		} 
		int [] resultado = new int[ultimoIndice];
		for(int i = 0; i < ultimoIndice; i++){
			resultado[i] = arregloSalida[i];
		}
		return resultado;
	}

}