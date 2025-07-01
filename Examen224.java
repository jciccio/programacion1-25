public class Examen224{

	public boolean letrasRepetidas (String todo, String busqueda){
		boolean esta = false;
		String [] partes = todo.trim().split(" ");
		for (int i = 0; i < partes.length && !esta; i++){
			esta = true;
			for (int j = 0; j < busqueda.length(); j++){
				if(partes[i].indexOf(""+busqueda.charAt(j)) == -1){
					esta = false;
				}
			}
		}
		return esta;
	}

	public String calcularCombinaciones(String hilera, int n, String actual, String rA) {
	    String resultadoAcumulado = "";
	    if (actual.length() == n) {
	    	if(!letrasRepetidas(rA, actual)){
		        resultadoAcumulado += actual + " ";
		    }
	    }
	    else{
		    for (int j = 0; j < hilera.length(); j++) {
		        char letra = hilera.charAt(j);
		        if (actual.indexOf(letra) == -1 ) { 
		            resultadoAcumulado += calcularCombinaciones(hilera, n, actual + letra, resultadoAcumulado);
		        }
		    }
		}
	    return resultadoAcumulado;
	}

   	public String generarHileras(String hilera, int n) {
    	String permutaciones = calcularCombinaciones(hilera, n, "","");
    	String [] partes = permutaciones.split(" ");
    	String combinaciones = "";
    	for(int i = 0 ; i < partes.length; i++){
    		if(!letrasRepetidas(combinaciones,partes[i])){
    			combinaciones += partes[i]+" ";
    		}
    	}
    	return combinaciones;
	}

	public static void main (String [] arg){
		Examen224 e = new Examen224();
		System.out.println(e.generarHileras("ABCDE", 3));
	}

}