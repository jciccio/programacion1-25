public class Buscaminas{
	private int[][] tablero;
	private String [][] tableroUsuario;
	private int minas;
	//-1 => Representa una mina
	// 0-8 => Cantidad de minas alrededor

	public Buscaminas(int f, int c, int minas){
		if(f*c > minas){
			this.minas = minas;
			tablero = new int[f][c];
			tableroUsuario = new String [f][c];		
			for(int fila = 0 ; fila < tablero.length; fila++){
				for(int col = 0; col <tablero[fila].length; col++){
					tableroUsuario[fila][col] = "_";
				}
			}

			while(minas > 0){
				int filaAleatoria = (int) (Math.random()*f);
				int columnaAleatoria = (int) (Math.random()*c);
				if(tablero[filaAleatoria][columnaAleatoria] != -1){
					tablero[filaAleatoria][columnaAleatoria] = -1;
					minas--;
				}
			}
			llenarTablero();
		}
	}

	// Crear este método como tarea/trabajo en clase
	//public /*tipoRetorno*/ realizarMovimiento(/*agregue aqui sus parametros*/){
	//}

	public void llenarTablero(){
		int [] cF = {-1,-1,-1,0,0,1,1,1};
		int [] cC = {-1,0,1,-1,1,-1,0,1};
		for(int f = 0 ; f < tablero.length; f++){
			for(int c = 0; c <tablero[f].length; c++){
				if(tablero[f][c] == -1){
					for(int i = 0; i < 8; i++){
						int nuevaF = f + cF[i];
						int nuevaC = c + cC[i];
						if(nuevaF >= 0 && nuevaF < tablero.length &&
						nuevaC >=0 && nuevaC  < tablero[nuevaF].length &&
						tablero[nuevaF][nuevaC] != -1){
							tablero[nuevaF][nuevaC]++;
						}
					}
				}
			}
		}
	}

	

	public String toString(){
		String contenido = "";
		for(int f = 0; f < tablero.length; f++){
			for(int c = 0; c < tablero[f].length; c++){
				contenido += tablero[f][c] ;
				contenido += " \t";
			}
			contenido += "\r\n";
		}
		contenido += "\r\n - - -  Tablero Usuario - - - - - \r\n";
		for(int fila = 0 ; fila < tableroUsuario.length; fila++){
			for(int col = 0; col <tableroUsuario[fila].length; col++){
				contenido += tableroUsuario[fila][col] + " \t";
			}
			contenido += "\r\n";
		}
		return contenido;
	}

	public void jugar(){
		
	}

	public static void main (String [] args){
		Buscaminas buscaminas = new Buscaminas(10,10,10);
		System.out.println(buscaminas);
		buscaminas.llenarTablero();
		

	}

}