public class Matrices{
	
	public int[][] crearMatriz(int filas, int columnas, int base){
		filas = filas < 0 ? filas * -1: filas;
		columnas = columnas < 0 ? columnas * -1 : columnas;

		int [][] matriz = new int [filas][columnas];
		int contador = 1;
		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = contador * base;
				contador++;
			}
		}
		return matriz;
	}


	public char[][] crearMatriz(int filas, int columnas){
		// 2,3
		// a b c
		// d e f
		String abecedario = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		filas = filas < 0 ? filas * -1: filas;
		columnas = columnas < 0 ? columnas * -1 : columnas;
		char [][] matriz = new char [filas][columnas];	
		int contador = 0;

		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = abecedario.charAt(contador % abecedario.length());
				contador++;
			}
		}
		return matriz;
	}

	public char[][] crearMatrizLetras(int filas, int columnas){
		filas = filas < 0 ? filas * -1: filas;
		columnas = columnas < 0 ? columnas * -1 : columnas;
		char [][] matriz = new char [filas][columnas];	
		int contador = (int)'A';

		for(int f = 0 ; f < matriz.length; f++){
			for(int c = 0; c < matriz[f].length; c++){
				matriz[f][c] = (char) (contador);
				if(contador == (int)'Z'){
					contador = (int)'A';
				}
				else{
					contador++;	
				}	
			}
		}
		return matriz;
	}

	public void imprimir(int [][] matriz){
		for(int f = 0 ; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				 System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
	}

	public void imprimir(char [][] matriz){
		for(int f = 0 ; f < matriz.length; f++){
			for (int c = 0 ; c < matriz[f].length; c++){
				 System.out.print(matriz[f][c] + "\t");
			}
			System.out.println();
		}
	}


	public int [][] multiplicarMatrices (int [][] matrizA, int[][] matrizB){
		// Ver si se puede multiplicar 
		// SI la cantidad de columnas de la MatrizA es = a la cantidad e filas de la matrizB
		int [][] resultado = null;
		if(matrizA[0].length == matrizB.length){
			// Se puede multiplicar
			resultado = new int [matrizA.length][matrizB[0].length];
			for(int f = 0; f < resultado.length; f++){
				for(int c =0; c < resultado[f].length; c++){
					resultado[f][c] = calcularProductoPunto(matrizA[f], obtenerColumna(matrizB, c));
				}
			}
		}
		return resultado;
	}


	public int [] obtenerColumna (int [][] matriz, int columna){
		int [] resultado = new int [matriz.length];
		for(int i =0 ; i < matriz.length; i++){
			resultado[i] = matriz[i][columna];
		}
		return resultado;
	}

	public int calcularProductoPunto(int[] a, int []b){
		int resultado = 0;
		for(int i = 0; i < a.length; i++){
			resultado += a[i] * b[i];
		}

		return resultado;
	}


	public static void main (String [] args){

		Matrices matrizInstancia = new Matrices();
		


		/*int [][] matrizNumeros = new int [5][10]; 

		matrizNumeros[2][1] = 6;
		matrizNumeros[3][1] = 61;
		matrizNumeros[2][4] = 60;
		System.out.println("matrizNumeros[2][4] = " + matrizNumeros[2][4]);
		
		matrizInstancia.imprimir(matrizNumeros);
		matrizInstancia.imprimir(matrizInstancia.crearMatriz(5,10,5));

		matrizInstancia.imprimir(matrizInstancia.crearMatriz(8,9));

		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((int)'B');
		System.out.println((int)'Z');

		matrizInstancia.imprimir(matrizInstancia.crearMatrizLetras(20,3));*/


		
	}
}