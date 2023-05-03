package modelo.basico;

public interface Entidade {
	// Essa interface serve para restringir as classes que serão passadas como
	// generics para o DAO. O DAO ira extender essa interface e só sera possivel
	// chamar o DAO se a classe implementar essa interface
}
