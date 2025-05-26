public class AlgoritmosOrdenamiento{


	public int[] clonar(int [] arreglo){
		int [] copia = new int [arreglo.length];
		for(int i = 0; i < arreglo.length; i++){
			copia[i] = arreglo[i];
		}
		return copia;
	}


	public int[] ordenarBurbuja(int [] entrada){
		int [] arreglo = clonar(entrada);
		for(int i = 0 ; i < arreglo.length; i++){
			for(int j = arreglo.length-1; j>i; j--){
				// queremos comparar J con J-1
				if(arreglo[j] < arreglo[j-1]){
					int temporal = arreglo[j];
					arreglo[j] = arreglo[j-1];
					arreglo[j-1] = temporal;
				}
			}
		}
		return arreglo;
	}

	public int[] ordenarInsercion(int [] entrada){
		int[] arreglo = clonar(entrada);
		for(int i = 1; i < arreglo.length; i++){
			int temporal = arreglo[i];
			int contador = i - 1;
			while(contador >= 0 && arreglo[contador] > temporal){
				arreglo[contador + 1] = arreglo[contador];
				contador--;
			}
			arreglo [contador + 1] = temporal;
		}
		return arreglo;
	}

	public int[] ordenarSeleccion (int [] entrada){
		int [] arreglo = clonar(entrada);
		for(int i = 0; i < arreglo.length - 1 ; i++){
			for(int j = i+1; j < arreglo.length; j++){
				if(arreglo[i] > arreglo[j]){
					int temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
		return arreglo;
	}

	public void imprimir(int [] arreglo){
		for(int i = 0; i < arreglo.length ; i++){
			System.out.print(arreglo[i] + " ");
		}
		System.out.println();
	}


	public static void main (String [] args){
		int [] x = {10,5,20,6,8,3,7,1,0,1,-1,1,1,1,20,20};
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		int [] arregloSeleccion = ao.ordenarSeleccion(x);
		ao.imprimir(arregloSeleccion);

		int [] arregloBurbuja = ao.ordenarBurbuja(x);
		ao.imprimir(arregloBurbuja);

		int [] arregloInsercion = ao.ordenarInsercion(x);
		ao.imprimir(arregloInsercion);
	}


}