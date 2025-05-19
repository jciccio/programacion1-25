import java.io.*;

public class EscritorDeArchivos {
	private BufferedWriter escritor;
	private boolean estaAbierto;

	// Abrir
	// Escribir
	// Cerrar

	public EscritorDeArchivos(String ruta){
		abrir(ruta, false);
	}

	public EscritorDeArchivos(String ruta, boolean agregarAlFinal){
		// "C:\Users\Jose Antonio\Desktop\Progra 1 - 1-25" -> Ruta absoluta
		// Ruta relativa: Desde donde ejecuto el programa.
		abrir(ruta, agregarAlFinal);
	}

	public void abrir(String ruta, boolean agregarAlFinal){
		try{
			escritor = new BufferedWriter(new FileWriter(ruta,agregarAlFinal) );
			estaAbierto = true;
		}
		catch(IOException e){
			System.err.println("EscritorDeArchivos@Ocurrio un error al crear el archivo: " + e);
		}
	}	

	public void escribir(String datos){
		if(estaAbierto){
			try{
				escritor.write(datos);
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos@Ocurrio un error al escribir al archivo: " + e);
			}
		}
	}

	public void cerrar(){
		if(estaAbierto){
			try{
				escritor.close();
			}
			catch(IOException e){
				System.err.println("EscritorDeArchivos@Ocurrio un error al cerrar al archivo: " + e);
			}	
		}
	}

	public static void main(String [] args){
		EscritorDeArchivos escritor = new EscritorDeArchivos("archivos\\PruebaRutaAbsoluta.txt", true);
		escritor.escribir("Hola esto es una prueba");
		escritor.escribir(" para ver si se escribe en un archivo de texto");
		escritor.cerrar();

		EscritorDeArchivos escritor2 = new EscritorDeArchivos("ArchivoExcel.csv", false);
		escritor2.escribir("Provincia,Cantón\n");
		escritor2.escribir("San Jose,Montes de Oca\n");
		escritor2.escribir("San Jose,Curridabat\n");
		escritor2.cerrar();

		escritor2.abrir("aaaaaa", true);
		escritor2.escribir("Hola mundo");
		escritor2.cerrar();
	}
}