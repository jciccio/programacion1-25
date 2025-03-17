public class PruebaPerro{
	public static void main (String [] args){
		Perro perro1 = new Perro();
		perro1.bautizar("Luna");
		perro1.setEdad(5);
		perro1.setRaza("Golden");
		perro1.correr();
		perro1.saludar();


		int edadDeLuna = perro1.getEdad(); 
		edadDeLuna = edadDeLuna + 1;
		//edadDeLuna = 5 + 1;
		//edadDeLuna = 6;
		//edadDeLuna <- 6
		perro1.setEdad(edadDeLuna);
		perro1.saludar();

		Perro perro2 = new Perro();
		perro2.bautizar("Max");
		perro2.setRaza("Labrador");
		perro2.setEdad(3);
		perro2.sentarse();
		perro2.saludar();
	}
}