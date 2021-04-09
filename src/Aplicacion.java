import conversor.CreadorConversor;
import enlace.Enlace;
import grafo.Grafo;
import nodo.Ciudad;
import nodo.Industria;
import nodo.Nodo;

public class Aplicacion {

	public static void main(String[] args) {
		Nodo medellin = new Ciudad("Medellin");
		Nodo bello = new Ciudad("Bello");
		Nodo plantaAguaBello = new Industria("Planta de Agua Bello");
		bello.agreagarEnlacesNodos(plantaAguaBello);
		bello.agreagarEnlacesNodos(medellin);
		medellin.agreagarEnlacesNodos(bello);
		
		
		Grafo valleAburra = new Grafo();
		valleAburra.agregarNodo(plantaAguaBello);
		valleAburra.agregarNodo(medellin);
		valleAburra.agregarNodo(bello);
		
		
		CreadorConversor conversor = new CreadorConversor(valleAburra, "XML");
		conversor.exportarGrafo();

	}

}
