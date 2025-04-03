public class Triangulo{
	
	public String clasificarTriangulo(int a, int b, int c){
		String tipo = "";
		if(a == b && b == c){
			tipo = "Equilatero";
		}
		else{
			if(a!=b && b!=c && a != c){
				tipo = "Escaleno";
			}
			else {
				tipo = "Isosceles";
			}
		}
		return tipo;
	}

}