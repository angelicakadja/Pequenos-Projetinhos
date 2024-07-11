import java.util.Locale;
import java.util.Scanner;

public class AboutMeInteracaoUsuario {
    public static void main(String[] args) {

        //criando o objeto scanner
        
        try {
            try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
                System.out.println("Digite seu nome");
                String nome = scanner.next();
                
                System.out.println("Digite seu sobrenome");
                String sobrenome = scanner.next();
                
                System.out.println("Digite sua idade");
                int idade = scanner.nextInt();
                
                System.out.println("Digite sua altura");
                double altura = scanner.nextDouble();
                
                //imprimindo os dados obtidos pelo usuario cm exceções de conversões
                System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + " cm ");
            }
        }
        catch (java.util.InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos e o campo altura com ponto");
        }
    }
}
