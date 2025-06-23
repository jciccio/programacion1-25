public class Persona{
	protected String nombre;
	protected String apellido;
	protected int cedula;

	public Persona (String nombre, String apellido, int cedula){
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void imprimir(){
		System.out.print("Hola soy " + nombre + " " + apellido + " mi cedula es: " + cedula  +" ");
	}
}