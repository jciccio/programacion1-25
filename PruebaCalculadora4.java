import javax.swing.JOptionPane;
public class PruebaCalculadora4{
	public static void main (String [] args){
		CalculadoraV2 calculadora = new CalculadoraV2();
		Interfaz interfaz = new Interfaz();
		int opcion = interfaz.solicitarNumeroEntero("Calculadora digite una opcion:\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir");
		
		if(opcion >= 1 && opcion <=4){
			double resultado = 0;
			char operacion = ' ';
			double valorA = interfaz.solicitarNumeroReal("Digite el primer valor");
			double valorB = interfaz.solicitarNumeroReal("Digite el segundo valor");
			if(opcion == 1){ // Sumar
				resultado = calculadora.sumar(valorA, valorB);
				operacion = '+';
			}
			else if(opcion == 2){ // Restar
	 			resultado = calculadora.restar(valorA, valorB);
	 			operacion = '-';
			}
			else if(opcion == 3){ // Multiplicar
				resultado = calculadora.multiplicar(valorA, valorB);
				operacion = '*';
			}
			else if(opcion == 4){ // Dividir
				resultado = calculadora.dividir(valorA, valorB);
				operacion = '/';
			}

			System.out.println(""+ valorA + operacion + valorB + " = " + resultado );
		}
	}
}