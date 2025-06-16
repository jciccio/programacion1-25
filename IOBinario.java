import java.io.*;
public class IOBinario{
	//ObjectOutputStream
	

	public void escribir(Carta carta, String nombreArchivo){
		try{
			ObjectOutputStream escritor = 
			new ObjectOutputStream(new FileOutputStream(nombreArchivo)); 
			escritor.writeObject(carta);
			escritor.close();
		}catch(IOException e){
			System.err.println("Ocurrio un error al escribir el archivo: " + e);
		}

	}


	public Carta leer(String nombreArchivo){
		Carta carta = null;
		try{
			ObjectInputStream lector = 
			new ObjectInputStream(new FileInputStream(nombreArchivo)); 
			Object objeto =  lector.readObject();
			carta = (Carta) objeto;

		}catch(IOException e){
			System.err.println("Ocurrio un error al leer el archivo: " + e);
		}
		catch(ClassNotFoundException e){
			System.err.println("Ocurrio un error al convertir el objeto: " + e);
		}
		return carta;
	}


	public static void main (String [] args){
		Carta carta1 = new Carta(10, "Corazones");
		System.out.println(carta1);

		IOBinario io = new IOBinario();
		io.escribir(carta1, "CartaBinaria");


		Carta cartaArchivo = io.leer("CartaBinaria");
		System.out.println(cartaArchivo.toString());
	}




}