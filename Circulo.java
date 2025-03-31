public class Circulo{
	
	private static final PI = 3.14159265; 

	public double calcularArea(double diametro){
		double radio = diametro/2;
		double area = PI * radio * radio;  
		return area;
	}

}