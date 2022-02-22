package model.entities;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

public class Livro {

	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}
	public static class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
		@Override
		public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
			return l1.getValue().getNome().compareTo(l2.getValue().getNome());
		}
	}
}
