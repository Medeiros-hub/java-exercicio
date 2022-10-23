package tests;

import vetores.*;

public class RemovePorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Pedro");
        a2.setNome("Henrique");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);

        lista.remove(0);

        System.out.print(lista.listar());
    }
}
