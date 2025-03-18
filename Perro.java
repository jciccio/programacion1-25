// Esto es un comentario
// No son compilados
// El nombre del objeto es Perro

/*
	Esto es un comentario
	de varias 
	líneas
*/

public class Perro {

	// Las clases (objeto) tienen dos secciones principales:
	// 1. Atributos o características
	// 2. Métodos o acciones

	// Atributos (sustantivos)
	// Para definir un atributo necesitamos:
	// Declarar un valor privado
	// Declarar el tipo de dato (entero, real, hilera, objetos, etc)
	// Definir un nombre para la variable (usando camelCase)
	// ;
	private String nombre;
	private String raza;
	private int edad;
	private String estado;


	// Métodos
	// Son acciones (verbos)
	// Declarar accesibilidad -> public,  private (si se puede acceder desde la instancia)
	// Tipo de retorno (el valor que queremos devolver luego del procesamiento)
	// Nombre del metodo (en camelCase)
	// Parametro (que necesita para poder funcionar)




	/*
	Cómo funciona un método?
	1. public -> el método es público
	2. Lo que quiero que el método retorne
	3. El nombre con el que identifico al método setEdad, getEdad, saludar
	4. Entre parénteis lo que necesito que el método reciba para funcionar
	*/

	public void saludar(){
		System.out.println("Hola soy " + nombre + " tengo " + edad + " anyos y soy un " + raza + "\n y estoy " + estado);
	}


	public void bautizar(String nombreDelPerro){
		nombre = nombreDelPerro;
	}


	public void setEdad(int edadDelPerro){
		edad = edadDelPerro;
	}

	public void setRaza(String razaDelPerro){
		raza = razaDelPerro;
	}

	public int getEdad(){
		return edad;
	}

	public void sentarse(){
	  String sentarse = "                                           /\\ /\\\n";
      sentarse += "                                          /  \\---._\n";
      sentarse += "                                         / / `     `\\\n";
      sentarse += "                                         \\ \\   `'<@)@)      \n";
      sentarse += "                                         /`         ~ ~._ \n";
      sentarse += "                                        /                `() \n";
      sentarse += "                                       /    \\   (` ,_.:.  /\n";
      sentarse += "                                      / ~    `\\   (vVvvvvV\n";
      sentarse += "                                     /       |`\\_ `^^^/\n";
      sentarse += "                                 ___/________|_  `---'\n";
      sentarse += "                                (______________) _\n";
      sentarse += "                                _/~          | `(_)\n";
      sentarse += "                              _/~             \\  \n";
      sentarse += "                            _/~               |\n";
      sentarse += "                          _/~                 |\n";
      sentarse += "                        _/~                   |\n";
      sentarse += "                      _/~         ~.          |\n";
      sentarse += "                    _/~             \\        /\\\n";
      sentarse += "                 __/~               /`\\     `||\n";
      sentarse += "               _/~      ~~-._     /~   \\     ||\n";
      sentarse += "              /~             ~./~'      \\    |)\n";
      sentarse += "             /                 ~.        \\   )|\n";
      sentarse += "            /                    :       |   ||\n";
      sentarse += "            |                    :       |   ||\n";
      sentarse += "            |                   .'       |   ||\n";
      sentarse += "       __.-`                __.'--.      |   |`---. \n";
      sentarse += "    .-~  ___.         __.--~`--.))))     |   `---.)))\n";
      sentarse += "   `---~~     `-...--.________)))))      \\_____)))))\n";
      this.estado = "sentado\n\n" + sentarse;
	}

	public void correr(){

        String correr = "              .--~~,__\n"+ 
      " :-....,-------`~~'._.'\n"+ 
      "  `-,,,  ,_      ;'~U'\n"+ 
      "   _,-' ,'`-__; '--.\n"+ 
      "  (_/'~~      ''''(;\n";

      this.estado = "corriendo\n\n" + correr;
	}




}