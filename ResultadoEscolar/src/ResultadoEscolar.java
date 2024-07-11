public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        int nota = 4;

        if(nota >= 7)
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7)
            System.out.println("Prova de Recuperação");

        else if(nota >= 3 && nota < 5)
            System.out.println("Teste");
        
        else
            System.out.println("Reprovado");
    }
}
