public class AlgoritmosOrdenamiento{
	

	public int[] ordenarSeleccion (int [] arreglo){
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
		int [] x = {10,5,20,6,8,3,7,1,0,1,1,1,1,1,20,20};
		AlgoritmosOrdenamiento ao = new AlgoritmosOrdenamiento();
		ao.ordenarSeleccion(x);
		ao.imprimir(x);
	}


}