package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.entities.Livro;
import model.entities.Livro.ComparatorNome;

public class ExemploOrdenacaoMap {
	public static void main(String[] args) {

		System.out.println("--\tOrdem Aleat�ria\t--");

		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
				put("Duhigg, Charles", new Livro("O Poder do H�bito", 488));
				put("Harari, Yuval", new Livro("21 li��es para o s�culo 21", 300));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("--\tOrdem Inser��o\t--");

		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
				put("Duhigg, Charles", new Livro("O Poder do H�bito", 488));
				put("Harari, Yuval", new Livro("21 li��es para o s�culo 21", 300));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("--\tOrdem Alfab�tica autores\t--");

		Map<String, Livro> meusLivros2 = new TreeMap<>() {
			{
				put("Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
				put("Duhigg, Charles", new Livro("O Poder do H�bito", 488));
				put("Harari, Yuval", new Livro("21 li��es para o s�culo 21", 300));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

		System.out.println("--\tOrdem Alfab�tica nomes dos livros\t--");

		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for (Map.Entry<String, Livro> livro : meusLivros3)
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
	}

}
