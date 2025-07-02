public class TrabajoEnClase {
	
	public boolean estanParentesisBalanceados(String operacion){
		int contador = 0;
		for(int i = 0 ; i < operacion.length() && contador >= 0 ; i++){
			if(operacion.charAt(i) == '(')
				contador++;
			if(operacion.charAt(i) == ')')
				contador--;
		}
		return contador == 0;
	}

	public double calcularRaiz (double numero){
		double mitad = numero/2;
		double error = 0.001; 
		double raiz = mitad;
		while(numero - error > raiz*raiz || raiz*raiz < numero + error){
			mitad /= 2;
			raiz += raiz*raiz < numero ? mitad : -mitad;
		}
		return raiz;
	}
}