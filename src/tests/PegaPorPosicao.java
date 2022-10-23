package tests;
import vetores.*;

public class PegaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        a1.setNome("Pedro");
        a2.setNome("Henrique");

        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(a2);

        Aluno aluno1 = lista.pega(0);
        Aluno aluno2 = lista.pega(1);

        System.out.println(aluno1 + "\n" + aluno2);
    }
}
