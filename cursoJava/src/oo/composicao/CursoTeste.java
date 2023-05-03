package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Web");
		Curso curso3 = new Curso("React");

		curso1.AdicionarAluno(aluno1);
		curso1.AdicionarAluno(aluno2);

		curso2.AdicionarAluno(aluno1);
		curso2.AdicionarAluno(aluno3);

		aluno1.AdicionarCurso(curso3);
		aluno1.AdicionarCurso(curso3);
		aluno1.AdicionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matriculado no curso " + curso1.nome + ", sou o aluno: " + aluno.nome);
//			System.out.println("Estou matriculado no curso " + curso1.nome);
//			System.out.println("E sou o aluno: " + aluno.nome);
			System.out.println();
		}

		Curso cursoEncontrado = aluno1.ObterCursoPorNome("JAVA");

		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}
}
