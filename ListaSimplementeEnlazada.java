public class ListaSimplementeEnlazada{
	
	private Nodo primero; // Puntero al inicio de la lista (nodo inicial)

	// Necesitamos un objeto nodo para crear los elementos
	private class Nodo{
		private int valor;
		private Nodo siguiente;

		public Nodo(int valor){
			this.valor = valor;
			siguiente = null;
		}

		public String toString(){
			return "Nodo: "+valor + "\n";
		}
	}	

	public ListaSimplementeEnlazada(){
		this.primero = null;
	}

	public void insertarAlInicio(int elemento){
		// 1. Crear un nodo nuevo con el elemento que recibimos
		// 2. Agregar a lista el nodo
		// 2.1 Actualizar el siguiente del nodo nuevo (primero)
		// 2.2 Actualizar el nodo inicial al nuevo nodo
		Nodo nuevo = new Nodo(elemento);
		nuevo.siguiente = primero;
		primero = nuevo;
	}

	public void insertarAlFinal(int elemento){
		Nodo nuevo = new Nodo(elemento);
		if(primero == null){ // Si la lista está vacía, actualizamos el primer nodo
			primero = nuevo;
		}
		else{ // La lista tiene elementos
			Nodo actual = primero;
			while(actual.siguiente != null){ // queremos buscar el último elemento de la lista
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public Nodo buscarAnterior(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null && posicionActual + 1 != posicion){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public Nodo buscarPosicion(int posicion){
		int posicionActual = 0;
		Nodo actual = this.primero;
		while(actual != null && posicionActual != posicion){
			posicionActual++;
			actual = actual.siguiente;
		}
		return actual;
	}

	public boolean insertar(int posicion, int elemento){
		boolean insertado = false;
		if(posicion == 0){// Insertar al inicio de la lista
			insertarAlInicio(elemento);
			insertado = true;
		}
		else if(posicion > 0 && primero != null){
			// Nodo intermedio (a la mitad)
			// Nodo final (último nodo de la lista)
			Nodo anterior = buscarAnterior(posicion);
			if(anterior != null){
				Nodo nuevo = new Nodo(elemento);
				nuevo.siguiente = anterior.siguiente;
				anterior.siguiente = nuevo;
				insertado = true;
			}
		}

		return insertado;
	}

	public String toString(){
		String contenido = "";
		Nodo actual = primero;
		while(actual != null){
			contenido += actual.toString();
			actual = actual.siguiente;
		}
		return contenido;
	}

	public Nodo getElemento(int posicion){
		return buscarPosicion(posicion);
	}

	public static void main (String [] args){
		ListaSimplementeEnlazada lse = new ListaSimplementeEnlazada();
		lse.insertarAlInicio(3);
		lse.insertarAlInicio(2);
		lse.insertarAlInicio(1);
		lse.insertarAlInicio(0);
		lse.insertarAlFinal(4);
		lse.insertar(1,10);
		lse.insertar(2,6);
		lse.insertar(200,5);
		System.out.println(lse);


		Nodo elemento = lse.getElemento(200);
		if(elemento != null)
			System.out.println(elemento.toString());

		elemento = lse.getElemento(2);
		if(elemento != null)
			System.out.println(elemento.toString());

	}


}