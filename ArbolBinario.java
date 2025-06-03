public class ArbolBinario{
	private Nodo raiz;

	private class Nodo{
		private int elemento;
		private Nodo hijoIzq;
		private Nodo hijoDer;

		public Nodo(int elemento){
			this.elemento = elemento;
			hijoDer = hijoIzq = null;
		}

		public String toString(){
			return this.elemento + " ";
		}
	}

	public Nodo insertar(int elemento){
		return insertar(elemento, this.raiz);
	}

	private Nodo insertar(int elemento, Nodo nodo){
		Nodo nuevo = nodo;
		if(nodo == null){
			// Caso trivial
			// Es un nodo terminal (o una hoja)
			nuevo = new Nodo(elemento);
			if(raiz == null)
				raiz = nuevo; 
		}
		else{
			// Casos recursivos (nodo intermedio o la raíz)
			// Dos casos recursivos para moverse por el subarbol izq o der
			// Nos queremos mover hasta llegar a la hoja o nodo terminal
			if(nodo.elemento >= elemento){
				// Nos movemos hacia la izquierda
				nodo.hijoIzq = insertar(elemento, nodo.hijoIzq);
			}
			else{
				// Nos movemos hacia la derecha
				nodo.hijoDer = insertar(elemento, nodo.hijoDer);
			}
		}
		return nuevo;
	}

	// Existen varias formas de imprimir un árbol
	// Existen 3 formas:
	// Preorden: raíz, subárbol izq, subárbol derecho
	// Postorden: sub árbol izq, subárbol der, raíz
	// Inorden: subárbol izq, raíz, subárbol derecho
	private void imprimir(Nodo nodo){
		if(nodo != null){
			imprimir(nodo.hijoIzq);
			System.out.println(nodo);
			imprimir(nodo.hijoDer);
		}
	}

	public void imprimir(){
		imprimir(raiz);
	}


	public static void main (String [] args){
		ArbolBinario ab = new ArbolBinario();
		ab.insertar(15);
		ab.insertar(18);
		ab.insertar(10);
		ab.insertar(13);
		ab.insertar(25);
		ab.insertar(20);
		ab.insertar(16);
		ab.insertar(5);
		ab.insertar(2);
		ab.insertar(7);
		ab.imprimir();
	}
}