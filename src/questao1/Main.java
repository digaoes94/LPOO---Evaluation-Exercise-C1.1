package questao1;

import java.util.Scanner;

public class Main {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Web browser Tintim iniciado! Vamos começar?");
		PilhaPaginas pilha = new PilhaPaginas();
		int opcao = 0;

		do {
			opcao = menu(opcao);

			switch(opcao) {
			case 1:
				paginaNova(pilha);
				break;
			case 2:
				paginaAnterior(pilha);
				break;
			case 3:
				paginaAtual(pilha);
				break;
			case 4:
				exibirNavegacao(pilha);
				break;
			case 5:
				System.out.println("Browser sendo encerrado.");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida, o browser será encerrado.");
				System.exit(0);
			}
		} while(true);
	}
	
	private static void paginaNova(PilhaPaginas pilha) {
		String titulo, url;
		System.out.println("Favor informar o titulo e a URL da página");
		System.out.print("Título: ");
		titulo = scan.nextLine(); System.out.println();
		System.out.print("URL: ");
		url = scan.nextLine(); System.out.println();
		
		pilha.push(new Pagina(titulo, url));
	}
	
	private static void paginaAnterior(PilhaPaginas pilha) {
		pilha.pop();
	}
	
	private static void paginaAtual(PilhaPaginas pilha) {
		System.out.println(pilha.peek().toString());
	}

	private static void exibirNavegacao(PilhaPaginas pilha) {
		Pagina[] aux = pilha.toArray();
		
		for(Pagina p : aux) {
			System.out.println(p.toString());
		}
		
		aux = null;
	}

	private static int menu(int opcao) {
		System.out.println("Escolha uma opção:");
		System.out.println("1. Acessar nova página");
		System.out.println("2. Voltar para página anterior");
		System.out.println("3. Ver página atual");
		System.out.println("4. Exibir histórico de navegação");
		System.out.println("5. Encerrar o programa");

		opcao = scan.nextInt();
		scan.nextLine();
		return opcao;
	}
}