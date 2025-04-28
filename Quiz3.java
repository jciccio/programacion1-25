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

	
	public boolean esPalindromoVersion2(String hilera){
		hilera = hilera.toLowerCase();
		String reverso = "";
		String original = "";
		for(int i = 0 ; i < hilera.length(); i++){

			if(hilera.charAt(i) >= 'a' && hilera.charAt(i) <= 'z'){
				original += hilera.charAt(i);
			}
			if(hilera.charAt(hilera.length()-1-i) >= 'a' && hilera.charAt(hilera.length()-1-i) <= 'z'){
				reverso += hilera.charAt(hilera.length()-1-i);
			}
		}
		return original.equals(reverso);
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
		System.out.println("Ana: "+ q3.esPalindromo("Ana"));
		System.out.println("Anita: "+ q3.esPalindromo("Anita"));
		System.out.println("Anita lava la tina: " + q3.esPalindromo("Anita lava la tina"));

		System.out.println("Ana: " + q3.esPalindromoVersion2("Ana"));
		System.out.println("Anita: " + q3.esPalindromoVersion2("Anita"));
		System.out.println("Anita lava la tina: " + q3.esPalindromoVersion2("Anita lava la tina"));

		double [] arreglo = {1,2,3,4.56};
		System.out.println(q3.calcularPromedio(arreglo));


	}

}