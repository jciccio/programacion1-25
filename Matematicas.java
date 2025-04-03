public class Matematicas{

	// Método factorial
	// 5 => 5*4*3*2*1
	public int calcularFactorial(int n){
		int resultado = 1;
		if(n < 0){
			resultado = -1;
		}
		for(int i = n; i > 1 ; i--){
			resultado *= i;
		}
		return resultado;
	}
	public int calcularPotencia(int base, int exponente){
		int resultado = base;
		while(exponente > 1){
			resultado *= base;
			exponente--;
		}
		return resultado;
	}

	// Si n es impar, hay que sumarle 1
	// Queremos iterar hasta llegar a n
	// Queremos cambiar el signo por cada iteracion
	public double calcularCoseno (int x, int n){
		if(n % 2 != 0){ // El numero es impar	
			n++;
		}
		double resultado = 1;
		int contador = 2;
		int signo = -1;
		while(contador <= n){
			double fraccion = (double)calcularPotencia(x,contador) / calcularFactorial(contador);
			resultado += (fraccion * signo);
			contador += 2;
			signo *= -1;
		}
		return resultado;
	}

	public static void main (String [] args){
		Matematicas mate = new Matematicas();
		System.out.println(mate.calcularFactorial(4));
		System.out.println(mate.calcularPotencia(2,8));
		System.out.println(mate.calcularCoseno(4,8));
	}

}