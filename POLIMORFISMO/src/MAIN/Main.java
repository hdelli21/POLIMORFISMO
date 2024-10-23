package MAIN;

import Pessoas.ALUNO;
import Pessoas.PROFESSOR;

public class Main {
    public static void main(String[] args) {
        // Criando um professor e enviando email
        PROFESSOR professor = new PROFESSOR ("Alan Turing", "Prof.");
        professor.mensagem("Sua aula foi agendada para amanhã.");

        // Criando um aluno e enviando email
        ALUNO aluno = new ALUNO ("Joseph");
        aluno.mensagem("Seu trabalho foi corrigido.");
    }
}
