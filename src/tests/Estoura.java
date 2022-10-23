package tests;
import vetores.*;

public class Estoura {
    public static void main(String[] args) {
        Vetor vetor = new Vetor();

        for (int i = 0; i < 100001; i++) {
            Aluno aluno = new Aluno();
            vetor.adiciona(aluno);
        }

        System.out.print(vetor.listar());
    }
}
