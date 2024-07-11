public class SwitchCase {

    public static void main(String[] args) {
        
        // Criando uma estrutura Switch Case para medida de roupa

        String tamanho = "M";

		switch (tamanho) {
		case "P" -> {
			System.out.println("PEQUENO");
		}
		case "M" -> {
			System.out.println("MÉDIO");
		}
		case "G" -> {
			System.out.println("GRANDE");
		}
		default -> System.out.println("INDEFINIDO");
		}
		
		// Criando uma estrutura Switch Case para Operadora de Telefonia Celular sem o "Break"

		String plano = "M";

		switch (plano) {
			case "T" : {
				System.out.println("5Gb Youtube");
				}
				case "M" : {
					System.out.println("WhatsApp e Instagram grátis");
				}
				case "B" : {
					System.out.println("100 minutos de ligação");
			}
		}
    }
}