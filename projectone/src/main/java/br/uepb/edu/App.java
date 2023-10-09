package br.uepb.edu;

import java.text.MessageFormat;

import br.uepb.edu.domain.AdapterTextJson;
import br.uepb.edu.domain.Emprestimo;
import br.uepb.edu.domain.Fachada;
import br.uepb.edu.domain.Leitor;
import br.uepb.edu.domain.Livro;
import br.uepb.edu.enums.LeitorTipo;
import br.uepb.edu.enums.LivroTipo;
import br.uepb.edu.interfaces.LeitorInterface;
import br.uepb.edu.interfaces.LivroInterface;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Implementando Factory Method!");
        // Implementando Factory Method
        LeitorInterface leitorInterface = Leitor.criarTipo(LeitorTipo.ALUNO);
        leitorInterface.leitor(new String("Maria"));
        leitorInterface = Leitor.criarTipo(LeitorTipo.PROFESSOR);
        leitorInterface.leitor(new String("Alan Turing"));
        System.out.println();
        LivroInterface livroInterface = (LivroInterface) Livro.criarLivro(LivroTipo.PERIODICO);
        livroInterface.livro(new String("Java como programar-8ed"), "Paul J. Deitel", "2015", "8576055635",
                "Pearson|8ª edição");
        System.out.println();
        System.out.println("Implementando Prototype!");
        Livro livro = new Livro("C-Programação", "Alan Turing", 1500, "00000123", "Inglaterra", LivroTipo.PERIODICO);
        Livro LivroClone = (Livro) livro.clone();
        System.out.println(MessageFormat.format(
                "Foi feito uma copia do livro com os dados: {0}, {1}, {2}, {3}, {4}, {5} .",
                LivroClone.getTitulo(), LivroClone.getAutor(), LivroClone.getAno(), LivroClone.getIsbn(),
                LivroClone.getEditora(), LivroClone.getTipo()));
        System.out.println();
        System.out.println("Implementando Adpater!");
        AdapterTextJson.Json(livro);
        System.out.println();
        System.out.println("Implementando Facade!");
        Fachada facade = new Fachada();
        Leitor leitor = new Leitor("Ada Lovalece", LeitorTipo.PROFESSOR, null);
        Livro livro1 = new Livro("C-Programação", "Alan Turing", 1500, "00000123", "Inglaterra", LivroTipo.PERIODICO);
        Emprestimo emprestimo = new Emprestimo();
        facade.fazerEmprestimo(leitor, emprestimo, livro1);

    }
}
