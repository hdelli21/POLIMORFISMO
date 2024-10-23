package Pessoas;

public class PROFESSOR extends PESSOA {

    private String titulo;

    public PROFESSOR(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;
    }

    @Override
    public void mensagem(String Mensagem) {
        System.out.println("Olá " + titulo + " " + Nome + "!\n" + Mensagem);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}