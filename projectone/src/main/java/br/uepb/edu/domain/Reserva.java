package br.uepb.edu.domain;

import br.uepb.edu.enums.ReservaSituacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reserva {
    private int periodo;
    private ReservaSituacao situacao;   
    private CopiaDoLivro copiaDoLivro;
}
