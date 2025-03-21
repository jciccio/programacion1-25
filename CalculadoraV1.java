public class CalculadoraV1{
	private double valorA;
	private double valorB;
	private double resultado;

	public void setValorA(double valorA){
		this.valorA = valorA;
	}
	public void setValorB(double valorB){
		this.valorB = valorB;
	}
	public double getValorA(){
		return valorA;
	}
	public double getValorB(){
		return valorB;
	}
	public double getResultado(){
		return resultado;
	}
	public void sumar(){
		resultado = valorA + valorB;
	}
	public void restar(){
		resultado = valorA - valorB;
	}
	public void multiplicar(){
		resultado = valorA * valorB;
	}
	public void dividir(){
		resultado = valorA/valorB;
	}
}