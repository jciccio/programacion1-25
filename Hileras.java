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



		//ESCUELA
		//??????? -> E

		//E???E??

		String hilera5 = "01234511111";

		System.out.println(hilera5.indexOf("1"));
		System.out.println(hilera5.substring(0,2));

		String palabraSecreta = "ESCUELA";
		String palabraSecretaIteracion = palabraSecreta;
		String patron = "???????";

	/*	int corrimiento = 0;
		int veces = 0;
		while(palabraSecretaIteracion.indexOf("E") != -1){
			veces++;
			
			int posicion = palabraSecreta.indexOf("E") + ;
			patron = patron.substring(0,posicion + corrimiento) + "E" + patron.substring(corrimiento + posicion+1);
			patron.replace(posicion, posicion+1, "E");
			System.out.println(patron);
			palabraSecretaIteracion = palabraSecretaIteracion.substring(posicion+1);
			corrimiento += palabraSecretaIteracion.indexOf("E")+1;
		}

		System.out.println("Veces: " + veces);*/


		StringBuilder palabra = new StringBuilder("012345");
		palabra.replace(0,1,"K");
		System.out.println(palabra);
		
	}
}