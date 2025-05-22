public class AlgoritmosBusqueda{
	
	public int busquedaSecuencial (int [] arreglo, int busqueda){
		int indice = -1;
		int i = 0;
		while( i < arreglo.length && indice == -1){
			if(arreglo[i] == busqueda){
				indice = i;
			}
			i++;
		}
		return indice;
	}

	public int busquedaBinaria(int [] arreglo, int busqueda){
		int indice = -1;
		if(arreglo != null){
			indice = busquedaBinaria(arreglo, busqueda, 0, arreglo.length);
		}
		return indice;
	}

	private int busquedaBinaria (int [] arreglo, int busqueda, int limInf, int limSup){
		int indice = -1;
		int celda = (limInf + limSup)/2;
		// caso trivial 1: los limites se traslapan
		if(limInf <= limSup && celda >= 0 && celda < arreglo.length){
			// caso trivial 2: encontramos el elemento 
			if(arreglo[celda] == busqueda){
				indice = celda;
			}
			// El Limite superior se mayor
			else if (arreglo[celda] > busqueda){
				// Que el valor del arreglo es mayor que lo que estamos buscando
				indice = busquedaBinaria(arreglo, busqueda, limInf, celda -1);
			}
			else{
				indice = busquedaBinaria(arreglo, busqueda, celda+1,limSup);
			}
		}
		return indice;
	}

}