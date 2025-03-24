public class Calculadora{
    
        private Interfaz interfaz;
        
        public Calculadora(){
            interfaz = new Interfaz();
        }
        
        public double sumar(){
            double numero1 = interfaz.solicitarNumeroReal("Digite el numero 1");
            double numero2 = interfaz.solicitarNumeroReal("Digite el numero 2");
            return numero1 + numero2; 
        }
	
	public double sumar(double a, double b){
		return a + b;
	}

	public double restar(double a, double b){
		return a - b;
	}
	public double multiplicar(double a, double b){
		return a * b;
	}
	public double dividir(double a, double b){
		return a / b;
	}

}