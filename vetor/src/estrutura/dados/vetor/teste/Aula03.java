package estrutura.dados.vetor.teste;

import estrutura.dados.vetor.Vetor;

public class Aula03 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(2);

        try {
            vetor.toAdd("element 1");
            vetor.toAdd("element 2");
            vetor.toAdd("element 3");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
