package atividade_4.paciente;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import atividade_4.exame.Exame;

public class PacienteExame extends Paciente {

    private List<Exame> exames;

    public PacienteExame() {
        exames = new ArrayList<>();
    }

    public PacienteExame(String nome, LocalDate nascimento, String tipoSangue) {
        exames = new ArrayList<>();
        setNome(nome);
        setAnoNascimento(nascimento);
        setTipoSangue(tipoSangue);
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void adicionarExame(Exame exame) {
        exames.add(exame);
    }
}
