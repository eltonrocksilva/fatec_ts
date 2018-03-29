package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.emprestimo.modelo.Livro;

public class UC06CadastrarLivro {
	static private Livro livro;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		livro = new Livro();
		livro.setIsbn("121121");
		livro.setAutor("Pressman");
		livro.setTitulo("Engenharia de Software");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void CT01UC06CadastrarLivro_com_sucesso() {
		assertEquals("121121", livro.getIsbn());
	}
	@Test(expected=RuntimeException.class)
	public void CT02UC06CadastrarLivro_com_isbn_branco() {
		livro.setIsbn("");
	}
	@Test(expected=RuntimeException.class)
	public void CT03UC06CadastrarLivro_com_isbn_nulo() {
		livro.setIsbn(null);
	}
	@Test
	public void CT04UC06CadastrarLivro_validar_titulo() {
		assertEquals("Engenharia de Software", livro.getTitulo());
	}
	@Test(expected=RuntimeException.class)
	public void CT05UC06CadastrarLivro_com_titulo_branco() {
		livro.setTitulo("");
	}
	@Test(expected=RuntimeException.class)
	public void CT06UC06CadastrarLivro_com_titulo_nulo() {
		livro.setTitulo(null);
	}
	@Test
	public void CT07UC06CadastrarLivro_validar_autor() {
		assertEquals("Pressman", livro.getAutor());
	}
	@Test(expected=RuntimeException.class)
	public void CT08UC06CadastrarLivro_com_autor_branco() {
		livro.setAutor("");
	}
	@Test(expected=RuntimeException.class)
	public void CT09UC06CadastrarLivro_com_autor_nulo() {
		livro.setAutor(null);
	}

}
