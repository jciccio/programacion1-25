public class Hileras{
	
	public static void main (String args[]){
		String hilera1 = "\tHola mundo hoy es lunes 21 de abril\n";

		System.out.println("Tamanio de la hilera " + hilera1.length());
		char primerLetra = hilera1.charAt(1);// Indice que quiero buscar
		System.out.println(primerLetra);


		String hilera2 = "casa";
		String hilera3 = "Casa";
		System.out.println(hilera2.compareTo(hilera3));
		System.out.println(hilera2.equalsIgnoreCase(hilera3));


		String hilera4 = hilera2.replace('a', 'o');
		System.out.println(hilera2);
		System.out.println(hilera4);

		String [] arreglo = hilera1.split(" "); // \tHola, mundo, hoy, ...
		System.out.println(arreglo.length);


		StringBuilder sb = new StringBuilder("Hola");
		String variable = sb.toString();
		String variable2 = new String(sb);


		StringBuilder sb2 = new StringBuilder(variable2);
		System.out.println(sb2);
		sb2.replace(0,1, "Z"); //"Hola" 
		System.out.println(sb2); //Zola 
	}
}