public class ArgumentosPrograma{
	public static void main (String [] args){
		double resultado = 0;
		for(int i = 0; i < args.length; i++){
			System.out.println("Argumentos: " + args[i]);
			double numero = Double.parseDouble(args[i]);
			resultado += numero;
		}

		System.out.println(resultado);
	}
}