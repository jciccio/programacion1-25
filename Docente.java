public class Docente extends Persona{
	
	
	private int id;
	private String curso;

	public Docente(String nombre, String apellido, int cedula, 
		int id, String curso){

		super(nombre, apellido, cedula);

		this.id = id;
		this.curso = curso;

	}


	public void imprimir(){
		super.imprimir();
		System.out.println("mi id es "+ id +" y doy el curso de " + curso);
	}

	


}