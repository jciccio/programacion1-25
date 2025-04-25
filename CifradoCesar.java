public class CifradoCesar {
	

	public String codificar(String frase, int desplazamiento){
		String cifrado = "";
		frase = frase.toUpperCase();
		String abecedario = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
		for (int i = 0; i < frase.length(); i++){
			int indice = abecedario.indexOf(""+frase.charAt(i));
			if(indice != -1){
				indice += desplazamiento;
				int tam = abecedario.length();
				int posicion = indice < 0 ? tam + indice : indice;
				cifrado += (""+abecedario.charAt(posicion%abecedario.length()));
			}
			else{
				cifrado += frase.charAt(i);
			}
		}
		return cifrado;
	}

	public String decodificar(String frase, int desplazamiento){
		desplazamiento = desplazamiento > 0 ? desplazamiento*-1 : desplazamiento;
		return codificar(frase, desplazamiento);
	}

	public static void main (String [] args){
		CifradoCesar cifrado = new CifradoCesar();
		String codificado = cifrado.codificar("ABCZ 192", 2);
		System.out.println(codificado);
		System.out.println(cifrado.decodificar(codificado,2));

		System.out.println((int)'A');
		System.out.println((int)'Z');

	}
}