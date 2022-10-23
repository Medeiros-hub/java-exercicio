package vetores;
public class Vetor {
    private Aluno[] alunos = new Aluno[1000];
    private int totalAlunos = 0;

    
    private void garantaEspaco() {
        if (this.totalAlunos == this.alunos.length) {
            Aluno[] novaArray = new Aluno[this.alunos.length * 2];
            for (int i = 0; i < this.alunos.length; i++) {
                novaArray[i] = this.alunos[i];
        }
            this.alunos = novaArray;
        }
    }

    public void adiciona(Aluno aluno) {
        garantaEspaco();
        this.alunos[this.totalAlunos] = aluno;
        totalAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno) {
        garantaEspaco();
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }    

        for (int i = this.totalAlunos; i < alunos.length; i++) {
            this.alunos[i + 1] = this.alunos[i];
        }
        this.alunos[posicao] = aluno;
        this.totalAlunos++;
    }
    
    public Aluno pega(int posicao) {
        return this.alunos[posicao];
    }

    public void remove(int posicao) {
        if (!this.posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("Posição inválida");
        }    

        for (int i = posicao; i < this.totalAlunos; i++) {
            this.alunos[i] = this.alunos[i + 1];
        }

        this.totalAlunos--;
    }

    public boolean contem(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (aluno == this.alunos[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalAlunos;
    }

    public int tamanho() {
        return this.totalAlunos;
    }

    public String listar() {
        String output = "";
        int i = 0;
        while (i < totalAlunos) {
            output = output + "\n" + alunos[i];
            i++;
        }
        return output;
    }
}
