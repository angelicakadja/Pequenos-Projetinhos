public class SistemaMedidaOne {

    public static void main(String[] args) {
        
        // Condicionais encadeadas

        String sigla = "G";

		if("XP".equals(sigla))
			System.out.println("EXTRA PEQUENO");
        else if("P".equals(sigla))
			System.out.println("PEQUENO");
		else if("M".equals(sigla))
			System.out.println("MÉDIO");
		else if("G".equals(sigla))
			System.out.println("GRANDE");
        else if("XG".equals(sigla))
			System.out.println("EXTRA GRANDE");
        else if(sigla == "XXG")
			System.out.println("EXTRA EXTRA GRANDE");
		else
			System.out.println("VERIFICAR INFORMAÇÃO DIGITADA");

    }


}