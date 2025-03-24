import javax.swing.JOptionPane;
public class PruebaCalculadora3{
	
	public static void main (String [] args){
		Interfaz interfaz = new Interfaz();
		CalculadoraV2 calculadora = new CalculadoraV2();
		double numero1 = interfaz.solicitarNumeroReal("Digite un numero");
		double numero2 = interfaz.solicitarNumeroReal("Digite otro numero mas");

		JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+ 
			calculadora.sumar(numero1, numero2), "Resultado", 
			JOptionPane.INFORMATION_MESSAGE);

	}

}