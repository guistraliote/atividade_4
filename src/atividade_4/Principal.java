package atividade_4;

import java.time.LocalDate;

import atividade_4.exame.Colesterol;
import atividade_4.exame.Exame;
import atividade_4.exame.Glicose;
import atividade_4.exame.Triglicerideos;
import atividade_4.paciente.PacienteExame;

public class Principal {

	public static void main(String[] args) {

		// Criar um paciente
        LocalDate dataNascimento = LocalDate.of(1990, 7, 15);
        PacienteExame paciente = new PacienteExame("João da Silva", dataNascimento, "A+");

        // Criar exames para o paciente
        Glicose glicose = new Glicose(110.0);
        Triglicerideos triglicerideos = new Triglicerideos(120.0, paciente);
        Colesterol colesterol = new Colesterol(50.0, 90.0, paciente);

        // Adicionar exames ao paciente
        paciente.adicionarExame(glicose);
        paciente.adicionarExame(triglicerideos);
        paciente.adicionarExame(colesterol);

        // Exibir os exames realizados pelo paciente
        System.out.println("Exames realizados pelo paciente " + paciente.getNome()+ "(idade: " + paciente.getIdade() + " anos)" + ":");
        for (Exame exame : paciente.getExames()) {
            System.out.println("Exame: " + exame.getNome());
            exame.validarExame();
            System.out.println("------------");
            
        /*Output:
    	Exames realizados pelo paciente João da Silva(idade: 33 anos):
		Exame: Glicose
		Resultado: 110.0 - Pré-diabetes: Superior ou igual a 100 mg/dL e inferior a 126 mg/dL
		------------
		Exame: Triglicerídeos
		Resultado Triglicerídeos: 120.0 - Acima de 20 anos com jejum: inferior a 150 mg/dL
		------------
		Exame: Colesterol
		Resultado HDL: 50.0 - Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
		Resultado LDL: 90.0 - Risco baixo (abaixo de 100 mg/dL)
		------------
    	*/
        }
	}
}
