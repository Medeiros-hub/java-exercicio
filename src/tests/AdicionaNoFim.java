package tests;

import vetores.*;
public class AdicionaNoFim {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Pedro Henrique");
        a2.setNome("Shaolin matador de porco");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.print(lista.listar() + "\n");
    }
}