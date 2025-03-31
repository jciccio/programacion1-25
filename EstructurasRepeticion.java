public class EstructurasRepeticion{

	public int sumarParesWhile(){
		int contador = 2;
		int resultado = 0;
		while(contador <= 100){
			resultado += contador;
			contador += 2;
		}
		return resultado;
	} 

	public int sumarParesDoWhile(){
		int resultado = 0;
		int contador = 2;
		do{
			resultado += contador;
			contador += 2;
		}while(contador <= 100);
		return resultado;
	}

	public int sumarParesFor(){
		int resultado = 0;
		for(int contador = 2; contador <= 100; contador+= 2){
			resultado += contador;
		}
		return resultado;
	}




	public static void main (String [] args){
		EstructurasRepeticion er = new EstructurasRepeticion();
		System.out.println(er.sumarParesWhile());
		System.out.println(er.sumarParesDoWhile());
		System.out.println(er.sumarParesFor());
	}
}