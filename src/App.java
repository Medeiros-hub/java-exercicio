import java.util.*;
public class App {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<String>(1000);
        
        System.out.printf("O atual do array de alunos é: %d", alunos.size());
        System.out.print("\nImplementando alunos...\n");
        for (int i = 0; i < 1000; i++) {
            alunos.add("Aluno " + (i + 1));
        }
        
        System.out.printf("O tamanho atual do array alunos é: %d\n", alunos.size());
        
        
        ArrayList<String> novosAlunos = new ArrayList<String>(1000);
        System.out.printf("\nO tamanho do novo vetor antes a clonagem é: %d\n", novosAlunos.size());

        novosAlunos = (ArrayList)alunos.clone();

        System.out.printf("\nO tamanho do novo vetor após a clonagem é: %d\n", novosAlunos.size());
    }
}
