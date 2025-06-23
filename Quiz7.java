public class Quiz7{
	// Se tiene un arreglo
	// Se desea saber si existe una partición
	// Donde la suma de los elementos de la izq sea igual a la suma de los elementos a la derecha

	public int buscarParticion(int [] arreglo){
		int particion = -1;
		for(int i = 0; i < arreglo.length && particion == -1; i++){
			int sumaIzq = 0;
			int sumaDer = 0;
			// Suma elementos izq
			for(int j = i; j >= 0; j--){
				sumaIzq += arreglo[j];
			}
			// Suma elementos der
			for(int j = i+1; j < arreglo.length; j++){
				sumaDer += arreglo[j];
			}
			// Se deben comparar las sumas luego de realizar una iteración
			if(sumaIzq == sumaDer){
				// Encontramos una particion, podemos finalizar el ciclo
				particion = i;
			}
		}
		return particion;
	} 
}