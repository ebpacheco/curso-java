package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping
//	public @ResponseBody Produto novoProduto(@RequestParam String nome, @RequestParam double preco,
//			@RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//	}

	// Outra maneira de realizar o mesmo codigo de cima é passando como parametro o
	// objeto Produto sem ter que ficar passando todos os atributos do objeto. Pq
	// nesse caso usamos TODOS os parametros
//	@PostMapping
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT }) // Esse metodo serve tanto para o POST quanto
																		// para o PUT, por isso usamos @RequestMapping e
																		// as requisicoes atraves de Chaves{}

	public @ResponseBody Produto salvarProduto(@Valid Produto produto) { // Anotacao @valid vai validar as informacoes
																			// que estao na classe Produto.entities
		produtoRepository.save(produto);
		return produto;
	}

	@GetMapping
	public Iterable<Produto> obterProduto() {
		return produtoRepository.findAll();
	}

	@GetMapping(path = "/{numPagina}/{qtdePagina}") // numPagina = posicao do elemento
													// qtdePagina = quantidade de elementos por pagina
	public Iterable<Produto> obterProdutoPorPagina(@PathVariable int numPagina, @PathVariable int qtdePagina) {
		Pageable page = PageRequest.of(numPagina, qtdePagina);
		return produtoRepository.findAll(page);
	}

	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}

	@GetMapping(path = "/nome/{parteNome}")
	public Iterable<Produto> obterProdutoPorNome(@PathVariable String parteNome) {
//		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
		return produtoRepository.searchByNameLike(parteNome);
	}

//	@PutMapping
//	public Produto alterarProduto(@Valid Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}

	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
