public class CalculadoraOraciones{

	public int calcularOracion (String oracion){
		int [] mayusculas = {(int)'A', (int)'Z'};
		int [] minusculas = {(int)'a', (int)'z'};
		int [] numeros = {(int)'0', (int)'9'};

		int suma = 0;
		for(int i = 0; i < oracion.length(); i++){
			int letraN = (int)oracion.charAt(i); 
			if(letraN >= mayusculas[0] && letraN <= mayusculas[1]){
				suma += letraN - mayusculas[0] + 1;
			}
			if(letraN >= minusculas[0] && letraN <= minusculas[1]){
				suma += (letraN - minusculas[0] + 1) * 2;
			}
			if(letraN >= numeros[0] && letraN <= numeros[1]){
				suma += (letraN - numeros[0]);
			}
			if(letraN == '.')
				suma += 1;
			if(letraN == '!')
				suma += 2;
			if(letraN == '?')
				suma += 3;
		}
		return suma;
	}


	public static void main (String args []){
		String oracion = "Hola1";
		CalculadoraOraciones co = new CalculadoraOraciones();
		System.out.println(co.calcularOracion(oracion));
		

	}	
}