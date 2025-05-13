public class EjercicioConsulta{
	

	public String procesarElementos(char [][] elementos, char [][] busqueda){
		String resultado ="";

		for(int i = 0 ; i < busqueda.lengthl; i++){
			char [][]  resultado = buscarElemento(elementos, busqueda)
			int veces =0 ;
			while(resultado == elementos){
				veces++;
				
			}	
			resultado += "Se encontro " + veces + "el compuesto: " + busqueda[0] //NHHH 
		}
		return resultado;

	}

	public char[][] buscarElemento( char [][] elementosParametro, char [] elemento){
		char [][] elementos = clonarMatriz(elementosParametro);
		int indice = 0;
		for(int f = 0; f < elementos.length; f++){
			for(int c = 0; c < elementos[f].length; c++){
				for(int i = 0; i < elemento.length; i++){
					if(elementos[f][c] == elemento[indice]){
						elementos[f][c] = '_';
						indice++;
					}	
				}	
			}
		}
		return indice == elemento.length ? elementos : elementosParametro;
	}

	public char [][] clonarMatriz(char [][] elementos){
		char [][] copia = new char[elmentos.length][elementos[0].length];
		for(int f = 0; f < elementos.length; f++){
			for(int c = 0; c < elementos[f].length; c++){
				copia[f][c] = elementos[f][c];
			}
		}
		return copia;
	}
}