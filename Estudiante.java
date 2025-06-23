public class Estudiante extends Persona{
	
	private String carne;
	private String carrera;

	public Estudiante(String nombre, String apellido, int cedula, 
		String carne, String carrera){

		super(nombre, apellido, cedula);

		this.carne = carne;
		this.carrera = carrera;

	}


	public void imprimir(){
		System.out.println("Hola soy: " + nombre + " mi carne es " + this.carne  + " y mi carrera es "+ this.carrera);
	}

	public static void main (String [] args){
		

		Estudiante e1 = new Estudiante("Juan", "Rodriguez", 12121313, "C1k202", "Computacion");
		e1.imprimir();

		Docente d1 = new Docente("Edgar", "Casasola", 2345678, 1, "Programacion 1");
		d1.imprimir();

		Persona persona = new Persona ("Maria", "Perez", 2312583);
		persona.imprimir();

		Persona [] personas = new Persona[3];
		personas[0] = persona;
		personas[1] = e1;
		personas[2] = d1;
	}


} 