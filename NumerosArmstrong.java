public class NumerosArmstrong{
	

	public int obtenerCantidadDigitos (int numero){
		int cantidad = 0;
		while(numero > 0){
			numero /= 10;
			cantidad++;
		}
		return cantidad;
	}



	public int elevar (int base, int exponente){
		int resultado = 1;
		for(int i = 0; i < exponente; i++){
			resultado *= base;
		}
		return resultado;
	}

	public boolean esArmstrong(int numero){
		int n = numero;
		int cantidadDigitos = obtenerCantidadDigitos(n);
		int resultado = 0;
		while(n > 0){
			int digito = n%10;
			resultado += elevar(digito, cantidadDigitos);
			n /= 10;
		}
		return numero == resultado;
	}

	public int[] obtenerNumerosArmstrong(){
		int [] numeros = new int [10000];
		int ultimoIndice = 0;
		for (int i = 1; i < 10000; i++){
			if(esArmstrong(i)){
				numeros[ultimoIndice] = i;
				ultimoIndice++;
			}
		}
		int [] numerosArmstrong = new int[ultimoIndice];
		for(int i = 0; i < ultimoIndice; i++){
			numerosArmstrong[i] = numeros[i];
		}
		return numerosArmstrong;
	}


	public static void main (String [] args){
		NumerosArmstrong armstrong = new NumerosArmstrong();
		System.out.println(armstrong.obtenerCantidadDigitos(12345));
		System.out.println(armstrong.elevar(2,8));
		System.out.println(armstrong.esArmstrong(153));

		Arreglo arreglo  = new Arreglo();
		arreglo.imprimir( armstrong.obtenerNumerosArmstrong());
	}
}