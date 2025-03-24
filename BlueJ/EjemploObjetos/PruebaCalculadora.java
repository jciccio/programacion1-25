import javax.swing.JOptionPane;
public class PruebaCalculadora{
	
	public static void main (String [] args){
		//Interfaz interfaz = new Interfaz();
		Calculadora calculadora = new Calculadora();
		//double numero1 = interfaz.solicitarNumeroReal("Digite un numero");
		//double numero2 = interfaz.solicitarNumeroReal("Digite otro numero mas");

		JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+ calculadora.sumar(), "Resultado", JOptionPane.INFORMATION_MESSAGE);

	}

}