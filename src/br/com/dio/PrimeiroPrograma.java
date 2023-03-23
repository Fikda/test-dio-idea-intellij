package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

import java.sql.SQLOutput;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setName("Zafolate");
        gato.setColor("Malhado");
        gato.setAge("2");
        System.out.println(gato);

        Livro livro1 = new Livro("To kill a Mockingbird", 281);
        System.out.println(livro1);
    }

}


