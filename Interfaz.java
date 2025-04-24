import javax.swing.JOptionPane;
public class Interfaz{
	public double solicitarNumeroReal(String mensaje){
		String numeroHilera = JOptionPane.showInputDialog(mensaje);
		double numero = 0;
		try{
			numero = Double.parseDouble(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el numero");
		}
		return numero;
	}

	public int solicitarNumeroEntero(String mensaje){
		String numeroHilera = JOptionPane.showInputDialog(mensaje);
		int numero = 0;
		try{
			numero = Integer.parseInt(numeroHilera);
		}
		catch(NumberFormatException e){
			System.err.println("Ocurrio un error al convertir el numero");
		}
		return numero;
	}

	public String solicitarHileraAlUsuario(String mensaje){
		String valor = JOptionPane.showInputDialog(mensaje);
		if(valor == null){
			valor = "";
		}
		return valor;
	}
}