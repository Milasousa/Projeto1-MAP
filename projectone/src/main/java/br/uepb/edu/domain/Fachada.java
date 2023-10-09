package br.uepb.edu.domain;

public class Fachada {
    private Leitor leitor;
	private Emprestimo conta;
    private Livro livro;
    public void fazerEmprestimo(Leitor leitor, Emprestimo conta, Livro livro) throws ClassNotFoundException{
		System.out.printf("Olá, caro leitor(a): %s\n",leitor.getNome());
        System.out.printf("Você escolheu o Livro:",livro.getTitulo());
        AdapterTextJson.Json(livro.getTitulo());
        Emprestimo e = new Emprestimo();
        LinhaDoEmprestimo linhasDoEmprestimo= new LinhaDoEmprestimo();
        e.obterEmprestimo( linhasDoEmprestimo);
	}
}
