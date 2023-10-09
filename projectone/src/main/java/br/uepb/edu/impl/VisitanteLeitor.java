package br.uepb.edu.impl;

import br.uepb.edu.interfaces.LeitorInterface;
import java.text.MessageFormat;

public class VisitanteLeitor implements LeitorInterface{

    @Override
    public void leitor(String tipo) {
        System.out.println(MessageFormat.format("Seja Bem-Vindo caro Leitor: {0} , você conseguiu entrar na Biblioteca com Sucesso usando o usuário Visitante.", tipo));
    }
    
}