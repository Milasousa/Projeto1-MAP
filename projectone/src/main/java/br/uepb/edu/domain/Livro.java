package br.uepb.edu.domain;

import java.text.MessageFormat;

import br.uepb.edu.enums.LivroTipo;
import br.uepb.edu.impl.DidaticoLivro;
import br.uepb.edu.impl.ParadidaticoLivro;
import br.uepb.edu.impl.PeriodicoLivro;
import br.uepb.edu.impl.ReferenciaLivro;
import br.uepb.edu.impl.RevistaLivro;
import br.uepb.edu.interfaces.LivroInterface;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro implements Cloneable  {
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private String editora;
    private LivroTipo tipo;

    public static LivroInterface criarLivro(LivroTipo tipo) throws ClassNotFoundException {
        switch (tipo) {
            case PERIODICO:
                return new PeriodicoLivro();
            case REFERENCIA:
                return new ReferenciaLivro();
            case DIDATICO:
                return new DidaticoLivro();
            case PARADIDATICO:
                return new ParadidaticoLivro();
            case REVISTA:
                return new RevistaLivro();
            default:
                throw new ClassNotFoundException(MessageFormat.format(
                        "{0} Erro, tipo desconhecido.", tipo));
        }

    }

    public Livro clone() {
        try {
            return (Livro)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", isbn=" + isbn + ", editora="
                + editora + ", tipo=" + tipo + "]";
    }

    
}
