package atividade_4.exame;

public abstract class Exame {

    private String nome;
    private Double valor;

    public Exame() {
    }

    public Exame(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public abstract void validarExame();
}