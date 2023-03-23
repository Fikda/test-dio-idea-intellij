package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.setName("Zafolate");
        gato.setColor("Malhado");
        gato.setAge("2");
        System.out.print(gato);
    }

}


