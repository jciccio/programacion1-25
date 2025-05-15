public class MatrizExamen{
	private int [][] comida;

	public MatrizExamen(){
		comida = new int [1000][1000]
		int contador = 0;
		while(contador < 200){
			int filaAleatoria = (int)(Math.random()*1000);
			int colAleatoria = (int)(Math.random()*1000);
			int [] cF = {-1, -1, -1, 0, 0, 1, 1, 1};
			int [] cC = {-1,  0,  1,-1, 1,-1, 0, 1};
			int suma = 0;
			for(int i = 0; i < cF.length; i++){				
				int nuevaFila = filaAleatoria + cF[i];
				int nuevaCol  = colAleatoria + cC[i];
				if(nuevaFila >= 0 && nuevaFila < tablero.length && nuevaCol >= 0 && nuevaCol < tablero[0].length){
					suma += comida[nuevaFila][nuevaCol];
				}
			}
			if(suma == 0){
				comida[filaAleatoria][colAleatoria]++;	
			}
			else{
				comida[filaAleatoria][colAleatoria] += suma;
			}
		}
	}

	public int[][] getComida(){
		return comida;
	}

}