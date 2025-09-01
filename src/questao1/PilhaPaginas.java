package questao1;

import java.lang.reflect.Array;
import java.util.LinkedList;

public class PilhaPaginas {
	private LinkedList<Pagina> pilhaPag;
	
	public PilhaPaginas() {
		this.pilhaPag = new LinkedList<Pagina>();
	}
	
	public void push(Pagina p) {
		pilhaPag.push(p);
	}
	
	public Pagina pop() {
		return pilhaPag.pop();
	}
	
	public Pagina peek() {
		return pilhaPag.peek();
	}
	
	public boolean isEmpty() {
		return pilhaPag.isEmpty();
	}
	
	public Object[] toArray() {
		return pilhaPag.toArray();
	}
}