package atividade_4.paciente;

import java.time.LocalDate;
import java.time.Period;

public class Paciente {

    private String nome;
    private LocalDate anoNascimento;
    private String tipoSangue;
    private Integer idade;

    public Paciente() {
    }

    public Paciente(String nome, LocalDate anoNascimento, String tipoSangue) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.tipoSangue = tipoSangue;
        this.idade = calcularIdade(anoNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(LocalDate anoNascimento) {
        this.anoNascimento = anoNascimento;
        this.idade = calcularIdade(anoNascimento);
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public Integer getIdade() {
        return idade;
    }

    private int calcularIdade(LocalDate anoNascimento) {
        if (anoNascimento == null) {
            return 0;
        }
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(anoNascimento, dataAtual);
        return periodo.getYears();
    }
}
