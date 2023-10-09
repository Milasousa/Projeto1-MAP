package br.uepb.edu.impl;

import br.uepb.edu.interfaces.LivroInterface;

import java.text.MessageFormat;

public class ParadidaticoLivro implements LivroInterface {

    @Override
    public void livro(String titulo, String autor, String  ano, String isbn, String editora) {
        System.out.println(MessageFormat.format(
                "Foi adicionado com sucesso na Biblioteca-> titulo: {0}; autor: {1}; isbn: {2}; editora: {3}. O Livro do tipo Paradidatico foi incluido.",
                titulo, autor, ano, isbn, editora));
    }
}
