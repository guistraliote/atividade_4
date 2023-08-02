package atividade_4.exame;

public class Glicose extends Exame {

    private Double valor;

    public Glicose(Double valor) {
        setNome("Glicose");
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public void validarExame() {
        if (valor < 100) {
            System.out.println("Resultado: " + valor + " - Normoglicemia: Inferior a 100 mg/dL");
        } else if (valor >= 100 && valor < 126) {
            System.out.println("Resultado: " + valor + " - Pré-diabetes: Superior ou igual a 100 mg/dL e inferior a 126 mg/dL");
        } else {
            System.out.println("Resultado: " + valor + " - Diabetes estabelecido: Superior ou igual a 126 mg/dL");
        }
    }
}
