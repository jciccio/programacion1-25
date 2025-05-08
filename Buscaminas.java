public class Buscaminas{
	// Matriz de numeros donde el -1 es una mina
	// Matriz de despligue => M _ 
	public int [][] tablero;
	public String [][] tableroUsuario;
	public int minas;

	// Constructor que inicialice las minas y el tablero	
	public Buscaminas(int f, int c, int minas){
		if(f*c > minas){
			tablero = new int[f][c];
			tableroUsuario = new String[f][c];
			this.minas = minas;
			llenarMinas();
		}
	}


	// Llenar el tablero de minas
	public void llenarMinas(){
		int minasRestantes = minas;
		while(minasRestantes > 0){
			// Dos numeros aleatorios uno por fila y uno por col Math.random() //[0,1[
			// Tam filas y columnas
			int filaAleatoria = (int)(Math.random() * tablero.length);
			int colAleatoria =  (int)(Math.random() * tablero[0].length);
			if(tablero[filaAleatoria][colAleatoria] != -1){
				tablero[filaAleatoria][colAleatoria] = -1;
				minasRestantes--;
				llenarNumeros(filaAleatoria, colAleatoria);
			}
		}
	} 


	// Llenar los números del tablero 
	public void llenarNumeros(int filaMina, int columnaMina){
		// Chequear los limites antes de acceder a la celda
		int [] cF = {-1, -1, -1, 0, 0, 1, 1, 1};
		int [] cC = {-1,  0,  1,-1, 1,-1, 0, 1};
		for(int i = 0; i < cF.length; i++){
			int nuevaFila = filaMina    + cF[i];
			int nuevaCol  = columnaMina + cC[i];
			if(nuevaFila >= 0 && nuevaFila < tablero.length && 
			   nuevaCol >= 0 && nuevaCol < tablero[0].length &&
			   tablero[nuevaFila][nuevaCol] != -1 ){

				tablero[nuevaFila][nuevaCol]++;

			}
		}
	}


	public String toString(){
		String tableroString = "Minas: " + minas + "\n" ;

		String tableroUsuarioString ="";
		for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				tableroString += tablero[f][c] + "\t";
				if(tableroUsuario[f][c] == null){
					tableroUsuarioString += "_\t"; 
				}
				else{
					tableroUsuarioString += tableroUsuarioString[f][c];	
				}
				
			}
			tableroUsuarioString +="\n";
			tableroString += "\n";
		}
		return tableroString + tableroUsuarioString;
	}


	public static void main (String args[]){
		Buscaminas buscaminas = new Buscaminas(10,10,20);
		System.out.println(buscaminas); 
	}

}