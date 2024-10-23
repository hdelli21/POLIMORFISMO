package Pessoas;

public class ALUNO extends PESSOA {

    public ALUNO() {

    }

    public ALUNO(String Nome) {
        super(Nome);
    }

    @Override
    public void mensagem(String Mensagem) {
        System.out.println("Olá Aluno " + Nome + "!\n" + Mensagem);
    }
}
