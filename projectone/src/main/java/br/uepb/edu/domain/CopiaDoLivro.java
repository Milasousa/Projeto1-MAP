package br.uepb.edu.domain;

import br.uepb.edu.enums.CopiaDoLivroSituacao;
import br.uepb.edu.enums.LiberacaoEmprestimo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CopiaDoLivro extends Livro {
    private int sequencial;
    private Livro livro;
    private CopiaDoLivroSituacao situacao;
    private LiberacaoEmprestimo liberacaoEmprestimo;

    @Override
    public CopiaDoLivro clone() {
        CopiaDoLivro copiadolivro = (CopiaDoLivro)super.clone();
        copiadolivro.setLivro(new Livro(copiadolivro.getTitulo(),copiadolivro.getAutor(), copiadolivro.getAno(),copiadolivro.getIsbn(),copiadolivro.getEditora(),copiadolivro.getTipo()));
        return copiadolivro;
    }
}
