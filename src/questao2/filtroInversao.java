// MEMBROS DO GRUPO: Rodrigo Araujo Schenberg

package questao2;

import java.util.LinkedList;
import java.util.TreeSet;

public class filtroInversao {

	public static void main(String[] args) {
		LinkedList<Integer> lista1 = new LinkedList<Integer>();
		LinkedList<Integer> lista2;
		LinkedList<Integer> listaAux = new LinkedList<Integer>();
		TreeSet<Integer> arv;
		int aux;
		
		// PREENCHER LISTA1 ---------------------------------------------------------------------------------------------------
		for(int a = 0; a < 20; a++) {
			aux = (int) (Math.random() * 20 + 1);
			lista1.push(aux);
		}
		//---------------------------------------------------------------------------------------------------------------------
		System.out.println("Lista 1:   " + lista1.toString());
		
		// FILTRAR LISTA1 -----------------------------------------------------------------------------------------------------
		for(Integer i : lista1) {
			if(listaAux.isEmpty()) {
				listaAux.push(i);
			}
			else if(listaAux.indexOf(i) == -1) {
				// addLast para ver melhor a diferença nas listas após System.out
				listaAux.addLast(i);
			}
		}
		//---------------------------------------------------------------------------------------------------------------------
		System.out.println("Lista Aux: " + listaAux.toString());
		
		// ORDENAR LISTA2 -----------------------------------------------------------------------------------------------------
		arv = new TreeSet<Integer>(listaAux);
		lista2 = new LinkedList<Integer>(arv);
		arv = null;
		//---------------------------------------------------------------------------------------------------------------------
		System.out.println("Lista 2:   " + lista2.toString()); // lista2 já filtrada e ordenada
		
		// INVERTER ORDEM DA SEGUNDA METADE DA LISTA2 -------------------------------------------------------------------------
		aux = lista2.size() / 2;
		listaAux.clear();
		
		for(int a = 0; a < aux; a++) {
			listaAux.add(lista2.removeLast());
		}
		
		for(int a = 0; a < aux; a++) {
			lista2.addLast(listaAux.removeFirst());
		}
		//--------------------------------------------------------------------------------------------------------------------
		
		System.out.println("Lista Final");
		System.out.println("Lista 2:   " + lista2.toString());
	}

}