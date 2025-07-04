public class Recursividad{

	public int calcularSumatoria(int n){
		int resultado = 0;
		if(n >= 0){
			if(n == 0){ // Caso base o trivial
			resultado = 0;
			}
			else{ // Caso recursivo
				resultado = n + calcularSumatoria(n-1);
			}
		}
		return resultado;
	}

	public double sumarArreglo(double [] arreglo, int i){
		double resultado = 0;
		if(arreglo != null){
			if(i < arreglo.length){
				resultado = arreglo[i] + sumarArreglo(arreglo, i+1);		
			}
		}
		return resultado;
	}

	// Factorial
	// 5! 5*4*3*2*1
	public int calcularFactorial(int n){
		int resultado = 0;
		if(n == 0){// Caso base o trivial
			resultado = 1;
		}
		else if(n>0){// Caso recursivo
			resultado = n * calcularFactorial(n-1);
		}
		return resultado;
	}

	public int calcularFibonacci(int n){
		int resultado = 0;
		if(n == 0){
			resultado = 0;
		}
		else if(n == 1){
			resultado = 1;
		}
		else {
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
		}

		return resultado;
	}



	public int calcularFibonacciV2(int n){
		 int [] numerosFibonacci = new int [n+1];
		 for(int i = 0 ; i< numerosFibonacci.length; i++){
		 	numerosFibonacci[i] = -1;
		 }
		 return calcularFibonacciOptimizado(n, numerosFibonacci);
	}

	private int calcularFibonacciOptimizado(int n, int [] valores){
		int resultado = 0;
		if(valores[n] != -1){
			resultado = valores[n];
		}
		else if(n == 0){
			resultado = 0;
			valores[n] = resultado;
		}
		else if(n == 1){
			resultado = 1;
			valores[n] = resultado;
		}
		else {
			resultado = calcularFibonacci(n-1) + calcularFibonacci(n-2);
			valores[n] = resultado;
		}

		return resultado;
	}

	public void calcularHanoi(int n, int origen, int intermedio, int destino){
		if(n == 1){
			System.out.println("Mover el disco " + n + " desde "+ origen + " hasta " + destino);
		}
		else {
			calcularHanoi(n-1, origen, destino , intermedio);
			System.out.println("Mover el disco " + n + " desde "+ origen + " hasta " + destino);
			calcularHanoi(n-1, intermedio, origen, destino);
		}

	}

	public static void main (String args[]){
		Recursividad recursividad = new Recursividad();
		System.out.println("La sumatoria de 5: " + recursividad.calcularSumatoria(5));
		System.out.println("La sumatoria de 10: " + recursividad.calcularSumatoria(10));

		recursividad.calcularHanoi(10,1,2,3);
	}
}