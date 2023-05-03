package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

//public interface ProdutoRepository extends CrudRepository<Produto, Integer> { // Interface pro CRUD
//public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> { // Interface pra consulta paginada

public interface ProdutoRepository
		extends CrudRepository<Produto, Integer>, PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	// O spring permite criar esse metodo findByNomeContainingIgnoreCase e
	// o framework ja faz a implementacao, sendo assim, nao precisa escrever mais
	// nada, so definir a variavel correta, nesse caso: nome, que ele ira
	// implementar um metodo de "busca por nome que contem" (findByNomeContaining).
	// Lembrando que o spring segue uma convecao, por isso nao podemos errar o nome,
	// Quando selecionamos findBy ele ira implementar a busca por, e assim segue
	// para outras palavras que estao dentro da convecao do spring. Surreal

	// Alguns exemplos que podem ser usados

//	/*
//	 * findByNomeContaining - Procure por nome que contem
//	 * findByNomeIsContaining  - Procure por nome que contem
//	 * findByNomeContains - Procure por nome que contem
//	 * 
//	 * findByNomeStartsWith - Procure por nome que comeca com
//	 * findByNomeEndsWith - Procure por nome que termina com
//	 * 
//	 * findByNomeNotContaining - Procure por nome que NAO contem
//	 */

	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	// Mesma funcao de cima mas sendo aplicada em JPQL, diferenca que no spring nao
	// precisamos criar nada, o proprio framework faz essa criacao
}
