public class Quiz3{
	
	public boolean esPalindromo(String hilera){
		boolean palindromo = true;

		hilera = hilera.toLowerCase();
		int contadorIzq = 0;
		int contadorDer = hilera.length() -1;
		while(contadorIzq < contadorDer && palindromo){
			if(hilera.charAt(contadorIzq) == ' '){
				contadorIzq++;
			}
			if(hilera.charAt(contadorDer) == ' '){
				contadorDer--;
			}
			if(hilera.charAt(contadorIzq) != hilera.charAt(contadorDer)){
				palindromo = false;
			}
			if(hilera.charAt(contadorIzq) != ' ' && hilera.charAt(contadorDer) != ' '){
				contadorIzq++;
				contadorDer--;
			}	
		}
		return palindromo;
	}

	public double calcularPromedio (double [] arreglo){
		double suma = 0;
		for(int i = 0 ; i < arreglo.length; i++){
			suma += arreglo[i];
		}
		return suma / arreglo.length;
	}

	public static void main (String args[]){
		Quiz3 q3 = new Quiz3();
		System.out.println(q3.esPalindromo("Ana"));
		System.out.println(q3.esPalindromo("Anita"));
		System.out.println(q3.esPalindromo("Anita lava la tina"));

		double [] arreglo = {1,2,3,4.56};
		System.out.println(q3.calcularPromedio(arreglo));


	}

}