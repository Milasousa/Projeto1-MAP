package br.uepb.edu.domain;

import java.time.LocalDateTime;
import java.util.List;

import br.uepb.edu.enums.EmprestimoSituacao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Emprestimo {
    private LocalDateTime date;
    private EmprestimoSituacao situacao;
    private List<LinhaDoEmprestimo> linhasDoEmprestimo;

    public Emprestimo() {
    }

    public void obterEmprestimo(LinhaDoEmprestimo linhasDoEmprestimo) {
     LocalDateTime today = LocalDateTime.now();
     System.out.println("O emprestimo do Livro foi efetuado na data: "+today);
     System.out.println("A data de devolução é daqui 15 dias-> na data: "
     + today.plusDays(15));
     linhasDoEmprestimo.setDataPrevistaDevolucao(today);
     linhasDoEmprestimo.setDataRealDevolucao(today);
     setSituacao(situacao.ATIVO);
    }
}
