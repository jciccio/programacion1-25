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

	public void explotar(int f, int c){
		if(f >= 0 && f < matriz.length && c >= 0 && c < matriz[f].length){
			if(matriz[f][c] == 'N'){ // Caso trivial
				matriz[f][c] = 'R';
			}
			else if(matriz[f][c] == 'E'){
				int movF = {-1,1,0,0};
				int movC = {0,0,-1,1};
				matriz[f][c] = 'R';
				for(int i = 0 ; i < movF.length;i++){
					explotar(f+movF[i], c+movC[i]);
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