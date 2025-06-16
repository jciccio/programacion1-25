public class TablaExplosiva{
	
	private char [][] matriz;

	public TablaExplosiva(int f, int c){
		char [] opciones = {'E', 'R', 'N'}; 
		if(f >0 && c >0){
			matriz = new char[f][c];
			for(int i = 0; i < f; i++){
				for(int j = 0; j<c; j++){
					matriz[i][j] = opciones[(int)(Math.random()*opciones.length)];
				}
			}
		}
	}

	public String toString(){
		String contenido = "";
		if(matriz != null){
			for (int f = 0; f < matriz.length; f++){
				for (int c = 0 ; c < matriz[f].length; c++){
					contenido += matriz[f][c] + "\t"
				}
				contenido+= "\n";
			}
		}
		return contenido;
	}

}