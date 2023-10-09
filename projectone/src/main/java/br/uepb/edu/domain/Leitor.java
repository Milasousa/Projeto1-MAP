package br.uepb.edu.domain;

import java.text.MessageFormat;
import java.util.List;

import br.uepb.edu.enums.LeitorTipo;
import br.uepb.edu.impl.AlunoLeitor;
import br.uepb.edu.impl.FuncionarioLeitor;
import br.uepb.edu.impl.ProfessorLeitor;
import br.uepb.edu.impl.VisitanteLeitor;
import br.uepb.edu.interfaces.LeitorInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leitor {
    private String nome;
    private LeitorTipo tipo;
    private List<Reserva> reservas;

    public static LeitorInterface criarTipo(LeitorTipo tipo) throws ClassNotFoundException {
        switch (tipo) {
            case ALUNO:
                return new AlunoLeitor();
            case PROFESSOR:
                return new ProfessorLeitor();
            case FUNCIONARIO:
                return new FuncionarioLeitor();
            case VISITANTE:
                return new VisitanteLeitor();
            default:
                throw new ClassNotFoundException(MessageFormat.format(
                        "{0} Erro, tipo desconhecido.", tipo));
        }

    }

    public String obterDadosDoLeitor() {
        return "Leitor [nome=" + nome + ", tipo=" + tipo + ", reservas=" + reservas + "]";
    }

}
