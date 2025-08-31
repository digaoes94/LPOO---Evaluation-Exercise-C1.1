package questao1;

public class Pagina {
	private String titulo, url;
	
	public Pagina(String titulo) {
		this.titulo = titulo;
		this.url = "/" + titulo.replaceAll("\\s", "").toLowerCase();
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return String.format("Título: %s. URL: %s.", titulo, url);
	}	
}