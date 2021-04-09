package grafo;

import java.util.ArrayList;
import java.util.List;

import nodo.Nodo;

public class Grafo {
	
	List<Nodo> nodos;
	
	 public Grafo () {
		 nodos = new ArrayList<>();
	 }
	 
	 public void agregarNodo(Nodo nodo) {
		 nodos.add(nodo);
	 }

}
