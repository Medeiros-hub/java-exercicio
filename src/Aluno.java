public class Aluno {
    private Aluno[] alunos = new Aluno[100000];
    private int totalDeAlunos = 0;

    public void adiciona(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                this.alunos[i] = aluno;
                break;
            }
        }
    }

    public void adiciona(int posicao, Aluno aluno) {

    }

    public Aluno pega(int posicao) {
        return this.alunos[posicao];
    }

    public void remove(int posicao) {

    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }

    public int tamanho() {
        return this.totalDeAlunos;
    }
}
