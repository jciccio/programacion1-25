public class Quiz4{

	
	public double sumarArreglo(double [] arreglo, int i){
		double resultado = 0;
		if(arreglo != null){
			if(i < arreglo.length){
				resultado = arreglo[i] + sumarArreglo(arreglo, i+1);		
			}
		}
		return resultado;
	}

	public void imprimirArreglo(double [] arreglo, int i){
		if(arreglo != null){
			if(i == arreglo.length -1){
				System.out.print(arreglo[i] + "\n");
			}
			else{
				System.out.print(arreglo[i] + " ");
				imprimirArreglo(arreglo, i+1);
			}
		}
	}
}