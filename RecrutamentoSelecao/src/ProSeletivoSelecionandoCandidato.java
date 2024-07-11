import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProSeletivoSelecionandoCandidato {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato (String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
		boolean atendeu=false;
        do {
            atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas<3);

        if(atendeu)
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");

        else
        System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
		
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("O Candidato de n° " + (indice+1) + " é " + candidatos[indice]);
		}

        /* Para imprimir de uma forma abreviada a seleção de candidatos sem o índice poderia ser dessa forma:
         * System.out.println("Forma abreviada de interação com o for each");
         * for (String candidato: candidatos){
         * System.out.println("O candidato selecionado foi " + candidato);
         * }
         */
	}

    static void selecaoCandidatos () {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato, " + candidato + ", solicitou este valor de salário R$ " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.err.println("O candidato, " + candidato + ", foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
   }

    //static void analisarCandidato
}
