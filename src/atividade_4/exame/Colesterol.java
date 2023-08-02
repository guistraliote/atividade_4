package atividade_4.exame;

import atividade_4.paciente.Paciente;

public class Colesterol extends Exame {

    private Double valorHDL;
    private Double valorLDL;
    private Paciente paciente;

    public Colesterol(Double valorHDL, Double valorLDL, Paciente paciente) {
        setNome("Colesterol");
        this.valorHDL = valorHDL;
        this.valorLDL = valorLDL;
        this.paciente = paciente;
    }

    public Double getValorHDL() {
        return valorHDL;
    }

    public void setValorHDL(Double valorHDL) {
        this.valorHDL = valorHDL;
    }

    public Double getValorLDL() {
        return valorLDL;
    }

    public void setValorLDL(Double valorLDL) {
        this.valorLDL = valorLDL;
    }

    @Override
    public void validarExame() {
        validarHDL();
        validarLDL();
    }

    private void validarHDL() {
        int idade = paciente.getIdade();
        if (idade <= 19 && valorHDL > 45) {
            System.out.println("Resultado HDL: " + valorHDL + " - De 0 a 19 anos: superior a 45 mg/dL (HDL - BOM)");
        } else if (idade > 19 && valorHDL > 40) {
            System.out.println("Resultado HDL: " + valorHDL + " - Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)");
        } else {
            System.out.println("Resultado HDL: " + valorHDL + " - Fora dos valores de referência");
        }
    }

    private void validarLDL() {
        if (valorLDL < 100) {
            System.out.println("Resultado LDL: " + valorLDL + " - Risco baixo (abaixo de 100 mg/dL)");
        } else if (valorLDL < 70) {
            System.out.println("Resultado LDL: " + valorLDL + " - Risco médio (abaixo de 70 mg/dL)");
        } else if (valorLDL < 50) {
            System.out.println("Resultado LDL: " + valorLDL + " - Risco alto (abaixo de 50 mg/dL)");
        } else {
            System.out.println("Resultado LDL: " + valorLDL + " - Fora dos valores de referência");
        }
    }
}
