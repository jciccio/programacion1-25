import javax.swing.JOptionPane;
public class PruebaCalculadora2 {
	
	public static void main (String args []){
		
		String numeroHilera = JOptionPane.showInputDialog("Digite un numero entero");
		System.out.println("El usuario digita: " + numeroHilera);
		int numero = 0;
		try{
			numero = Integer.parseInt(numeroHilera);	
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el numero: " + e);
		}

		
		
		numero = numero * numero;
		System.out.println(numero);
	}

}