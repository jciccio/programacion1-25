import java.io.*;
public class LectorDeArchivos{
	private BufferedReader lector;
	private boolean estaAbierto;

	public LectorDeArchivos(String ruta){
		try{
			lector = new BufferedReader(new FileReader(ruta));
			estaAbierto = true;
		}
		catch(IOException e){
			System.err.println("Lector@Ocurrio un error al abrir el archivo: " + e);
		}
	} 

	public void cerrar(){
		if(estaAbierto){
			try{
				lector.close();
				estaAbierto = false;
			}
			catch(IOException e){
				System.err.println("Lector@Ocurrio un error al abrir el archivo: " + e);
			}
		}
	}

	public String leerLinea(){
		String linea = null;
		if(estaAbierto){
			try{
				linea = lector.readLine();
			}
			catch(IOException e){
				System.err.println("Lector@Ocurrio un error al abrir el archivo: " + e);
			}
		}	
		return linea;
	}

	public String leerArchivo(){
		String contenido = "";
		String linea;
		while( (linea = leerLinea()) != null){
			contenido += linea + "\n";
		}
		return contenido;
	}

	public static void main (String [] args){
		LectorDeArchivos lector = new LectorDeArchivos("LectorDeArchivos.java");
		/*
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		System.out.println(lector.leerLinea());
		*/

		System.out.println(lector.leerArchivo());

		lector.cerrar();
	}

}