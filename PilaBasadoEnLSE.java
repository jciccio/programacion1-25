public class PilaBasadoEnLSE{
	
	private ListaSimplementeEnlazada pila;

	public PilaBasadoEnLSE(){
		pila = new ListaSimplementeEnlazada();
	}

	public void insertar(int elemento){
		pila.insertarAlInicio(elemento);
	}

	public Nodo tope(){
		return pila.buscarPosicion(0);
	}

	public Nodo eliminar(){
		Nodo nodo = pila.buscarPosicion(0);	
		pila.borrar(0);
		return nodo;
	}

	public void imprimir(){
		System.out.println(pila.toString());
	}


}