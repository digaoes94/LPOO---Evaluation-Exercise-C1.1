package questao1;

import java.util.LinkedList;

public class PilhaPaginas {
	private LinkedList<Pagina> pilhaPag;
	
	public PilhaPaginas() {
		this.pilhaPag = new LinkedList<Pagina>();
	}
	
	public void push(Pagina p) {
		pilhaPag.addFirst(p);
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
}