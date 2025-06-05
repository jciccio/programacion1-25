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
			if(nodo.elemento > elemento){
				// Nos movemos hacia la izquierda
				nodo.hijoIzq = insertar(elemento, nodo.hijoIzq);
			}
			else if(nodo.elemento < elemento){
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
		System.out.println("Arbol Binario");
		imprimir(raiz);
	}

	// Borrar accesible desde la instancia
	public Nodo borrar(int elemento){
		return borrar(elemento, this.raiz);
	}

	
	// Buscar el elemento mas pequeno
	private Nodo buscarMenor(Nodo nodo){
		while(nodo.hijoIzq != null){
			nodo = nodo.hijoIzq;
		}
		return nodo;
	}


	// Borrar
	private Nodo borrar(int elemento, Nodo nodo){
		Nodo retorno = null;
		if(nodo != null){
			if(nodo.elemento > elemento){
				// Nos movemos hacia la izquierda
				nodo.hijoIzq = borrar(elemento, nodo.hijoIzq);
			}
			else if (nodo.elemento < elemento){
				// Nos movemos hacia la derecha
				nodo.hijoDer = borrar(elemento, nodo.hijoDer);
			}
			else {
				// Encontramos el nodo que queremos borrar :)
				if(nodo.hijoIzq == null){
					nodo = nodo.hijoDer;
				}
				else if (nodo.hijoDer == null){
					nodo = nodo.hijoIzq;
				}
				else{ // Tiene dos hijos
					Nodo menor  = buscarMenor(nodo.hijoDer);
					nodo.elemento = menor.elemento;
					nodo.hijoDer = borrar(nodo.elemento, nodo.hijoDer);
				}
			}
			retorno = nodo;
		}
		return retorno;
	}

	public Nodo buscar (int elemento){
		return buscar(elemento, raiz);
	}

	public Nodo buscar(int elemento, Nodo nodo){
		Nodo buscado = null;
		if(nodo != null){
			if(elemento > nodo.elemento){
				// Me muevo hacia la derecha
				buscado = buscar(elemento, nodo.hijoDer);
			}
			else if (elemento < nodo.elemento){
				// Me muevo hacia la izquierda
				buscado = buscar(elemento, nodo.hijoIzq);
			}
			else{
				// Lo encontré
				buscado = nodo;
			}	
		}
		return buscado;
	}

	public static void main (String [] args){
		ArbolBinario ab = new ArbolBinario();
		ab.insertar(15);
		ab.insertar(18);
		ab.insertar(10);
		ab.insertar(13);
		ab.insertar(25);
		ab.insertar(20);
		ab.insertar(20);
		ab.insertar(16);
		ab.insertar(5);
		ab.insertar(2);
		ab.insertar(7);
		ab.imprimir();


		ab.borrar(7);
		ab.imprimir();
	}
}