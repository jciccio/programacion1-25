public class  PruebaCalculadora{
	public static void main(String [] args){
		CalculadoraV1 calcu1 = new CalculadoraV1();
		calcu1.setValorA(10.25);
		calcu1.setValorB(3.14);
		calcu1.sumar();
		double resultadoOperacion = calcu1.getResultado();
		System.out.println(calcu1.getValorA() + " + " +  calcu1.getValorB() +" = " +resultadoOperacion);

		calcu1.setValorA(resultadoOperacion);
		calcu1.restar();
		resultadoOperacion = calcu1.getResultado();
		System.out.println(calcu1.getValorA() + " - " +  calcu1.getValorB() +" = " +resultadoOperacion);

		calcu1.setValorB(resultadoOperacion);
		calcu1.multiplicar();
		resultadoOperacion = calcu1.getResultado();
		System.out.println(calcu1.getValorA() + " * " +  calcu1.getValorB() +" = " +resultadoOperacion);

		calcu1.setValorB(resultadoOperacion);
		calcu1.dividir();
		resultadoOperacion = calcu1.getResultado();
		System.out.println(calcu1.getValorA() + " / " +  calcu1.getValorB() +" = " +resultadoOperacion);
	

		CalculadoraV2 calcu2 = new CalculadoraV2();
		double valor1 = 10.88;
		double valor2 = 292.1292;
		double resultado = calcu2.sumar(valor1, valor2);
		System.out.println(valor1 +" + " + valor2 +" = "  +resultado);

	}
}