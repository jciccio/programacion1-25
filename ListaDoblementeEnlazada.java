public class ListaDoblementeEnlazada{
	
	private Nodo primero; // puntero al primer nodo de la lista
	private Nodo ultimo;

	private class Nodo{ // Contiene un valor y el puntero al siguiente nodo
		private int valor;
		private Nodo siguiente;
		private Nodo anterior;

		public Nodo(int valor){
			this.valor = valor;
			this.siguiente = null;
			this.anterior = null;
		}

		public String toString(){
			return  ""+this.valor;
		}
	}

	public ListaDoblementeEnlazada(){
		this.primero = this.ultimo = null;
	}

	public void agregarAlInicio(int elemento){
		Nodo nuevo = new Nodo(elemento);
		Nodo primeroViejo = this.primero;
		nuevo.siguiente = primeroViejo;
		this.primero = nuevo;
		if(this.ultimo == null)
			this.ultimo = this.primero;
		else
			primeroViejo.anterior = nuevo;
	}

	public void agregarAlFinal(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(this.primero == null){// La lista está vacía
			this.primero = nuevo;
			if(this.ultimo == null)
				this.ultimo = this.primero;
		}
		else{ 
			Nodo actual = this.ultimo;
			//while(actual.siguiente != null){
			//	actual = actual.siguiente;
			//}
			actual.siguiente = nuevo;
			nuevo.anterior = actual;
			this.ultimo = nuevo;
		}
	}

	public boolean setValor(int posicion, int valor){
		int posicionActual = 0;
		Nodo actual = this.primero;
		boolean asignado = false;

		if(posicion >= 0){
			while(actual != null && posicionActual != posicion){
				actual = actual.siguiente;
				posicionActual++;
			}
			if (actual != null){
				actual.valor = valor;
				asignado = true;
			}
		}

		return asignado;
	}

	public String toString(){
		String contenido = "";
		Nodo actual = this.primero;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + " ";
			actual = actual.siguiente;
		}
		return contenido;
	}

	public String imprimirReverso(){
		String contenido = "Reverso:\n";
		Nodo actual = this.ultimo;
		while(actual != null){
			String valor = actual.toString();
			contenido += valor + " ";
			actual = actual.anterior;
		}
		return contenido;	
	}

	public boolean insertar(int posicion, int valor){
		// Puede ser el primer elemento
		boolean insertado = false;
		if (posicion == 0){
			this.agregarAlInicio(valor);
			insertado = true;
		}
		// Uno al medio
		// Elemento final
		else if (posicion > 0 && this.primero != null){
			Nodo actual = this.buscarAnterior(posicion);
			if (actual != null){
				Nodo nuevo = new Nodo(valor);
				Nodo anterior = actual;
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente.anterior = nuevo;
				anterior.siguiente = nuevo;
				nuevo.anterior = anterior;
				insertado = true;
				if (anterior == ultimo)
					ultimo = nuevo;
			}
			
		}
		return insertado;
	}

	public Nodo buscarAnterior(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(posicionActual + 1 != posicion && actual != null){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public Nodo buscarNodo(int posicion){
		Nodo actual = this.primero;
		int posicionActual = 0;
		while(posicionActual != posicion && actual != null){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public int buscar (int elemento){
		Nodo actual = this.primero;
		int posicionActual = 0;
		while(actual.valor != elemento && actual != null){
			actual = actual.siguiente;
			posicionActual++;
		}
		return (actual != null) ? posicionActual : -1 ;
	}

	public int borrarElementos(int valor){
		int posicion = buscar(valor);
		int borrados = 0;
		while (posicion != -1){
			if (borrar(posicion))
				borrados++;
			posicion = buscar(valor);
		}
		return borrados;
	}

	public boolean borrar (int posicion){
		//Casos para borrar nodo:
		// Si es el primer elemento (0) -> hay que actualizar el puntero al inicio
		// Si es un nodo intermedio
		// Si es un nodo final	
		boolean borrado = true;
		Nodo borrar = this.buscarNodo(posicion);
		if (primero != null && borrar != null){
			if(primero == borrar){ // actualizar el primero
				primero = primero.siguiente;
			}
			if (borrar.siguiente != null){ // no es el ultimo
				borrar.siguiente.anterior = borrar.anterior;
			}
			if (borrar.anterior != null){ // no es el primero
				borrar.anterior.siguiente = borrar.siguiente;
			}
			if (borrar == ultimo){ // actualizar el ultimo
				ultimo = ultimo.anterior;
			}
		}
		else{
			borrado = false;
		}
		return borrado;
	}


	public static void main (String [] args){
		ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
		lista.agregarAlInicio(3);
		lista.agregarAlInicio(2);
		lista.agregarAlInicio(1);
		lista.agregarAlInicio(10);
		System.out.println(lista);
		System.out.println(lista.imprimirReverso());
		lista.agregarAlFinal(6);
		lista.agregarAlFinal(7);
		lista.agregarAlFinal(8);
		System.out.println(lista);
		System.out.println(lista.imprimirReverso());

		lista.setValor(2,1337);
		System.out.println(lista);
		
		lista.setValor(200,1337);


		lista.insertar(3,1000);
		System.out.println(lista);
		
		lista.insertar(0,0);
		System.out.println(lista);
		
		lista.insertar(8,41);
		System.out.println(lista);
		
		System.out.println(lista.borrar(0)); // Borra el primero
		System.out.println(lista);

		System.out.println(lista.borrar(2)); // Borra un nodo intermedio
		System.out.println(lista);

		System.out.println(lista.borrar(7)); // Borra el último
		System.out.println(lista);
		System.out.println(lista.imprimirReverso());
		
		System.out.println(lista.borrar(80)); // Borra un elemento fuera de la lista

		lista.agregarAlFinal(3);
		lista.agregarAlFinal(4);
		lista.agregarAlFinal(1);
		lista.agregarAlFinal(6);
		lista.agregarAlFinal(7);
		lista.agregarAlFinal(2);
		System.out.println(lista);
		



	}

}