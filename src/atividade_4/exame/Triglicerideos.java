package atividade_4.exame;

import atividade_4.paciente.Paciente;

public class Triglicerideos extends Exame {

    private Double valor;
    private Paciente paciente;

    public Triglicerideos(Double valor, Paciente paciente) {
        setNome("Triglicerídeos");
        this.valor = valor;
        this.paciente = paciente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public void validarExame() {
    	int idade = paciente.getIdade();
        if (idade >= 0 && idade <= 9 && valor < 75) {
            System.out.println("Resultado Triglicerídeos: " + valor + " - De 0 a 9 anos com jejum: inferior a 75 mg/dL");
        } else if (idade >= 10 && idade <= 19 && valor < 90) {
            System.out.println("Resultado Triglicerídeos: " + valor + " - De 10 a 19 anos com jejum: inferior a 90 mg/dL");
        } else if (idade >= 20 && valor < 150) {
            System.out.println("Resultado Triglicerídeos: " + valor + " - Acima de 20 anos com jejum: inferior a 150 mg/dL");
        } else {
            System.out.println("Resultado Triglicerídeos: " + valor + " - Fora dos valores de referência");
        }
    }
}
