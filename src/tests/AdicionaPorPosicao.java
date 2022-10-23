package tests;
import vetores.*;

public class AdicionaPorPosicao {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.setNome("Pedro");
        a2.setNome("Henrique");
        a3.setNome("Medeiros");


        Vetor lista = new Vetor();
        lista.adiciona(a1);
        lista.adiciona(0, a2);
        lista.adiciona(1, a3);

        System.out.print(lista.listar());
    }
}
