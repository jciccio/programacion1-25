public class Quiz5{
	

	public int calcularSuma(int [] arreglo, int i){
		int resultado = 0;
		if(arreglo != null){
			if(i< arreglo.length){
				int valor = (i%2==0) ? arreglo[i] : -arreglo[i];
				resultado = valor + calcularSuma(arreglo, i+1);
			}
		}
		return resultado;
	}

	public static void main (String [] args){
		Quiz5 q = new Quiz5();
		int [] arreglo = {1,2,3,4,5};
		q.calcularSuma(arreglo,0);
	}
}